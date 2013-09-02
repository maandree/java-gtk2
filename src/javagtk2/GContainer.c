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
#include "GContainer.h"

#include <gtk/gtk.h>


void Java_javagtk2_GContainer__1_1add(JNIEnv* env, jclass class, jlong container, jlong component)
{
  (void) env;
  (void) class;
  gtk_container_add((GtkContainer*)container, (GtkWidget*)component);
}

void Java_javagtk2_GContainer__1_1remove(JNIEnv* env, jclass class, jlong container, jlong component)
{
  (void) env;
  (void) class;
  gtk_container_remove((GtkContainer*)container, (GtkWidget*)component);
}

