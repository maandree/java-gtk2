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

