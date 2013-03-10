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
 * GTK bin class, a container that only contains one component
 * 
 * @author  Mattias Andrée <a href="mailto:maandree@member.fsf.org">maandree@member.fsf.org</a>
 */
public abstract class GBin extends GComponent
{
    /**
     * Constructor
     * 
     * @param  memaddress  The memory address of the component
     */
    protected GBin(final long memaddress)
    {
        super(memaddress);
    }
    
    
    
    /**
     * Gets the component's child
     * 
     * @return  The component's child
     */
    public GComponent getChild()
    {
	final long address = __getChild(this.memaddress);
	if (address == 0)
	    return null;
	final WeakReference<GComponent> ref = GComponent.memtable.get(new Long(address)); /* yes, new*/
	return ref == null ? null : ref.get();
    }
    
    /**
     * Gets the component's child
     * 
     * @param   memaddress  The memory address of the component
     * @return              The component's child memory address
     */
    private static native long __getChild(long memaddress);
    
}

