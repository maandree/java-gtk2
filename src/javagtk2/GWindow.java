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
	this(null, null, null);
    }
    
    /**
     * Constructor
     * 
     * @param  title  The window's title
     */
    public GWindow(final String title)
    {
	this(title, null, null);
    }
    
    /**
     * Constructor
     * 
     * @param  title  The window's title
     * @param  role   The window's role
     */
    public GWindow(final String title, final String role)
    {
	this(title, role, null);
    }
    
    /**
     * Constructor
     * 
     * @param  title  The window's title
     * @param  role   The window's role
     * @param  id     The window's startup identifier
     */
    public GWindow(final String title, final String role, final String id)
    {
	super(__new());
	if (title != null)
	    this.setTitle(title);
	if (role != null)
	    this.setRole(role);
	if (id != null)
	    this.setStartupID(id);
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
     * Whether automatic startup notification is enabled
     */
    private static boolean autoStartupNotification = true;
    
    
    
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
	__setDefaultSize(this.memaddress, width, height);
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
     * @param  memaddress     The memory address of the component
     * @param  parentaddress  The memory address of the window for which the window is transient
     */
    private static native void __setTransientFor(long memaddress, long parentaddress);
    
    /**
     * Gets the window, if any, for which the window is transient
     * 
     * @param   memaddress  The memory address of the component
     * @return              The window, if any, for which the window is transient
     */
    private static native long __getTransientFor(long memaddress);
    
    
    // TODO http://developer.gimp.org/api/2.0/gtk/GtkWindow.html#gtk-window-set-destroy-with-parent
    // TODO http://developer.gimp.org/api/2.0/gtk/GtkWindow.html#gtk-window-get-destroy-with-parent
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
	__addMnemonic(this.memaddress, keyvalue, target.memaddress);
    }
    
    /**
     * Removes a mnemonic to this window
     * 
     * @param  keyvalue  The mnemonic
     * @param  target    The component that gets activated by the mnemonic
     */
    public void removeMnemonic(final int keyvalue, final GComponent target)
    {
	__removeMnemonic(this.memaddress, keyvalue, target.memaddress);
    }
    
    /**
     * Adds a mnemonic to this window
     * 
     * @param  memaddress    The memory address of the component
     * @param  keyvalue      The mnemonic
     * @param  targetaddres  The memory address of the component that gets activated by the mnemonic
     */
    private static native void __addMnemonic(long memaddress, int keyvalue, long targetaddress);
    
    /**
     * Removes a mnemonic to this window
     * 
     * @param  memaddress     The memory address of the component
     * @param  keyvalue       The mnemonic
     * @param  targetaddress  The memory address of the component that gets activated by the mnemonic
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
	    return null;
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
     * @param  memaddress    The memory address of the component
     * @param  focusaddress  The memory address of the currently focused component within the window
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
     * @param  timestamp  The timestamp of the user interaction which triggered this call
     */
    public void present(int timestamp)
    {
	__presentWithTime(this.memaddress, timestamp);
    }
    
    /**
     * Deiconifies and focuses the window, as well as put it at the top of the stack and puts the window on the current screen,
     * the actual effect depends on the user's platform, window manager and preferences
     * 
     * @param  timestamp  The timestamp of the user interaction which triggered this call
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
    public void setMinimised(boolean value)
    {
	__setIconified(this.memaddress, value);
    }
    
    /**
     * Sets the window's maximisation state
     * 
     * @param  value  The new state value
     */
    public void setMaximised(boolean value)
    {
	__setMaximised(this.memaddress, value);
    }
    
    /**
     * Sets the window's fullscreen state
     * 
     * @param  value  The new state value
     */
    public void setFullscreen(boolean value)
    {
	__setFullscreen(this.memaddress, value);
    }
    
    /**
     * Sets the window's stick state
     * 
     * @param  value  The new state value
     */
    public void setStick(boolean value)
    {
	__setStick(this.memaddress, value);
    }
    
    /**
     * <p>Sets the window's always on top state</p>
     * <p>
     *   Note that, according to the Extended Window Manager Hints specification, this is mainly meant for user preferences and should not be used by applications e.g. for drawing attention to their dialogs.
     * </p>
     * 
     * @param  value  The new state value
     */
    public void setAlwaysOnTop(boolean value)
    {
	__setKeepAbove(this.memaddress, value);
    }
    
    /**
     * <p>Sets the window's always on bottom state</p>
     * <p>
     *   Note that, according to the Extended Window Manager Hints specification, this is mainly meant for user preferences and should not be used by applications e.g. for drawing attention to their dialogs.
     * </p>
     * 
     * @param  value  The new state value
     */
    public void setAlwaysOnBottom(boolean value)
    {
	__setKeepBelow(this.memaddress, value);
    }
    
    /**
     * Sets the window's minimisation state
     * 
     * @param  memaddress  The memory address of the component
     * @param  value       The new state value
     */
    private static native void __setIconified(long memaddress, boolean value);
    
    /**
     * Sets the window's maximisation state
     * 
     * @param  memaddress  The memory address of the component
     * @param  value       The new state value
     */
    private static native void __setMaximised(long memaddress, boolean value);
    
    /**
     * Sets the window's fullscreen state
     * 
     * @param  memaddress  The memory address of the component
     * @param  value       The new state value
     */
    private static native void __setFullscreen(long memaddress, boolean value);
    
    /**
     * Sets the window's stick state
     * 
     * @param  memaddress  The memory address of the component
     * @param  value       The new state value
     */
    private static native void __setStick(long memaddress, boolean value);
    
    /**
     * Sets the window's always on top state
     * 
     * @param  memaddress  The memory address of the component
     * @param  value       The new state value
     */
    private static native void __setKeepAbove(long memaddress, boolean value);
    
    /**
     * Sets the window's always on bottom state
     * 
     * @param  memaddress  The memory address of the component
     * @param  value       The new state value
     */
    private static native void __setKeepBelow(long memaddress, boolean value);
    
    
    // TODO http://developer.gimp.org/api/2.0/gtk/GtkWindow.html#gtk-window-begin-resize-drag
    // TODO http://developer.gimp.org/api/2.0/gtk/GtkWindow.html#gtk-window-begin-move-drag
    
    
    /**
     * Sets whether the window is decorated
     * 
     * @param  decorated  Whether the window should be decorated
     */
    private void setDecorated(boolean decorated);
    
    /**
     * Gets whether the window is decorated
     * 
     * @return  Whether the window is decorated
     */
    private boolean isDecorated();
    
    /**
     * Sets whether the window is decorated
     * 
     * @param  memaddress  The memory address of the component
     * @param  decorated   Whether the window should be decorated
     */
    private static native void __setDecorated(long memaddress, boolean decorated);
    
    /**
     * Gets whether the window is decorated
     * 
     * @param   memaddress  The memory address of the component
     * @return              Whether the window is decorated
     */
    private static native boolean __getDecorated(long memaddress);
    
    
    /**
     * Sets whether the window has a close button
     * 
     * @param  value  Whether the window should have a close button
     */
    private void setHasCloseButton(boolean value);
    
    /**
     * Gets whether the window has a close button
     * 
     * @return  Whether the window has a close button
     */
    private boolean hasCloseButton();
    
    /**
     * Sets whether the window has a close button
     * 
     * @param  memaddress  The memory address of the component
     * @param  value       Whether the window should have a close button
     */
    private static native void __setDeletable(long memaddress, boolean value);
    
    /**
     * Gets whether the window has a close button
     * 
     * @param   memaddress  The memory address of the component
     * @return              Whether the window has a close button
     */
    private static native boolean __getDeletable(long memaddress);
    
    
    // TODO http://developer.gimp.org/api/2.0/gtk/GtkWindow.html#gtk-window-set-frame-dimensions
    // TODO http://developer.gimp.org/api/2.0/gtk/GtkWindow.html#gtk-window-get-frame-dimensions
    
    // TODO http://developer.gimp.org/api/2.0/gtk/GtkWindow.html#gtk-window-set-has-frame
    // TODO http://developer.gimp.org/api/2.0/gtk/GtkWindow.html#gtk-window-get-has-frame
    
    // TODO http://developer.gimp.org/api/2.0/gtk/GtkWindow.html#gtk-window-set-mnemonic-modifier
    // TODO http://developer.gimp.org/api/2.0/gtk/GtkWindow.html#gtk-window-get-mnemonic-modifier
    
    
    /**
     * Sets the window's role, which is used by the WM to identify the window upon session restoration
     * 
     * @param  role  The window's new role
     */
    public void setRole(final String role)
    {
	__setRole(this.memaddress, role);
    }
    
    /**
     * Gets the window's role
     * 
     * @return  The window's role
     */
    public String getRole()
    {
	return __getRole(this.memaddress);
    }
    
    /**
     * Sets the window's role
     * 
     * @param  memaddress  The memory address of the component
     * @param  role        The window's new role
     */
    private static native void __setRole(long memaddress, String role);
    
    /**
     * Gets the window's role
     * 
     * @param   memaddress  The memory address of the component
     * @return              The window's role
     */
    private static native String __getRole(long memaddress);
    
    
    // TODO http://developer.gimp.org/api/2.0/gtk/GtkWindow.html#gtk-window-set-type-hint
    // TODO http://developer.gimp.org/api/2.0/gtk/GtkWindow.html#gtk-window-get-type-hint
    
    
    /* TODO
      void gtk_window_set_skip_taskbar_hint(GtkWindow *window, gboolean setting);  Windows may set a hint asking the desktop environment not to display the window in the task bar.
      void gtk_window_set_skip_pager_hint(GtkWindow *window, gboolean setting);    Windows may set a hint asking the desktop environment not to display the window in the pager.
      void gtk_window_set_urgency_hint(GtkWindow *window, gboolean setting);       Windows may set a hint asking the desktop environment to draw the users attention to the window.
      void gtk_window_set_accept_focus(GtkWindow *window, gboolean setting);       Windows may set a hint asking the desktop environment not to receive the input focus.
      void gtk_window_set_focus_on_map(GtkWindow *window, gboolean setting);       Windows may set a hint asking the desktop environment not to receive the input focus when the window is mapped.
     */
    
    
    /**
     * Sets the window's startup identifier, which is used by the WM to identify the window upon session restoration
     * 
     * @param  role  The window's startup identifier
     */
    public void setStartupID(final String id)
    {
	__setRole(this.memaddress, id);
    }
    
    /**
     * Sets the window's startup identifier
     * 
     * @param  memaddress  The memory address of the component
     * @param  id          The window's new startup identifier
     */
    private static native void __setStartupID(long memaddress, String id);
    
    
    // TODO http://developer.gimp.org/api/2.0/gtk/GtkWindow.html#gtk-window-get-group
    
    
    /**
     * Set the location of the window
     * 
     * @param  location  The location
     */
    public void setLocation(final Point location)
    {
	__move(this.memaddress, location.x, location.y);
    }
    
    /**
     * Set the location of the window
     * 
     * @param  x  The position on the X-axis
     * @param  y  The position on the Y-axis
     */
    public void setLocation(final int x, final int y);
    {
	__move(this.memaddress, x, y);
    }
    
    /**
     * Set the location of the window
     * 
     * @param  memaddress  The memory address of the component
     * @param  x           The position on the X-axis
     * @param  y           The position on the Y-axis
     */
    public static native void __move(long memaddress, int x, int y);
    
    
    /**
     * Set the size of the window
     * 
     * @param  size  The size of the window
     */
    public void setSize(final Dimension size)
    {
	__resize(this.memaddress, size.width, size.height);
    }
    
    /**
     * Set the size of the window
     * 
     * @parma  width   The width of the window
     * @parma  height  The height of the window
     */
    public void setSize(final int width, final int height)
    {
	__resize(this.memaddress, width, height);
    }
    
    /**
     * Set the size of the window
     * 
     * @param  memaddress  The memory address of the component
     * @parma  width       The width of the window
     * @parma  height      The height of the window
     */
    public static native void __resize(long memaddress, int width, int height);
    
    
    /**
     * Set the location and size of the window
     * 
     * @param  geometry  The geometry string
     * 
     * @throws  IllegalArgumentException  If the geometry string is invalid
     */
    public void setGeometry(final String geometry) throws IllegalArgumentException
    {
	if (__parseGeometry(this.memaddress, geometry))
	    throw new IllegalArgumentException("Invalid geometry string: " + geometry);
    }
    
    /**
     * Set the location and size of the window
     * 
     * @param  memaddress  The memory address of the component
     * @param  geometry    The geometry string
     */
    public static native boolean __parseGeometry(long memaddress, String geometry);
    
    
    // TODO (default) icon functions from http://developer.gimp.org/api/2.0/gtk/GtkWindow.html
    
    
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
    
    
    /**
     * Sets whether automatic startup notification is enabled
     * 
     * @param  enabled  Whether automatic startup notification should be enabled
     */
    public static void setAutoStartupNotificationEnabled(final boolean enabled)
    {
	__setAutoStartupNotification(GWindow.autoStartupNotification = enabled);
    }
    
    /**
     * Gets whether automatic startup notification is enabled
     * 
     * @return  Whether automatic startup notification is enabled
     */
    public static boolean isAutoStartupNotificationEnabled()
    {
	return GWindow.autoStartupNotification;
    }
    
    /**
     * Sets whether automatic startup notification is enabled
     * 
     * @param  enabled  Whether automatic startup notification should be enabled
     */
    public static native void __setAutoStartupNotification(final boolean enabled);
    
}

