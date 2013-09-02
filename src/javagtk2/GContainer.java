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

import java.util.*;
import java.lang.ref.*;


/**
 * GTK container class
 * 
 * @author  Mattias Andrée <a href="mailto:maandree@member.fsf.org">maandree@member.fsf.org</a>
 */
public abstract class GContainer extends GComponent
{
    /**
     * Constructor
     * 
     * @param  memaddress  The memory address of the component
     */
    protected GContainer(final long memaddress)
    {
        super(memaddress);
    }
    
    
    
    /**
     * Add a component to the container
     * 
     * @param  component  The component to add
     */
    public void add(GComponent component)
    {
	__add(this.memaddress, component.memaddress);
    }
    
    /**
     * Remove a component from the container
     * 
     * @param  component  The component to remove
     */
    public void remove(GComponent component)
    {
	__remove(this.memaddress, component.memaddress);
    }
    
    
    /**
     * Add a component to a container
     * 
     * @param  container  The memory address of the container
     * @param  component  The memory address of the component to add
     */
    private static native void __add(long container, long component);
    
    /**
     * Remove a component from a container
     * 
     * @param  container  The memory address of the container
     * @param  component  The memory address of the component to remove
     */
    private static native void __remove(long container, long component);
    
    
    
    // TODO http://developer.gimp.org/api/2.0/gtk/GtkContainer.html
    
}

