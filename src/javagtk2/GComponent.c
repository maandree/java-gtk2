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
#include "GComponent.h"

#include <gtk/gtk.h>


/**
 * Show or hide the component
 * 
 * @param  memaddress  The memory address of the component
 * @param  visiblity   {@code true} for visible
 * @param  all         {@code true} for all
 */
JNIEXPORT void JNICALL Java_javagtk2_GComponent__1_1setVisible(JNIEnv* env, jclass class, jlong memaddress, jboolean visibility, jboolean all)
{
  (void) env;
  (void) class;
  
  GtkWidget* widget = (GtkWidget*)memaddress;
  
  if (visibility)
    if (all)
      gtk_widget_show_all(widget);
    else
      gtk_widget_show(widget);
  else
    if (all)
      gtk_widget_hide_all(widget);
    else
      gtk_widget_hide(widget);
}


/**
 * Set visible now
 * 
 * @param  memaddress  The memory address of the component
 */
JNIEXPORT void JNICALL Java_javagtk2_GComponent__1_1showNow(JNIEnv* env, jclass class, jlong memaddress)
{
  (void) env;
  (void) class;
  
  gtk_widget_show_now((GtkWidget*)memaddress);
}

