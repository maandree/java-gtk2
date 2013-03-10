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
 * Indicates the direction in which an arrow
 * 
 * @author  Mattias Andrée <a href="mailto:maandree@member.fsf.org">maandree@member.fsf.org</a>
 */
public class ArrowType
{
    /**
     * Represents an upward pointing arrow
     */
    public static final int UP = 0;
    
    /**
     * Represents a downward pointing arrow
     */
    public static final int DOWN = 1;
    
    /**
     * Represents a left pointing arrow
     */
    public static final int LEFT = 2;
    
    /**
     * Represents a right pointing arrow
     */
    public static final int RIGHT = 3;
    
    /**
     * No arrow
     */
    public static final int NONE = 4;
    
    
    
    /**
     * Non-constructor
     */
    private ArrowType()
    {
	assert false : "You may not create instances of javagtk2.consts.Arrow";
    }
    
}

