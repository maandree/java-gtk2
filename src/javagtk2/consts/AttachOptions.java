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
 * Denotes the expansion properties that a component will have when it, or its parent, is resized
 * 
 * @author  Mattias Andrée <a href="mailto:maandree@member.fsf.org">maandree@member.fsf.org</a>
 */
public class AttachOption
{
    /**
     * The component should expand to take up any extra space in its container that has been allocated
     */
    public static final int EXPAND = 1 << 0;
    
    /**
     * The component should shrink as and when possible
     */
    public static final int SHRINK = 1 << 1;
    
    /**
     * The component should fill the space allocated to it
     */
    public static final int FILL = 1 << 2;
    
    
    
    /**
     * Non-constructor
     */
    private AttachOption()
    {
	assert false : "You may not create instances of javagtk2.consts.AttachOption";
    }
    
}

