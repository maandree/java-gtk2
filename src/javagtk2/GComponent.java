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
 * GTK component class
 * 
 * @author  Mattias Andrée <a href="mailto:maandree@member.fsf.org">maandree@member.fsf.org</a>
 */
public abstract class GComponent
{
    /**
     * Constructor
     * 
     * @param  memaddress  The memory address of the component
     */
    protected GComponent(final long memaddress)
    {
	GComponent.memtable.put(new Long(this.memaddress = memaddress) /* yes, new */, new WeakReference<GComponent>(this));
    }
    
    
    
    /**
     * The memory address of the widget
     */
    protected final long memaddress;
    
    /**
     * Memory address to instance table
     */
    protected static final HashMap<Long, WeakReference<GComponent>> memtable = new HashMap<Long, WeakReference<GComponent>>();
    
    
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void finalize() throws Throwable
    {
	try
	{
	    GComponent.memtable.remove(new Long(this.memaddress)); /* yes, new */
	}
	catch (final Throwable ignore)
	{
	    /* Just for safety, we do not want this to interfere with super being finalize():ed */
	}
	super.finalize();
    }
    
    
    
    /**
     * Sets the component's visibility
     * 
     * @param  visiiblity  {@code true} for visible
     */
    public void setVisible(final boolean visibility)
    {
	this.setVisible(visibility, false);
    }
    
    /**
     * Sets the component's visibility
     * 
     * @param  visibility  {@code true} for visible
     */
    public void setVisible(final boolean visibility, final boolean all)
    {
	__setVisible(this.memaddress, visibility, all);
    }
    
    /**
     * Show or hide the component
     * 
     * @param  memaddress  The memory address of the component
     * @param  visibility  {@code true} for visible
     * @param  all         {@code true} for all
     */
    private static native void __setVisible(long memaddress, boolean visibility, boolean all);
    
    
    /**
     * Sets visible now
     */
    public void showNow()
    {
	__showNow(this.memaddress);
    }
    
    /**
     * Sets visible now
     * 
     * @param  memaddress  The memory address of the component
     */
    private static native void __showNow(long memaddress);
    
}

