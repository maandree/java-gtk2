#!/usr/bin/env python3
# java-gtk2 – GTK+ 2.0 bindings for Java
# 
# Copyright © 2013  Mattias Andrée (maandree@member.fsf.org)
# 
# This program is free software: you can redistribute it and/or modify
# it under the terms of the GNU General Public License as published by
# the Free Software Foundation, either version 3 of the License, or
# (at your option) any later version.
# 
# This program is distributed in the hope that it will be useful,
# but WITHOUT ANY WARRANTY; without even the implied warranty of
# MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
# GNU General Public License for more details.
# 
# You should have received a copy of the GNU General Public License
# along with this program.  If not, see <http://www.gnu.org/licenses/>.

import sys

for filename in sys.argv[1:]:
    lines = None
    with open(filename, 'rb') as file:
        lines = file.read().decode('utf-8', 'replace').split('\n')
    begun = False
    prefix = []
    package = None
    author = []
    includes = []
    jclass = None
    cclass = None
    extends = None
    methods = []
    
    for line in lines:
        if not begun:
            if line.startswith('package '):
                begun = True
                package = line
            else:
                prefix.append(line)
        elif len(line) == 0:
            pass
        elif line.startswith('#'):
            pass # comment
        elif line.startswith('include '):
            include.append('#' + line)
        elif line.startswith('@author '):
            author.append(' * ' + line)
        elif line.startswith('class '):
            line = line[6:].replace('-->', ':').replace(' ', '')
            (jclass, extends, cclass) = line.split(':')
        else:
            while '  ' in line:
                line = line.replace('  ', ' ')
            static = line.startswith('static ')
            if static:
                line = line[7:]
            line = line.replace(')', '')
            line = line.split('(')
            returntype = line[0].split(' ')[0]
            (left, right) = (''.join(line[0].split(' ')[1:]).replace(' ', ''), line[1])
            while ', ' in right:
                right = right.replace(', ', ',')
            while ' @' in right:
                right = right.replace(' @', '@')
            while ' =' in right:
                right = right.replace(' =', '=')
            while '  ' in right:
                right = right.replace('= ', '=')
            right = right.replace('@=', ' @=').replace('=', ' = ').replace('@ =', '@=')
            (left, right) = (left.split(':'), right.split(','))
            methods.append((static, returntype, left, [r.split(' ') for r in right]))
    
    javaout = prefix + [package, '', '', '/**'] + author + [' */']
    cout = prefix + ['#include "%s.h"' % jclass, ''] + includes + ['', '']
    javaout.append('public class %s extends %s' % (jclass, extends))
    javaout.append('{')
    javaout.append('    protected %s(long memaddress)' % jclass)
    javaout.append('    {')
    javaout.append('        super(memaddress);')
    javaout.append('    }')
    javaout.append('    ')
    javaout.append('    ')
    
    for (static, returntype, method, params) in methods:
        if len(method) == 1:
            method = [method, method]
        new = returntype == 'new'
        if new and not static:
            ps = []
            for p in params:
                if len(p) == 2:
                    ps.append(' '.join(p))
                elif p[2] == '=':
                    
            javaout.append('    public %s(%s)' % (jclass, ', '.join(ps)))
            javaout.append('    {')
            javaout.append('        __%s(%s);' % (method, ', '.join([p[1] for p in ps])))
            javaout.append('    }')
            javaout.append('    ')
            javaout.append('    ')
        else:
            if new:
                returntype = jclass + ':' + cclass
            def _j(value):
                v = value[0]
                if ':' in v:
                    return [v.split(':')[0], value[1] '.memaddress']
                elif (v == 'void') or (v == 'return'):
                    return ['', '']
                return [v, value[1]]
            def _n(value):
                v = value[0]
                if ':' in v:
                    v = 'long'
                elif (v == 'void') or (v == 'return'):
                    return ['', '']
                return [v, value[1]]
            p = [(' '.join(_j(p) if len(p) == 2 else '') for p in params]
            p = ', '.join(p)
            while '  ' in p:
                p = p.replace('  ', ' ')
            while ', , ' in p:
                p = p.replace(', , ', ', ')
            r = returntype.split(':')[0]
            javaout.append('    public%s %s %s(%s)' % (' static' if static else '', r, method[0], p))
            if not static:
                params = ['long', 'this.memaddress'] + params
            p = [(_j(p)[1] if len(p) == 2 else '') for p in params]
            p = ', '.join(p)
            while '  ' in p:
                p = p.replace('  ', ' ')
            while ', , ' in p:
                p = p.replace(', , ', ', ')
            javaout.append('    {')
            if new:
                javaout.append('        return new %s(__%s(%s));' % (jclass, method[0], p))
            elif returntype == 'void':
                javaout.append('        __%s(%s);' % (method[0], p))
            elif ':' in returntype:
                javaout.append('        return GComponent.memtable.get(new Long(__%s(%s))).get();' % (method[0], p))
            else:
                javaout.append('        return __%s(%s);' % (method[0], p))
            javaout.append('    }')
            javaout.append('    ')
            r = 'long' if ':' in returntype else returntype
            p = [(' '.join(_n(p)) if len(p) == 2 else '') for p in params]
            p = ', '.join(p)
            while '  ' in p:
                p = p.replace('  ', ' ')
            while ', , ' in p:
                p = p.replace(', , ', ', ')
            javaout.append('    private static native %s __%s(%s);' % (r, method[0], p.replace('this.', '')))
        javaout.append('    ')
        javaout.append('    ')
    
    javaout = '\n'.join(javaout) + '}\n\n'
    cout = '\n'.join(cout) + '\n\n'
    outbase = '.'.join(filename.split('.')[:-1]) + '.'
    with open(outbase + 'java', 'wb') as file:
        file.write(javaout.encode('utf-8'))
    with open(outbase + 'c', 'wb') as file:
        file.write(cout.encode('utf-8'))

