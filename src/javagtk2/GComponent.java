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
    public GComponent(final long memaddress)
    {
	this.memaddress = memaddress;
    }
    
    
    
    /**
     * The memory address of the widget
     */
    protected final long memaddress;
    
    
    
    /**
     * Set the component's visibility
     * 
     * @param  visiblity  {@code true} for visible
     */
    public void setVisible(final boolean visiblity)
    {
	this.setVisible(visiblity, false);
    }
    
    /**
     * Set the component's visibility
     * 
     * @param  visiblity  {@code true} for visible
     */
    public void setVisible(final boolean visiblity, final boolean all)
    {
	__setVisible(this.memaddress, visiblity, all);
    }
    
    /**
     * Show or hide the component
     * 
     * @param  memaddress  The memory address of the component
     * @param  visiblity   {@code true} for visible
     * @param  all         {@code true} for all
     */
    private static native void __setVisible(long memaddress, boolean visiblity, boolean all);
    
    
    /**
     * Set visible now
     */
    public void showNow()
    {
	__showNow(this.memaddress);
    }
    
    /**
     * Set visible now
     * 
     * @param  memaddress  The memory address of the component
     */
    private static native void __showNow(long memaddress);
    
}

