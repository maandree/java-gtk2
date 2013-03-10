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
 * GTK split pane class, a container for two components than can be resized while keeping the combined area
 * 
 * @author  Mattias Andrée <a href="mailto:maandree@member.fsf.org">maandree@member.fsf.org</a>
 */
public abstract class GSplitPane extends GContainer
{
    /**
     * Constructor
     * 
     * @param  memaddress  The memory address of the component
     */
    protected GSplitPane(final long memaddress)
    {
        super(memaddress);
    }
    
    
    
    /**
     * Gets the component's first child
     * 
     * @return  The component's first child
     */
    public GComponent getChild1()
    {
	final long address = __getChild1(this.memaddress);
	if (address == 0)
	    return null;
	final WeakReference<GComponent> ref = GComponent.memtable.get(new Long(address)); /* yes, new*/
	return ref == null ? null : ref.get();
    }
    
    /**
     * Gets the component's second child
     * 
     * @return  The component's second child
     */
    public GComponent getChild2()
    {
	final long address = __getChild2(this.memaddress);
	if (address == 0)
	    return null;
	final WeakReference<GComponent> ref = GComponent.memtable.get(new Long(address)); /* yes, new*/
	return ref == null ? null : ref.get();
    }
    
    /**
     * Gets the component's first child
     * 
     * @param   memaddress  The memory address of the component
     * @return              The component's first child memory address
     */
    private static native long __getChild1(long memaddress);
    
    /**
     * Gets the component's second child
     * 
     * @param   memaddress  The memory address of the component
     * @return              The component's second child memory address
     */
    private static native long __getChild2(long memaddress);
    
    
    /**
     * Adds a child to the first slot
     * 
     * @param  child  The child to add
     */
    public void add1(final GComponent child)
    {
	__pack1(this.memaddress, child.memaddress, true, true);
    }
    
    /**
     * Adds a child to the second slot
     * 
     * @param  child  The child to add
     */
    public void add2(final GComponent child)
    {
	__pack2(this.memaddress, child.memaddress, true, true);
    }
    
    /**
     * Adds a child to the first slot
     * 
     * @param  child   The child to add
     * @param  resize  Should this child expand when the paned widget is resized
     * @param  shrink  Can this child be made smaller than its requisition
     */
    public void add1(final GComponent child, final boolean resize, final boolean shrink)
    {
	__pack1(this.memaddress, child.memaddress, resize, shrink);
    }
    
    /**
     * Adds a child to the second slot
     * 
     * @param  child   The child to add
     * @param  resize  Should this child expand when the paned widget is resized
     * @param  shrink  Can this child be made smaller than its requisition
     */
    public void add2(final GComponent child, final boolean resize, final boolean shrink)
    {
	__pack2(this.memaddress, child.memaddress, resize, shrink);
    }
    
    /**
     * Adds a child to the first slot
     * 
     * @param  memaddress    The memory address of the component
     * @param  childaddress  The memory address of the child to add
     * @param  resize        Should this child expand when the paned widget is resized
     * @param  shrink        Can this child be made smaller than its requisition
     */
    private static native void __pack1(long memaddress, long childaddress, boolean resize, boolean shrink);
    
    /**
     * Adds a child to the second slot
     * 
     * @param  memaddress    The memory address of the component
     * @param  childaddress  The memory address of the child to add
     * @param  resize        Should this child expand when the paned widget is resized
     * @param  shrink        Can this child be made smaller than its requisition
     */
    private static native void __pack2(long memaddress, long childaddress, boolean resize, boolean shrink);
    
    
    /**
     * Sets the position of the divider between the two panes
     * 
     * @param  location  The position of the divider between the two panes, negative for unset
     */
    public void setDividerLocation(final int location)
    {
	__setPosition(this.memaddress, location);
    }
    
    /**
     * Gets the position of the divider between the two panes
     * 
     * @return  The position of the divider between the two panes, negative for unset
     */
    public int getDividerLocation()
    {
	return __getPosition(this.memaddress);
    }
    
    /**
     * Sets the position of the divider between the two panes
     * 
     * @param  memaddress  The memory address of the component
     * @param  location    The position of the divider between the two panes, negative for unset
     */
    private static native void __setPosition(long memaddress, int location);
    
    /**
     * Gets the position of the divider between the two panes
     * 
     * @param   memaddress  The memory address of the component
     * @return              The position of the divider between the two panes, negative for unset
     */
    private static native int __getPosition(long memaddress);
    
}

