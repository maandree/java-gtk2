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
 * GTK vertical split pane class
 * 
 * @author  Mattias Andrée <a href="mailto:maandree@member.fsf.org">maandree@member.fsf.org</a>
 */
public abstract class GVSplitPane extends GSplitPane
{
    /**
     * Constructor
     */
    public GVSplitPane()
    {
        this(__new());
    }
    
    /**
     * Constructor
     * 
     * @param  memaddress  The memory address of the component
     */
    protected GVSplitPane(final long memaddress)
    {
        super(memaddress);
    }
    
    /**
     * Native constructor
     */
    private static native long __new();
    
    
    
    /**
     * Gets the component's upper child
     * 
     * @return  The component's upper child
     */
    public GComponent getUpper()
    {
	return super.getChild1();
    }
    
    /**
     * Gets the component's lower child
     * 
     * @return  The component's lower child
     */
    public GComponent getLower()
    {
	return super.getChild2();
    }
    
    
    /**
     * Adds a child to the upper slot
     * 
     * @param  child  The child to add
     */
    public void addUpper(final GComponent child)
    {
	super.add1(child);
    }
    
    /**
     * Adds a child to the lower slot
     * 
     * @param  child  The child to add
     */
    public void addLower(final GComponent child)
    {
	super.add2(child);
    }
    
    /**
     * Adds a child to the upper slot
     * 
     * @param  child   The child to add
     * @param  resize  Should this child expand when the paned widget is resized
     * @param  shrink  Can this child be made smaller than its requisition
     */
    public void addUpper(final GComponent child, final boolean resize, final boolean shrink)
    {
	super.add1(child, resize, shrink);
    }
    
    /**
     * Adds a child to the lower slot
     * 
     * @param  child   The child to add
     * @param  resize  Should this child expand when the paned widget is resized
     * @param  shrink  Can this child be made smaller than its requisition
     */
    public void addLower(final GComponent child, final boolean resize, final boolean shrink)
    {
	super.add2(child, resize, shrink);
    }
    
}

