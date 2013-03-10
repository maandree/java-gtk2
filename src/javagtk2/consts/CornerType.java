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
 * Specifies which corner a child component should be placed in when packed into a scrolled windows
 * 
 * @author  Mattias Andrée <a href="mailto:maandree@member.fsf.org">maandree@member.fsf.org</a>
 */
public class CornerType
{
    /**
     * Place the scrollbars on the right and bottom of the component (default behaviour)
     */
    public static final int TOP_LEFT = 0;
    
    /**
     * Place the scrollbars on the top and right of the widget
     */
    public static final int BOTTOM_LEFT = 1;
    
    /**
     * Place the scrollbars on the left and bottom of the widget
     */
    public static final int TOP_RIGHT = 2;
    
    /**
     * Place the scrollbars on the top and left of the widget
     */
    public static final int BOTTOM_RIGHT = 3;
    
    
    
    /**
     * Non-constructor
     */
    private CornerType()
    {
	assert false : "You may not create instances of javagtk2.consts.CornerType";
    }
    
}

