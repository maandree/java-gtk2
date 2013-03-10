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
package javagtk2;


/**
 * GTK popup window class
 * 
 * @author  Mattias Andrée <a href="mailto:maandree@member.fsf.org">maandree@member.fsf.org</a>
 */
public class GPopup extends GWindow
{
    /**
     * Constructor
     */
    public GPopup()
    {
	this(null, null, null);
    }
    
    /**
     * Constructor
     * 
     * @param  title  The popup window's title
     */
    public GPopup(final String title)
    {
	this(title, null, null);
    }
    
    /**
     * Constructor
     * 
     * @param  title  The popup window's title
     * @param  role   The popup window's role
     */
    public GPopup(final String title, final String role)
    {
	this(title, role, null);
    }
    
    /**
     * Constructor
     * 
     * @param  title  The popup window's title
     * @param  role   The popup window's role
     * @param  id     The popup window's startup identifier
     */
    public GPopup(final String title, final String role, final String id)
    {
	super(__new(), title, role, id);
    }
    
    /**
     * Constructor
     * 
     * @param  memaddress  The components memory address
     */
    protected GPopup(final long memaddress)
    {
	this(memaddress, null, null, null);
    }
    
    /**
     * Constructor
     * 
     * @param  memaddress  The components memory address
     * @param  title       The popup window's title
     */
    protected GPopup(final long memaddress, final String title)
    {
	this(memaddress, title, null, null);
    }
    
    /**
     * Constructor
     * 
     * @param  memaddress  The components memory address
     * @param  title       The popup window's title
     * @param  role        The popup window's role
     */
    protected GPopup(final long memaddress, final String title, final String role)
    {
	this(memaddress, title, role, null);
    }
    
    /**
     * Constructor
     * 
     * @param  memaddress  The components memory address
     * @param  title       The popup window's title
     * @param  role        The popup window's role
     * @param  id          The popup window's startup identifier
     */
    protected GPopup(final long memaddress, final String title, final String role, final String id)
    {
	super(memaddress, title, role, id);
    }
    
    /**
     * Native constructor
     * 
     * @return  Memory address
     */
    private static native long __new();
    
}

