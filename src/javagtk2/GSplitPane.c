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
#include "GSplitPane.h"

#include <gtk/gtk.h>


/**
 * Gets the component's first child
 * 
 * @param   memaddress  The memory address of the component
 * @return              The component's first child memory address
 */
JNIEXPORT jlong JNICALL Java_javagtk2_GSplitPane__1_1getChild1(JNIEnv* env, jclass class, jlong memaddress)
{
  (void) env;
  (void) class;
  
  return (jlong)(gtk_paned_get_child1((GtkPaned*)memaddress));
}


/**
 * Gets the component's second child
 * 
 * @param   memaddress  The memory address of the component
 * @return              The component's second child memory address
 */
JNIEXPORT jlong JNICALL Java_javagtk2_GSplitPane__1_1getChild2(JNIEnv* env, jclass class, jlong memaddress)
{
  (void) env;
  (void) class;
  
  return (jlong)(gtk_paned_get_child2((GtkPaned*)memaddress));
}


/**
 * Adds a child to the first slot
 * 
 * @param  memaddress    The memory address of the component
 * @param  childaddress  The memory address of the child to add
 * @param  resize        Should this child expand when the paned widget is resized
 * @param  shrink        Can this child be made smaller than its requisition
 */
JNIEXPORT void JNICALL Java_javagtk2_GSplitPane__1_1pack1(JNIEnv* env, jclass class, jlong memaddress, jlong childaddress, jboolean resize, jboolean shrink)
{
  (void) env;
  (void) class;
  
  gtk_paned_pack1((GtkPaned*)memaddress, (GtkWidget*)childaddress, resize, shrink);
}


/**
 * Adds a child to the second slot
 * 
 * @param  memaddress    The memory address of the component
 * @param  childaddress  The memory address of the child to add
 * @param  resize        Should this child expand when the paned widget is resized
 * @param  shrink        Can this child be made smaller than its requisition
 */
JNIEXPORT void JNICALL Java_javagtk2_GSplitPane__1_1pack2(JNIEnv* env, jclass class, jlong memaddress, jlong childaddress, jboolean resize, jboolean shrink)
{
  (void) env;
  (void) class;
  
  gtk_paned_pack2((GtkPaned*)memaddress, (GtkWidget*)childaddress, resize, shrink);
}


/**
 * Sets the position of the divider between the two panes
 * 
 * @param  memaddress  The memory address of the component
 * @param  location    The position of the divider between the two panes, negative for unset
 */
JNIEXPORT void JNICALL Java_javagtk2_GSplitPane__1_1setPosition(JNIEnv* env, jclass class, jlong memaddress, jint location)
{
  (void) env;
  (void) class;
  
  gtk_paned_set_position((GtkPaned*)memaddress, location);
}


/**
 * Gets the position of the divider between the two panes
 * 
 * @param   memaddress  The memory address of the component
 * @return              The position of the divider between the two panes, negative for unset
 */
JNIEXPORT jint JNICALL Java_javagtk2_GSplitPane__1_1getPosition(JNIEnv* env, jclass class, jlong memaddress)
{
  (void) env;
  (void) class;
  
  return gtk_paned_get_position((GtkPaned*)memaddress);
}

