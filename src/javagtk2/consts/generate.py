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
    with open(filename, 'rb') as file:
        begun = False
        prefix = []
        author = []
        comment = None
        autovalue = '0'
        items = []
        classinfo = None
        for line in file.read().decode('utf-8', 'replace').split('\n') + [None]:
            if not begun:
                prefix.append(line)
                if line.startswith('package '):
                    begun = True
            elif (line is None) or (len(line) > 0):
                if (line is not None) and line.startswith('@author '):
                    author.append(' * ' + line)
                elif (line is not None) and line.startswith('#'):
                    comment = ' * ' + line[1:]
                elif (line is None) or line.startswith('enum '):
                    if classinfo is not None:
                        data = '\n'.join(prefix) + '\n\n\n'
                        if (comment is not None) or (len(author) > 0):
                            data += '/**\n'
                            if comment is not None:
                                data += comment + '\n'
                                if len(author) > 0:
                                    data += ' * \n'
                            if len(author) > 0:
                                data += '\n'.join(author) + '\n'
                            data += ' */\n'
                        data += 'public class %s\n{\n' % classinfo[0]
                        for item in items:
                            if item[2] is not None:
                                data += '    /**\n    %s\n     */\n' % item[2]
                            data += '    public static final int %s = %s;\n    \n' % (item[0], item[1])
                        data += '    \n    \n    /**\n     * Non-constructor\n     */\n'
                        data += '    private %s()\n    {\n' % classinfo[0]
                        data += '        assert false : "You are not meant to create instances of constant classes";\n'
                        data += '    }\n    \n'
                        data += '}\n\n'
                        with open('%s.java' % classinfo[0], 'wb') as cfile:
                            cfile.write(data.encode('utf-8'))
                            cfile.flush()
                    if line is not None:
                        autovalue = '0'
                        items = []
                        classinfo = (line[5:], comment, author)
                else:
                    valuename = line
                    value = autovalue
                    if '=' in line:
                        valuename = line[:line.find('=')]
                        while valuename.endswith(' '):
                            valuename = valuename[:-1]
                        value = line[line.find('=') + 1:]
                        while value.startswith(' '):
                            value = value[1:]
                    temp = value
                    for c in '0123456789':
                        temp = temp.replace(c, '')
                    if len(temp) > 0:
                        autovalue = '(%s) + 1' % autovalue
                    else:
                        autovalue = str(int(value) + 1)
                    items.append((valuename, value, comment))
                if (line is not None) and not line.startswith('#'):
                    comment = None

