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
#include "GButton.h"

#include <gtk/gtk.h>



JNIEXPORT jlong JNICALL Java_javagtk2_GButton__1_1new(JNIEnv* env, jclass class)
{
  return (jlong)gtk_button_new();
}

JNIEXPORT jlong JNICALL Java_javagtk2_GButton__1_1newWithLabel(JNIEnv* env, jclass class, jstring text)
{
  return (jlong)gtk_button_new_with_label((*env)->GetStringUTFChars(env, text, 0));
}

JNIEXPORT jlong JNICALL Java_javagtk2_GButton__1_1newWithMnemonic(JNIEnv* env, jclass class, jstring text)
{
  return (jlong)gtk_button_new_with_mnemonic((*env)->GetStringUTFChars(env, text, 0));
}

JNIEXPORT jlong JNICALL Java_javagtk2_GButton__1_1fromStock(JNIEnv* env, jclass class, jstring item)
{
  return (jlong)gtk_button_new_from_stock((*env)->GetStringUTFChars(env, item, 0));
}

JNIEXPORT void JNICALL Java_javagtk2_GButton__1_1setRelief(JNIEnv* env, jclass class, jlong memaddress, jint style)
{
  gtk_button_set_relief((GtkButton*)memaddress, style);
}

JNIEXPORT jint JNICALL Java_javagtk2_GButton__1_1getRelief(JNIEnv* env, jclass class, jlong memaddress)
{
  return gtk_button_get_relief((GtkButton*)memaddress);
}

JNIEXPORT void JNICALL Java_javagtk2_GButton__1_1setText(JNIEnv* env, jclass class, jlong memaddress, jstring text)
{
  gtk_button_set_text((GtkButton*)memaddress, (*env)->GetStringUTFChars(env, text, 0));
}

JNIEXPORT jstring JNICALL Java_javagtk2_GButton__1_1getText(JNIEnv* env, jclass class, jlong memaddress)
{
  return (*env)->NewStringUTF(env, gtk_button_get_text((GtkButton*)memaddress));
}

JNIEXPORT void JNICALL Java_javagtk2_GButton__1_1setStock(JNIEnv* env, jclass class, jlong memaddress, jboolean value)
{
  gtk_button_set_use_stock((GtkButton*)memaddress, (gboolean)value);
}

JNIEXPORT jboolean JNICALL Java_javagtk2_GButton__1_1isStock(JNIEnv* env, jclass class, jlong memaddress)
{
  return (jboolean)gtk_button_get_use_stock((GtkButton*)memaddress);
}

JNIEXPORT void JNICALL Java_javagtk2_GButton__1_1setUnderlined(JNIEnv* env, jclass class, jlong memaddress, jboolean value)
{
  gtk_button_set_use_underline((GtkButton*)memaddress, (gboolean)value);
}

JNIEXPORT jboolean JNICALL Java_javagtk2_GButton__1_1isUnderlined(JNIEnv* env, jclass class, jlong memaddress)
{
  return (jboolean)gtk_button_get_use_underline((GtkButton*)memaddress);
}

