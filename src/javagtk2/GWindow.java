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
 * GTK Window class
 * 
 * @author  Mattias Andrée <a href="mailto:maandree@member.fsf.org">maandree@member.fsf.org</a>
 */
public class GWindow extends GComponent
{
    /**
     * Constructor
     */
    public GWindow()
    {
	this(null);
    }
    
    /**
     * Constructor
     * 
     * @param  title  The window's title
     */
    public GWindow(final String title)
    {
	super(__new());
	if (title != null)
	    this.setTitle(title);
    }
    
    /**
     * Native constructor
     * 
     * @return  Memory address
     */
    private static native long __new();
    
    
    
    /**
     * Sets the window's title
     * 
     * @param  title  The window's new title
     */
    public void setTitle(final String title)
    {
	if (title == null)
	    throw new NullPointerException("Trying to set window title to null");
	__setTitle(this.memaddress, title);
    }
    
    /**
     * Gets the window's title
     * 
     * @return  The window's title
     */
    public String getTitle()
    {
	return __getTitle(this.memaddress);
    }
    
    /**
     * Sets the window's title
     * 
     * @param  memaddress  The memory address of the component
     * @param  title       The window's new title
     */
    private static native void __setTitle(long memaddress, String title);
    
    /**
     * Gets the window's title
     * 
     * @param   memaddress  The memory address of the component
     * @return              The window's title
     */
    private static native String __getTitle(long memaddress);
    
    
    /**
     * Sets whether the window is resizable
     * 
     * @param  resizable  Whether the window should be resizable
     */
    public void setResizable(final boolean resizable)
    {
	__setResizable(this.memaddress, resizable);
    }
    
    /**
     * Gets whether the window is resizable
     * 
     * @return  Whether the window is resizable
     */
    public boolean getResizable()
    {
	return __getResizable(this.memaddress);
    }
    
    /**
     * Sets whether the window is resizable
     * 
     * @param  memaddress  The memory address of the component
     * @param  resizable   Whether the window should be resizable
     */
    private static native void __setResizable(long memaddress, boolean resizable);
    
    /**
     * Gets whether the window is resizable
     * 
     * @param   memaddress  The memory address of the component
     * @return              Whether the window is resizable
     */
    private static native boolean __getResizable(long memaddress);
    
    
    // TODO http://developer.gimp.org/api/2.0/gtk/GtkWindow.html#gtk-window-add-accel-group
    // TODO http://developer.gimp.org/api/2.0/gtk/GtkWindow.html#gtk-window-remove-accel-group
    
    
    /**
     * Activates the currently focused component within the window
     * 
     * @return  Whether a component got activated
     */
    public boolean activateFocusedComponent()
    {
	return __activate_focus(this.memaddress);
    }
    
    /**
     * Activates the currently focused component within the window
     * 
     * @param   memaddress  The memory address of the component
     * @return              Whether a component got activated
     */
    private static native boolean __activate_focus(long memaddress);
    
    
    /**
     * Activates the default component for the window
     * 
     * @return  Whether a component got activated
     */
    public boolean activateDefaultComponent()
    {
	return __activate_default(this.memaddress);
    }
    
    /**
     * Activates the default component for the window
     * 
     * @param   memaddress  The memory address of the component
     * @return              Whether a component got activated
     */
    private static native boolean __activate_default(long memaddress);
    
    
    /**
     * Sets whether the window is modal, width prevents interaction with other windows in the same application
     * 
     * @param  modal  Whether the window should be modal
     */
    public void setModal(final boolean modal)
    {
	__setModal(this.memaddress, modal);
    }
    
    /**
     * Gets whether the window is modal
     * 
     * @return  Whether the window is modal
     */
    public boolean getModal()
    {
	return __getModal(this.memaddress);
    }
    
    /**
     * Sets whether the window is modal
     * 
     * @param  memaddress  The memory address of the component
     * @param  modal       Whether the window should be modal
     */
    private static native void __setModal(long memaddress, boolean modal);
    
    /**
     * Gets whether the window is modal
     * 
     * @param   memaddress  The memory address of the component
     * @return              Whether the window is modal
     */
    private static native boolean __getModal(long memaddress);
    
    
    /**
     * Sets the window's opacity
     * 
     * @param  opacity  The window's new opacity
     */
    public void setOpacity(final double opacity)
    {
	__setOpacity(this.memaddress, opacity);
    }
    
    /**
     * Gets the window's opacity
     * 
     * @return  The window's opacity
     */
    public double getOpacity()
    {
	return __getOpacity(this.memaddress);
    }
    
    /**
     * Sets the window's opacity
     * 
     * @param  memaddress  The memory address of the component
     * @param  opacity     The window's new opacity
     */
    private static native void __setOpacity(long memaddress, double opacity);
    
    /**
     * Gets the window's opacity
     * 
     * @param   memaddress  The memory address of the component
     * @return              The window's opacity
     */
    private static native double __getOpacity(long memaddress);
    
}

