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
#include "GWindow.h"

#include <gtk/gtk.h>


/**
 * Native constructor
 * 
 * @return  Memory address
 */
JNIEXPORT jlong JNICALL Java_javagtk2_GWindow__1_1new(JNIEnv* env, jclass class)
{
  (void) env;
  (void) class;
  
  return (jlong)gtk_window_new(GTK_WINDOW_TOPLEVEL);
}


/**
 * Sets the window's title
 * 
 * @param  memaddress  The memory address of the component
 * @param  title       The window's new title
 */
JNIEXPORT void JNICALL Java_javagtk2_GWindow__1_1setTitle(JNIEnv* env, jclass class, jlong memaddress, jstring title)
{
  const char* _title;
  
  (void) class;
  
  _title = (*env)->GetStringUTFChars(env, title, 0);
  gtk_window_set_title((GtkWindow*)memaddress, _title);
}


/**
 * Gets the window's title
 * 
 * @param   memaddress  The memory address of the component
 * @return              The window's title
 */
JNIEXPORT jstring JNICALL Java_javagtk2_GWindow__1_1getTitle(JNIEnv* env, jclass class, jlong memaddress)
{
  const char* title;
  
  (void) env;
  (void) class;
  
  title = gtk_window_get_title((GtkWindow*)memaddress);
  return (*env)->NewStringUTF(env, title);
}


/**
 * Sets whether the window is resizable
 * 
 * @param  memaddress  The memory address of the component
 * @param  resizable   Whether the window should be resizable
 */
JNIEXPORT void JNICALL Java_javagtk2_GWindow__1_1setResizable(JNIEnv* env, jclass class, jlong memaddress, jboolean resizable)
{
  (void) env;
  (void) class;
  
  gtk_window_set_resizable((GtkWindow*)memaddress, resizable);
}


/**
 * Gets whether the window is resizable
 * 
 * @param   memaddress  The memory address of the component
 * @return              Whether the window is resizable
 */
JNIEXPORT jboolean JNICALL Java_javagtk2_GWindow__1_1getResizable(JNIEnv* env, jclass class, jlong memaddress)
{
  (void) env;
  (void) class;
  
  return gtk_window_get_resizable((GtkWindow*)memaddress);
}


/**
 * Activates the currently focused component within the window
 * 
 * @param   memaddress  The memory address of the component
 * @return              Whether a component got activated
 */
JNIEXPORT jboolean JNICALL Java_javagtk2_GWindow__1_1activate_1focus(JNIEnv* env, jclass class, jlong memaddress)
{
  (void) env;
  (void) class;
  
  return gtk_window_activate_focus((GtkWindow*)memaddress);
}


/**
 * Activates the default component for the window
 * 
 * @param   memaddress  The memory address of the component
 * @return              Whether a component got activated
 */
JNIEXPORT jboolean JNICALL Java_javagtk2_GWindow__1_1activate_1default(JNIEnv* env, jclass class, jlong memaddress)
{
  (void) env;
  (void) class;
  
  return gtk_window_activate_default((GtkWindow*)memaddress);
}


/**
 * Sets whether the window is modal
 * 
 * @param  memaddress  The memory address of the component
 * @param  modal       Whether the window should be modal
 */
JNIEXPORT void JNICALL Java_javagtk2_GWindow__1_1setModal(JNIEnv* env, jclass class, jlong memaddress, jboolean modal)
{
  (void) env;
  (void) class;
  
  gtk_window_set_modal((GtkWindow*)memaddress, modal);
}


/**
 * Gets whether the window is modal
 * 
 * @param   memaddress  The memory address of the component
 * @return              Whether the window is modal
 */
JNIEXPORT jboolean JNICALL Java_javagtk2_GWindow__1_1getModal(JNIEnv* env, jclass class, jlong memaddress)
{
  (void) env;
  (void) class;
  
  return gtk_window_get_modal((GtkWindow*)memaddress);
}


/**
 * Sets the window's preferred size
 * 
 * @param  memaddress  The memory address of the component
 * @param  width       The window's new preferred width
 * @param  height      The window's new preferred height
 */
JNIEXPORT void JNICALL Java_javagtk2_GWindow__1_1setDefaultSize(JNIEnv* env, jclass class, jlong memaddress, jint width, jint height)
{
  (void) env;
  (void) class;
  
  gtk_window_set_default_size((GtkWindow*)memaddress, width, height);
}


/**
 * Gets the window's preferred size
 * 
 * @param   memaddress  The memory address of the component
 * @return              The window's preferred size in the form <code>height &lt;&lt; 32 | width</code>
 */
JNIEXPORT jlong JNICALL Java_javagtk2_GWindow__1_1getDefaultSize(JNIEnv* env, jclass class, jlong memaddress)
{
  int width = 0, height = 0;
  long _w, _h;
  
  (void) env;
  (void) class;
  
  gtk_window_get_default_size((GtkWindow*)memaddress, &width, &height);
  _w = (long)(unsigned int)width;
  _h = (long)(unsigned int)height;
  return (_h << 32) | _w;
}


/**
 * Sets the window for which the window is transient
 * 
 * @param  memaddress     The memory address of the component
 * @param  parentaddress  The memory address of the window for which the window is transient
 */
JNIEXPORT void JNICALL Java_javagtk2_GWindow__1_1setTransientFor(JNIEnv* env, jclass class, jlong memaddress, jlong parentaddress)
{
  (void) env;
  (void) class;
  
  gtk_window_set_transient_for((GtkWindow*)memaddress, (GtkWindow*)parentaddress);
}


/**
 * Gets the window, if any, for which the window is transient
 * 
 * @param   memaddress  The memory address of the component
 * @return              The window, if any, for which the window is transient
 */
JNIEXPORT jlong JNICALL Java_javagtk2_GWindow__1_1getTransientFor(JNIEnv* env, jclass class, jlong memaddress)
{
  (void) env;
  (void) class;
  
  return (jlong)gtk_window_get_transient_for((GtkWindow*)memaddress);
}


/**
 * Returns whether the window is part of the current active toplevel
 * 
 * @param   memaddress  The memory address of the component
 * @return              Whether the window is part of the current active toplevel
 */
JNIEXPORT jboolean JNICALL Java_javagtk2_GWindow__1_1isActive(JNIEnv* env, jclass class, jlong memaddress)
{
  (void) env;
  (void) class;
  
  return gtk_window_is_active((GtkWindow*)memaddress);
}


/**
 * Returns whether the input focus is within this window
 * 
 * @param   memaddress  The memory address of the component
 * @return              Whether the input focus is within this window
 */
JNIEXPORT jboolean JNICALL Java_javagtk2_GWindow__1_1hasToplevelFocus(JNIEnv* env, jclass class, jlong memaddress)
{
  (void) env;
  (void) class;
  
  return gtk_window_has_toplevel_focus((GtkWindow*)memaddress);
}


/**
 * Adds a mnemonic to this window
 * 
 * @param  memaddress     The memory address of the component
 * @param  keyvalue       The mnemonic
 * @param  targetaddress  The memory address of the component that gets activated by the mnemonic
 */
JNIEXPORT void JNICALL Java_javagtk2_GWindow__1_1addMnemonic(JNIEnv* env, jclass class, jlong memaddress, jint keyvalue, jlong targetaddress)
{
  (void) env;
  (void) class;
  
  return gtk_window_add_mnemonic((GtkWindow*)memaddress, keyvalue, (GtkWidget*)targetaddress);
}


/**
 * Removes a mnemonic to this window
 * 
 * @param  memaddress     The memory address of the component
 * @param  keyvalue       The mnemonic
 * @param  targetaddress  The memory address of the component that gets activated by the mnemonic
 */
JNIEXPORT void JNICALL Java_javagtk2_GWindow__1_1removeMnemonic(JNIEnv* env, jclass class, jlong memaddress, jint keyvalue, jlong targetaddress)
{
  (void) env;
  (void) class;
  
  return gtk_window_remove_mnemonic((GtkWindow*)memaddress, keyvalue, (GtkWidget*)targetaddress);
}


/**
 * Gets the currently focused component within the window
 * 
 * @param   memaddress  The memory address of the component
 * @return              The memory address of the currently focused component within the window
 */
JNIEXPORT jlong JNICALL Java_javagtk2_GWindow__1_1getFocus(JNIEnv* env, jclass class, jlong memaddress)
{
  (void) env;
  (void) class;
  
  return (jlong)gtk_window_get_focus((GtkWindow*)memaddress);
}


/**
 * Sets the currently focused component within the window
 * 
 * @param  memaddress    The memory address of the component
 * @param  focusaddress  The memory address of the currently focused component within the window
 */
JNIEXPORT void JNICALL Java_javagtk2_GWindow__1_1setFocus(JNIEnv* env, jclass class, jlong memaddress, jlong focusaddress)
{
  (void) env;
  (void) class;
  
  gtk_window_set_focus((GtkWindow*)memaddress, (GtkWidget*)focusaddress);
}


/**
 * Sets the default component
 * 
 * @param  memaddress      The memory address of the component
 * @param  defaultaddress  The new default component's memory address
 */
JNIEXPORT void JNICALL Java_javagtk2_GWindow__1_1setDefault(JNIEnv* env, jclass class, jlong memaddress, jlong defaultaddress)
{
  (void) env;
  (void) class;
  
  gtk_window_set_default((GtkWindow*)memaddress, (GtkWidget*)defaultaddress);
}


/**
 * Present the window
 * 
 * @param  memaddress  The memory address of the component
 */
JNIEXPORT void JNICALL Java_javagtk2_GWindow__1_1present(JNIEnv* env, jclass class, jlong memaddress)
{
  (void) env;
  (void) class;
  
  gtk_window_present((GtkWindow*)memaddress);
}


/**
 * Present the window
 * 
 * @param  memaddress  The memory address of the component
 * @param  timestamp   The timestamp of the user interaction which triggered this call
 */
JNIEXPORT void JNICALL Java_javagtk2_GWindow__1_1presentWithTime(JNIEnv* env, jclass class, jlong memaddress, jint timestamp)
{
  (void) env;
  (void) class;
  
  gtk_window_present_with_time((GtkWindow*)memaddress, (guint32)timestamp);
}


/**
 * Sets the window's minimisation state
 * 
 * @param  memaddress  The memory address of the component
 * @param  value       The new state value
 */
JNIEXPORT void JNICALL Java_javagtk2_GWindow__1_1setIconified(JNIEnv* env, jclass class, jlong memaddress, jboolean value)
{
  (void) env;
  (void) class;
  
  if (value)
    gtk_window_iconify((GtkWindow*)memaddress);
  else
    gtk_window_deiconify((GtkWindow*)memaddress);
}


/**
 * Sets the window's maximisation state
 * 
 * @param  memaddress  The memory address of the component
 * @param  value       The new state value
 */
JNIEXPORT void JNICALL Java_javagtk2_GWindow__1_1setMaximised(JNIEnv* env, jclass class, jlong memaddress, jboolean value)
{
  (void) env;
  (void) class;
  
  if (value)
    gtk_window_maximize((GtkWindow*)memaddress);
  else
    gtk_window_unmaximize((GtkWindow*)memaddress);
}


/**
 * Sets the window's fullscreen state
 * 
 * @param  memaddress  The memory address of the component
 * @param  value       The new state value
 */
JNIEXPORT void JNICALL Java_javagtk2_GWindow__1_1setFullscreen(JNIEnv* env, jclass class, jlong memaddress, jboolean value)
{
  (void) env;
  (void) class;
  
  if (value)
    gtk_window_fullscreen((GtkWindow*)memaddress);
  else
    gtk_window_unfullscreen((GtkWindow*)memaddress);
}


/**
 * Sets the window's stick state
 * 
 * @param  memaddress  The memory address of the component
 * @param  value       The new state value
 */
JNIEXPORT void JNICALL Java_javagtk2_GWindow__1_1setStick(JNIEnv* env, jclass class, jlong memaddress, jboolean value)
{
  (void) env;
  (void) class;
  
  if (value)
    gtk_window_stick((GtkWindow*)memaddress);
  else
    gtk_window_unstick((GtkWindow*)memaddress);
}


/**
 * Sets the window's always on top state
 * 
 * @param  memaddress  The memory address of the component
 * @param  value       The new state value
 */
JNIEXPORT void JNICALL Java_javagtk2_GWindow__1_1setKeepAbove(JNIEnv* env, jclass class, jlong memaddress, jboolean value)
{
  (void) env;
  (void) class;
  
  gtk_window_set_keep_above((GtkWindow*)memaddress, value);
}


/**
 * Sets the window's always on bottom state
 * 
 * @param  memaddress  The memory address of the component
 * @param  value       The new state value
 */
JNIEXPORT void JNICALL Java_javagtk2_GWindow__1_1setKeepBelow(JNIEnv* env, jclass class, jlong memaddress, jboolean value)
{
  (void) env;
  (void) class;
  
  gtk_window_set_keep_below((GtkWindow*)memaddress, value);
}


/**
 * Sets whether the window is decorated
 * 
 * @param  memaddress  The memory address of the component
 * @param  decorated   Whether the window should be decorated
 */
JNIEXPORT void JNICALL Java_javagtk2_GWindow__1_1setDecorated(JNIEnv* env, jclass class, jlong memaddress, jboolean decorated)
{
  (void) env;
  (void) class;
  
  gtk_window_set_decorated((GtkWindow*)memaddress, decorated);
}


/**
 * Gets whether the window is decorated
 * 
 * @param   memaddress  The memory address of the component
 * @return              Whether the window is decorated
 */
JNIEXPORT jboolean JNICALL Java_javagtk2_GWindow__1_1getDecorated(JNIEnv* env, jclass class, jlong memaddress)
{
  (void) env;
  (void) class;
  
  return gtk_window_get_decorated((GtkWindow*)memaddress);
}


/**
 * Sets whether the window has a close button
 * 
 * @param  memaddress  The memory address of the component
 * @param  value       Whether the window should have a close button
 */
JNIEXPORT void JNICALL Java_javagtk2_GWindow__1_1setDeletable(JNIEnv* env, jclass class, jlong memaddress, jboolean value)
{
  (void) env;
  (void) class;
  
  gtk_window_set_deletable((GtkWindow*)memaddress, value);
}


/**
 * Gets whether the window has a close button
 * 
 * @param   memaddress  The memory address of the component
 * @return              Whether the window has a close button
 */
JNIEXPORT jboolean JNICALL Java_javagtk2_GWindow__1_1getDeletable(JNIEnv* env, jclass class, jlong memaddress)
{
  (void) env;
  (void) class;
  
  return gtk_window_get_deletable((GtkWindow*)memaddress);
}


/**
 * Sets the window's role
 * 
 * @param  memaddress  The memory address of the component
 * @param  role        The window's new role
 */
JNIEXPORT void JNICALL Java_javagtk2_GWindow__1_1setRole(JNIEnv* env, jclass class, jlong memaddress, jstring role)
{
  const char* _role;
  
  (void) class;
  
  _role = (*env)->GetStringUTFChars(env, role, 0);
  gtk_window_set_role((GtkWindow*)memaddress, _role);
}


/**
 * Gets the window's role
 * 
 * @param   memaddress  The memory address of the component
 * @return              The window's role
 */
JNIEXPORT jstring JNICALL Java_javagtk2_GWindow__1_1getRole(JNIEnv* env, jclass class, jlong memaddress)
{
  const char* role;
  
  (void) env;
  (void) class;
  
  role = gtk_window_get_role((GtkWindow*)memaddress);
  return (*env)->NewStringUTF(env, role);
}


/**
 * Sets whether the window is shown in the taskbar
 * 
 * @param  memaddress  The memory address of the component
 * @param  value       Whether the window should be shown in the taskbar
 */
JNIEXPORT void JNICALL Java_javagtk2_GWindow__1_1setSkipTaskbarHint(JNIEnv* env, jclass class, jlong memaddress, jboolean value)
{
  (void) env;
  (void) class;
  
  gtk_window_set_skip_taskbar_hint((GtkWindow*)memaddress, value);
}


/**
 * Gets whether the window is shown in the taskbar
 * 
 * @param   memaddress  The memory address of the component
 * @return               Whether the window is shown in the taskbar
 */
JNIEXPORT jboolean JNICALL Java_javagtk2_GWindow__1_1getSkipTaskbarHint(JNIEnv* env, jclass class, jlong memaddress)
{
  (void) env;
  (void) class;
  
  return gtk_window_get_skip_taskbar_hint((GtkWindow*)memaddress);
}


/**
 * Sets whether the window is shown in the pager
 * 
 * @param  memaddress  The memory address of the component
 * @param  value       Whether the window should be shown in the pager
 */
JNIEXPORT void JNICALL Java_javagtk2_GWindow__1_1setSkipPagerHint(JNIEnv* env, jclass class, jlong memaddress, jboolean value)
{
  (void) env;
  (void) class;
  
  gtk_window_set_skip_pager_hint((GtkWindow*)memaddress, value);
}


/**
 * Gets whether the window is shown in the pager
 * 
 * @param   memaddress  The memory address of the component
 * @return              Whether the window is shown in the pager
 */
JNIEXPORT jboolean JNICALL Java_javagtk2_GWindow__1_1getSkipPagerHint(JNIEnv* env, jclass class, jlong memaddress)
{
  (void) env;
  (void) class;
  
  return gtk_window_get_skip_pager_hint((GtkWindow*)memaddress);
}


/**
 * Sets whether to draw the user's attention to the window
 * 
 * @param  memaddress  The memory address of the component
 * @param  value       Whether to draw the user's attention to the window
 */
JNIEXPORT void JNICALL Java_javagtk2_GWindow__1_1setUrgencyHint(JNIEnv* env, jclass class, jlong memaddress, jboolean value)
{
  (void) env;
  (void) class;
  
  gtk_window_set_urgency_hint((GtkWindow*)memaddress, value);
}


/**
 * Gets whether to draw the user's attention to the window
 * 
 * @param   memaddress  The memory address of the component
 * @return              Whether to draw the user's attention to the window
 */
JNIEXPORT jboolean JNICALL Java_javagtk2_GWindow__1_1getUrgencyHint(JNIEnv* env, jclass class, jlong memaddress)
{
  (void) env;
  (void) class;
  
  return gtk_window_get_urgency_hint((GtkWindow*)memaddress);
}


/**
 * Sets whether to receive the input focus
 * 
 * @param  memaddress  The memory address of the component
 * @param  value       Whether to receive the input focus
 */
JNIEXPORT void JNICALL Java_javagtk2_GWindow__1_1setAcceptFocus(JNIEnv* env, jclass class, jlong memaddress, jboolean value)
{
  (void) env;
  (void) class;
  
  gtk_window_set_accept_focus((GtkWindow*)memaddress, value);
}


/**
 * Gets whether to receive the input focus
 * 
 * @param   memaddress  The memory address of the component
 * @return              Whether to receive the input focus
 */
JNIEXPORT jboolean JNICALL Java_javagtk2_GWindow__1_1getAcceptFocus(JNIEnv* env, jclass class, jlong memaddress)
{
  (void) env;
  (void) class;
  
  return gtk_window_get_accept_focus((GtkWindow*)memaddress);
}


/**
 * Sets whether to receive the input focus on map
 * 
 * @param  memaddress  The memory address of the component
 * @param  value       Whether to receive the input focus on map
 */
JNIEXPORT void JNICALL Java_javagtk2_GWindow__1_1setFocusOnMap(JNIEnv* env, jclass class, jlong memaddress, jboolean value)
{
  (void) env;
  (void) class;
  
  gtk_window_set_focus_on_map((GtkWindow*)memaddress, value);
}


/**
 * Gets whether to receive the input focus on map
 * 
 * @param   memaddress  The memory address of the component
 * @return              Whether to receive the input focus on map
 */
JNIEXPORT jboolean JNICALL Java_javagtk2_GWindow__1_1getFocusOnMap(JNIEnv* env, jclass class, jlong memaddress)
{
  (void) env;
  (void) class;
  
  return gtk_window_get_focus_on_map((GtkWindow*)memaddress);
}


/**
 * Sets the window's startup identifier
 * 
 * @param  memaddress  The memory address of the component
 * @param  id          The window's new startup identifier
 */
JNIEXPORT void JNICALL Java_javagtk2_GWindow__1_1setStartupID(JNIEnv* env, jclass class, jlong memaddress, jstring id)
{
  const char* _id;
  
  (void) class;
  
  _id = (*env)->GetStringUTFChars(env, id, 0);
  gtk_window_set_startup_id((GtkWindow*)memaddress, _id);
}


/**
 * Sets the location of the window
 * 
 * @param  memaddress  The memory address of the component
 * @param  x           The position on the X-axis
 * @param  y           The position on the Y-axis
 */
JNIEXPORT void JNICALL Java_javagtk2_GWindow__1_1move(JNIEnv* env, jclass class, jlong memaddress, jint x, jint y)
{
  (void) env;
  (void) class;
  
  gtk_window_move((GtkWindow*)memaddress, x, y);
}


/**
 * Gets the location of the window
 * 
 * @param   memaddress  The memory address of the component
 * @return              The location of the window on the form <code>y &lt;&lt; 32 | x</code>
 */
JNIEXPORT jlong JNICALL Java_javagtk2_GWindow__1_1getPosition(JNIEnv* env, jclass class, jlong memaddress)
{
  int x = 0, y = 0;
  long _x, _y;
  
  (void) env;
  (void) class;
  
  gtk_window_get_position((GtkWindow*)memaddress, &x, &y);
  _x = (long)(unsigned int)x;
  _y = (long)(unsigned int)y;
  return (_y << 32L) | _x;
}


/**
 * Sets the size of the window
 * 
 * @param  memaddress  The memory address of the component
 * @parma  width       The width of the window
 * @parma  height      The height of the window
 */
JNIEXPORT void JNICALL Java_javagtk2_GWindow__1_1resize(JNIEnv* env, jclass class, jlong memaddress, jint width, jint height)
{
  (void) env;
  (void) class;
  
  gtk_window_resize((GtkWindow*)memaddress, width, height);
}


/**
 * Gets the window's size
 * 
 * @param   memaddress  The memory address of the component
 * @return              The window's size in the form <code>height &lt;&lt; 32 | width</code>
 */
JNIEXPORT jlong JNICALL Java_javagtk2_GWindow__1_1getSize(JNIEnv* env, jclass class, jlong memaddress)
{
  int width = 0, height = 0;
  long _w, _h;
  
  (void) env;
  (void) class;
  
  gtk_window_get_size((GtkWindow*)memaddress, &width, &height);
  _w = (long)(unsigned int)width;
  _h = (long)(unsigned int)height;
  return (_h << 32) | _w;
}


/**
 * Sets the location and size of the window
 * 
 * @param  memaddress  The memory address of the component
 * @param  geometry    The geometry string
 */
JNIEXPORT jboolean JNICALL Java_javagtk2_GWindow__1_1parseGeometry(JNIEnv* env, jclass class, jlong memaddress, jstring geometry)
{
  const char* _geometry;
  
  (void) class;
  
  _geometry = (*env)->GetStringUTFChars(env, geometry, 0);
  return gtk_window_parse_geometry((GtkWindow*)memaddress, _geometry);
}


/**
 * Sets the window's icon by themed name
 * 
 * @param  memaddress  The memory address of the component
 * @param  name        The themed name of the window's icon
 */
JNIEXPORT void JNICALL Java_javagtk2_GWindow__1_1setIconName(JNIEnv* env, jclass class, jlong memaddress, jstring name)
{
  const char* _name;
  
  (void) class;
  
  _name = (*env)->GetStringUTFChars(env, name, 0);
  gtk_window_set_icon_name((GtkWindow*)memaddress, _name);
}


/**
 * Gets the window's icon by themed name
 * 
 * @param   memaddress  The memory address of the component
 * @return              The themed name of the window's icon
 */
JNIEXPORT jstring JNICALL Java_javagtk2_GWindow__1_1getIconName(JNIEnv* env, jclass class, jlong memaddress)
{
  const char* name;
  
  (void) env;
  (void) class;
  
  name = gtk_window_get_icon_name((GtkWindow*)memaddress);
  return (*env)->NewStringUTF(env, name);
}


/**
 * Sets the default icon by themed name
 * 
 * @param  name  The themed name of the default icon
 */
JNIEXPORT void JNICALL Java_javagtk2_GWindow__1_1setDefaultIconName(JNIEnv* env, jclass class, jstring name)
{
  const char* _name;
  
  (void) class;
  
  _name = (*env)->GetStringUTFChars(env, name, 0);
  gtk_window_set_default_icon_name(_name);
}


/**
 * Gets the default icon by themed name
 * 
 * @return  The themed name of the default icon
 */
JNIEXPORT jstring JNICALL Java_javagtk2_GWindow__1_1getDefaultIconName(JNIEnv* env, jclass class)
{
  const char* name;
  
  (void) env;
  (void) class;
  
  name = gtk_window_get_default_icon_name();
  return (*env)->NewStringUTF(env, name);
}


/**
 * Sets the window's opacity
 * 
 * @param  memaddress  The memory address of the component
 * @param  opacity     The window's new opacity
 */
JNIEXPORT void JNICALL Java_javagtk2_GWindow__1_1setOpacity(JNIEnv* env, jclass class, jlong memaddress, jdouble opacity)
{
  (void) env;
  (void) class;
  
  gtk_window_set_opacity((GtkWindow*)memaddress, opacity);
}


/**
 * Gets the window's opacity
 * 
 * @param   memaddress  The memory address of the component
 * @return              The window's opacity
 */
JNIEXPORT jdouble JNICALL Java_javagtk2_GWindow__1_1getOpacity(JNIEnv* env, jclass class, jlong memaddress)
{
  (void) env;
  (void) class;
  
  return gtk_window_get_opacity((GtkWindow*)memaddress);
}


/**
 * Sets whether automatic startup notification is enabled
 * 
 * @param  enabled  Whether automatic startup notification should be enabled
 */
JNIEXPORT void JNICALL Java_javagtk2_GWindow__1_1setAutoStartupNotification(JNIEnv* env, jclass class, jboolean enabled)
{
  (void) env;
  (void) class;
  
  gtk_window_set_auto_startup_notification(enabled);
}

