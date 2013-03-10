/**
 * java-gtk2 – GTK+ 2.0 bindings for Java
 * 
 * Copyright © 2013  Mattias Andrée (maandree@member.fsf.org)
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package javagtk2.consts;


/**
 * TODO This is not documented in the GTK+ reference manual
 * 
 * @author  Mattias Andrée <a href="mailto:maandree@member.fsf.org">maandree@member.fsf.org</a>
 */
public class CurveType
{
    /**
     * Linear interpolation
     */
    public static final int LINEAR = 0;
    
    /**
     * Spline interpolation
     */
    public static final int SPLINE = 1;
    
    /**
     * Free form curve
     */
    public static final int FREE = 2;
    
    
    
    /**
     * Non-constructor
     */
    private CurveType()
    {
	assert false : "You may not create instances of javagtk2.consts.CurveType";
    }
    
}

