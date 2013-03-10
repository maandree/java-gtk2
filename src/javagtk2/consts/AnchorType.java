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
public class AnchorType
{
    public static final int CENTER = 0;
    public static final int NORTH = 1;
    public static final int NORTH_WEST = 2;
    public static final int NORTH_EAST = 3;
    public static final int SOUTH = 4;
    public static final int SOUTH_WEST = 5;
    public static final int SOUTH_EAST = 6;
    public static final int WEST = 7;
    public static final int EAST = 8;
    
    
    
    /**
     * Non-constructor
     */
    private AnchorType()
    {
	assert false : "You may not create instances of javagtk2.consts.AnchorType";
    }
    
}

