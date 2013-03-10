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
 * Used to dictate the style that a button box uses to layout the buttons it contains
 * 
 * @author  Mattias Andrée <a href="mailto:maandree@member.fsf.org">maandree@member.fsf.org</a>
 */
public class ButtonBoxStyle
{
    /**
     * Default packing
     */
    public static final int DEFAULT_STYLE = 0;
    
    /**
     * Buttons are evenly spread across the box
     */
    public static final int SPREAD = 1;
    
    /**
     * Buttons are placed at the edges of the box
     */
    public static final int EDGE = 2;
    
    /**
     * Buttons are grouped towards the start of the box
     */
    public static final int START = 3;
    
    /**
     * Buttons are grouped towards the end of the box
     */
    public static final int END = 4;
    
    /**
     * Buttons are centered in the box
     */
    public static final int CENTER = 5;
    
    
    
    /**
     * Non-constructor
     */
    private ButtonBoxStyle()
    {
	assert false : "You may not create instances of javagtk2.consts.ButtonBoxStyle";
    }
    
}

