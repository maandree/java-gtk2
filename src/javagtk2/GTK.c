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
#include "GTK.h"

#include <stdlib.h>
#include <gtk/gtk.h>


/**
 * Initialise GTK
 * 
 * @param  args  The command line arguments, including the executable
 */
JNIEXPORT void JNICALL Java_javagtk2_GTK__1_1initialise(JNIEnv* env, jclass class, jobjectArray args)
{
  int i, argc = (*env)->GetArrayLength(env, args);
  char** argv = (char**)malloc(argc * sizeof(char*));
  
  (void) class;
  
  for (i = 0; i < argc; i++)
    {
      jstring string = (jstring)((*env)->GetObjectArrayElement(env, args, i));
      *(argv + i) = (char*)((*env)->GetStringUTFChars(env, string, 0));
    }
  
  gtk_init(&argc, &argv);
  
  for (i = 0; i < argc; i++)
    {
      jstring string = (jstring)((*env)->GetObjectArrayElement(env, args, i));
      (*env)->ReleaseStringUTFChars(env, string, *(argv + i));
    }
  
  free(argv);
}


/**
 * Kick off GTK main loop
 */
JNIEXPORT void JNICALL Java_javagtk2_GTK_main(JNIEnv* env, jclass class)
{
  (void) env;
  (void) class;
  
  gtk_main();
}


/**
 * Exits the program
 * 
 * @param  value  Exit value
 */
JNIEXPORT void JNICALL Java_javagtk2_GTK_exit(JNIEnv* env, jclass class, jint value)
{
  (void) env;
  (void) class;
  
  gtk_exit(value);
}


/**
 * Returns the current main loop level (main loops can be nested)
 */
JNIEXPORT jint JNICALL Java_javagtk2_GTK_mainLevel(JNIEnv* env, jclass class)
{
  (void) env;
  (void) class;
  
  return gtk_main_level();
}


/**
 * Quit the main loop
 */
JNIEXPORT void JNICALL Java_javagtk2_GTK_mainQuit(JNIEnv* env, jclass class)
{
  (void) env;
  (void) class;
  
  gtk_main_quit();
}

