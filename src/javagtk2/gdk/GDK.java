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
package javagtk2.gdk;
import java.awt.*;


/**
 * GDK library initialisation and miscellaneous functions
 * 
 * @author  Mattias Andrée <a href="mailto:maandree@member.fsf.org">maandree@member.fsf.org</a>
 */
public class GDK
{
    /**
     * Non-constructor
     */
    private GDK()
    {
	assert false : "You may not create instances of javagtk2.gdk.GDK";
    }
    
    
    
    /**
     * Emits a short beep on the default display
     */
    public static native void beep();
    
    /**
     * Flushes the X output buffer and waits until all requests have been processed by the server. This is rarely needed by applications.
     */
    public static native void flush();
    
    
    /**
     * Gets the size of the default screen in pixels
     * 
     * @return  The size of the default screen in pixels
     */
    public static Dimension getScreenSize()
    {
	return new Dimension(getScreenWidth(), getScreenHeight());
    }
    
    /**
     * Gets the width of the default screen in pixels
     * 
     * @return  The width of the default screen in pixels
     */
    public static native int getScreenWidth();
    
    /**
     * Gets the height of the default screen in pixels
     * 
     * @return  The height of the default screen in pixels
     */
    public static native int getScreenHeight();
    
    
    /**
     * Gets the size of the default screen in millimeters. Note that on many X servers this value will not be correct.
     * 
     * @return  The size of the default screen in millimeters
     */
    public static Dimension getScreenSizeMM()
    {
	return new Dimension(getScreenWidthMM(), getScreenHeightMM());
    }
    
    /**
     * Gets the width of the default screen in millimeters. Note that on many X servers this value will not be correct.
     * 
     * @return  The width of the default screen in millimeters
     */
    public static native int getScreenWidthMM();
    
    /**
     * Gets the height of the default screen in millimeters. Note that on many X servers this value will not be correct.
     * 
     * @return  The height of the default screen in millimeters
     */
    public static native int getScreenHeightMM();
    
    
    // TODO http://developer.gimp.org/api/2.0/gdk/gdk-General.html

}

