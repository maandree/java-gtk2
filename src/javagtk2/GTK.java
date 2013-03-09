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
package javagtk2;


/**
 * GTK initialisation class
 * 
 * @author  Mattias Andrée <a href="mailto:maandree@member.fsf.org">maandree@member.fsf.org</a>
 */
public class GTK
{
    /**
     * Non-constructor
     */
    private GTK()
    {
	assert false : "You may not create instances of ee.gtk.GTK";
    }
    
    
    
    /**
     * Whether GTK has been synchronised
     */
    private static boolean isInitialised = false;
    
    
    
    /**
     * Initialise GTK
     * 
     * @param  exec  The executable
     * @param  args  The command line arguments, excluding the executable
     */
    public static synchronized void initialise(final String exec, final String... args)
    {
	if (GTK.isInitialised == false)
	{   GTK.isInitialised = true;
	    
	    System.load((new java.io.File("./gtkbindings.so")).getAbsolutePath());
	    
	    final String[] argv = new String[args.length + 1];
	    argv[0] = exec;
	    System.arraycopy(args, 0, argv, 1, args.length);
	    __initialise(args);
	}
    }
    
    /**
     * Initialise GTK
     * 
     * @param  args  The command line arguments, including the executable
     */
    private static native void __initialise(final String[] args);
    
    
    /**
     * Kick off GTK main loop
     */
    public static native void main();
    
    
    /**
     * Exits the program
     * 
     * @param  value  Exit value
     */
    public static native void exit(final int value);
    
    
    /**
     * Returns the current main loop level (main loops can be nested)
     */
    public static native int mainLevel();
    
    
    /**
     * Quit the main loop
     */
    public static native void mainQuit();

}

