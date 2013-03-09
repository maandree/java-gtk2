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
  (void) class;
  
  const char* _title = (*env)->GetStringUTFChars(env, title, 0);
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
  (void) env;
  (void) class;
  
  const char* title = gtk_window_get_title((GtkWindow*)memaddress);
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

