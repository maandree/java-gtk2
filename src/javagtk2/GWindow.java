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
	super(__new());
    }
    
    /**
     * Native constructor
     * 
     * @return  Memory address
     */
    private static native long __new();
    
    
    
    /**
     * Set the window's opacity
     * 
     * @param  opacity  The window's new opacity
     */
    public void setOpacity(final double opacity)
    {
	__setOpacity(this.memaddress, opacity);
    }
    
    /**
     * Get the window's opacity
     * 
     * @return  The window's opacity
     */
    public double getOpacity()
    {
	return __getOpacity(this.memaddress);
    }
    
    /**
     * Set the window's opacity
     * 
     * @param  memaddress  The memory address of the component
     * @param  opacity     The window's new opacity
     */
    private static native void __setOpacity(long memaddress, double opacity);
    
    /**
     * Get the window's opacity
     * 
     * @param   memaddress  The memory address of the component
     * @return              The window's opacity
     */
    private static native double __getOpacity(long memaddress);
    
}

