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

