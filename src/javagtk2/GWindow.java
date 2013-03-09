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

import java.awt.*;
import java.lang.ref.*;


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
     * The default component
     */
    private WeakReference<GComponent> defaultComponent;
    
    
    
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
     * Sets the window's preferred size
     * 
     * @param  size  The window's new preferred size, {@code -1} dimensions are unsets
     */
    private void setPreferredSize(final Dimension size)
    {
	setPreferredSize(size.width, size.height);
    }
    
    /**
     * Sets the window's preferred size
     * 
     * @param  width   The window's new preferred width, {@code -1} for unset
     * @param  height  The window's new preferred height, {@code -1} for unset
     */
    private void setPreferredSize(final int width, final int height)
    {
	__setDefaultSize(this.memaddress, width, height)
    }
    
    /**
     * Sets the window's preferred size
     * 
     * @param  memaddress  The memory address of the component
     * @param  width       The window's new preferred width
     * @param  height      The window's new preferred height
     */
    private static native void __setDefaultSize(long memaddress, int width, int height);
    
    
    // TODO http://developer.gimp.org/api/2.0/gtk/GtkWindow.html#gtk-window-set-geometry-hints
    // TODO http://developer.gimp.org/api/2.0/gtk/GtkWindow.html#gtk-window-set-gravity
    // TODO http://developer.gimp.org/api/2.0/gtk/GtkWindow.html#gtk-window-get-gravity
    // TODO http://developer.gimp.org/api/2.0/gtk/GtkWindow.html#gtk-window-set-position
    
    
    /**
     * Sets the window for which the window is transient, that is, the parent window keeped beneath this window
     * 
     * @param  parent  The window for which the window is transient
     */
    public void setTransientFor(final GWindow parent)
    {
	__setTransientFor(this.memaddress, parent == null ? 0 : parent.memaddress);
    }
    
    /**
     * Gets the window, if any, for which the window is transient
     * 
     * @return  The window, if any, for which the window is transient
     */
    public GWindow getTransientFor()
    {
	final long address = __getTransientFor(this.memaddress);
	if (address == 0)
	    return null;
	final WeakReference<GComponent> ref = GComponent.memtable.get(new Long(address)); /* yes, new*/
	final GComponent parent;
	if ((ref == null) || ((parent = ref.get()) == null) || (parent instanceof GWindow == false))
	    return null;
	return (GWindow)parent;
    }
    
    /**
     * Sets the window for which the window is transient
     * 
     * @param  memaddress  The memory address of the component
     * @param  parent      The memory address of the window for which the window is transient
     */
    private static native void __setTransientFor(long memaddress, long parent);
    
    /**
     * Gets the window, if any, for which the window is transient
     * 
     * @param   memaddress  The memory address of the component
     * @return              The window, if any, for which the window is transient
     */
    private static native long __getTransientFor(long memaddress);
    
    
    // TODO http://developer.gimp.org/api/2.0/gtk/GtkWindow.html#gtk-window-set-destroy-with-parent
    // TODO http://developer.gimp.org/api/2.0/gtk/GtkWindow.html#gtk-window-set-screen
    // TODO http://developer.gimp.org/api/2.0/gtk/GtkWindow.html#gtk-window-get-screen
    
    
    /**
     * Returns whether the window is part of the current active toplevel
     * 
     * @return  Whether the window is part of the current active toplevel
     */
    public boolean isActive()
    {
	return __isActive(this.memaddress);
    }
    
    /**
     * Returns whether the window is part of the current active toplevel
     * 
     * @param   memaddress  The memory address of the component
     * @return              Whether the window is part of the current active toplevel
     */
    private static native boolean __isActive(long memaddress);
    
    
    /**
     * Returns whether the input focus is within this window
     * 
     * @return  Whether the input focus is within this window
     */
    public boolean hasToplevelFocus()
    {
	return __hasToplevelFocus(this.memaddress);
    }
    
    /**
     * Returns whether the input focus is within this window
     * 
     * @param   memaddress  The memory address of the component
     * @return              Whether the input focus is within this window
     */
    private static native boolean __hasToplevelFocus(long memaddress);
    
    
    // TODO http://developer.gimp.org/api/2.0/gtk/GtkWindow.html#gtk-window-list-toplevels
    
    
    /**
     * Adds a mnemonic to this window
     * 
     * @param  keyvalue  The mnemonic
     * @param  target    The component that gets activated by the mnemonic
     */
    public void addMnemonic(final int keyvalue, final GComponent target)
    {
	__addMnemonic(this.memaddress, keybalue, target.memaddress);
    }
    
    /**
     * Removes a mnemonic to this window
     * 
     * @param  keyvalue  The mnemonic
     * @param  target    The component that gets activated by the mnemonic
     */
    public void removeMnemonic(final int keyvalue, final GComponent target)
    {
	__removeMnemonic(this.memaddress, keybalue, target.memaddress);
    }
    
    /**
     * Adds a mnemonic to this window
     * 
     * @param  memaddress  The memory address of the component
     * @param  keyvalue    The mnemonic
     * @param  target      The memory address of the component that gets activated by the mnemonic
     */
    private static native void __addMnemonic(long memaddress, int keyvalue, long targetaddress);
    
    /**
     * Removes a mnemonic to this window
     * 
     * @param  memaddress  The memory address of the component
     * @param  keyvalue    The mnemonic
     * @param  target      The memory address of the component that gets activated by the mnemonic
     */
    private static native void __removeMnemonic(long memaddress, int keyvalue, long targetaddress);
    
    
    // TODO http://developer.gimp.org/api/2.0/gtk/GtkWindow.html#gtk-window-mnemonic-activate
    // TODO http://developer.gimp.org/api/2.0/gtk/GtkWindow.html#gtk-window-activate-key
    // TODO http://developer.gimp.org/api/2.0/gtk/GtkWindow.html#gtk-window-propagate-key-event
    
    
    /**
     * Gets the currently focused component within the window
     * 
     * @return  The currently focused component within the window
     */
    public GComponent getFocus()
    {
	long address = __getFocus(this.memaddress);
	if (address == 0)
	    return 0;
	final WeakReference<GComponent> ref = GComponent.memtable.get(new Long(address)); /* yes, new*/
	return ref == null ? null : ref.get();
    }
    
    /**
     * Sets the currently focused component within the window
     * 
     * @param  focus  The currently focused component within the window
     */
    public void setFocus(final GComponent focus)
    {
	__setFocus(this.memaddress, focus == null ? 0 : focus.memaddress);
    }
    
    /**
     * Gets the currently focused component within the window
     * 
     * @param   memaddress  The memory address of the component
     * @return              The memory address of the currently focused component within the window
     */
    private static native long __getFocus(long memaddress);
    
    /**
     * Sets the currently focused component within the window
     * 
     * @param  memaddress  The memory address of the component
     * @param  focus       The memory address of the  currently focused component within the window
     */
    private static native void __setFocus(long memaddress, long focusaddress);
    
    
    /**
     * Sets the default component, that is, the component that is activated when the user presses Enter
     * 
     * @param  component  The new default component
     */
    public void setDefault(final GComponent component)
    {
	this.defaultComponent = component == null ? null : new WeakReference<GComponent>(component);
	__setDefault(this.memaddress, component == null ? 0 : component.memaddress);
    }
    
    /**
     * Gets the default component
     * 
     * @return  The default component
     */
    public GComponent getDefault(final GComponent component)
    {
	if (this.defaultComponent == null)
	    return null;
	return this.defaultComponent.get();
    }
    
    /**
     * Sets the default component
     * 
     * @param  memaddress      The memory address of the component
     * @param  defaultaddress  The new default component's memory address
     */
    private static native void __setDefault(long memaddress, long defaultaddress);
    
    
    /**
     * Deiconifies and focuses the window, as well as put it at the top of the stack and puts the window on the current screen,
     * the actual effect depends on the user's platform, window manager and preferences
     */
    public void present()
    {
	__present(this.memaddress);
    }
    
    /**
     * Deiconifies and focuses the window, as well as put it at the top of the stack and puts the window on the current screen,
     * the actual effect depends on the user's platform, window manager and preferences
     * 
     * @param  timestamp   The timestamp of the user interaction which triggered this call
     */
    public void present(int timestamp)
    {
	__presentWithTime(this.memaddress, timestamp);
    }
    
    /**
     * Deiconifies and focuses the window, as well as put it at the top of the stack and puts the window on the current screen,
     * the actual effect depends on the user's platform, window manager and preferences
     * 
     * @param  timestamp   The timestamp of the user interaction which triggered this call
     */
    public void present(long timestamp)
    {
	__presentWithTime(this.memaddress, (int)(timestamp / 1000));
    }
    
    /**
     * Present the window
     * 
     * @param  memaddress  The memory address of the component
     */
    private static native void __present(long memaddress);
    
    /**
     * Present the window
     * 
     * @param  memaddress  The memory address of the component
     * @param  timestamp   The timestamp of the user interaction which triggered this call
     */
    private static native void __presentWithTime(long memaddress, int timestamp);
    
    
    /**
     * Sets the window's minimisation state
     * 
     * @param  value  The new state value
     */
    public void setMinimised(boolean value);
    
    /**
     * Sets the window's maximisation state
     * 
     * @param  value  The new state value
     */
    public void setMaximised(boolean value);
    
    /**
     * Sets the window's fullscreen state
     * 
     * @param  value  The new state value
     */
    public void setFullscreen(boolean value);
    
    /**
     * Sets the window's stick state
     * 
     * @param  value  The new state value
     */
    public void setStick(boolean value);
    
    /**
     * <p>Sets the window's always on top state</p>
     * <p>
     *   Note that, according to the Extended Window Manager Hints specification, this is mainly meant for user preferences and should not be used by applications e.g. for drawing attention to their dialogs.
     * </p>
     * 
     * @param  value  The new state value
     */
    public void setAlwaysOnTop(boolean value);
    
    /**
     * <p>Sets the window's always on bottom state</p>
     * <p>
     *   Note that, according to the Extended Window Manager Hints specification, this is mainly meant for user preferences and should not be used by applications e.g. for drawing attention to their dialogs.
     * </p>
     * 
     * @param  value  The new state value
     */
    public void setAlwaysOnBottom(boolean value);
    
    /**
     * Sets the window's minimisation state
     * 
     * @param  value  The new state value
     */
    private static native void __setIconified(long memaddress, boolean value);
    
    /**
     * Sets the window's maximisation state
     * 
     * @param  value  The new state value
     */
    private static native void __setMaximised(long memaddress, boolean value);
    
    /**
     * Sets the window's fullscreen state
     * 
     * @param  value  The new state value
     */
    private static native void __setFullscreen(long memaddress, boolean value);
    
    /**
     * Sets the window's stick state
     * 
     * @param  value  The new state value
     */
    private static native void __setStick(long memaddress, boolean value);
    
    /**
     * Sets the window's always on top state
     * 
     * @param  value  The new state value
     */
    private static native void __setKeepAbove(long memaddress, boolean value);
    
    /**
     * Sets the window's always on bottom state
     * 
     * @param  value  The new state value
     */
    private static native void __setKeepBelow(long memaddress, boolean value);
    
    
    // TODO http://developer.gimp.org/api/2.0/gtk/GtkWindow.html#gtk-window-begin-resize-drag
    // TODO http://developer.gimp.org/api/2.0/gtk/GtkWindow.html#gtk-window-begin-move-drag
    
    
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

