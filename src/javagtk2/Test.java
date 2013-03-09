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
 * Library test
 * 
 * @author  Mattias Andrée <a href="mailto:maandree@member.fsf.org">maandree@member.fsf.org</a>
 */
public class Test
{
    /**
     * Non-constructor
     */
    private Test()
    {
	assert false : "You may not create instances of javagtk2.Test";
    }
    
    
    /**
     * This is the main entry point of the test
     * 
     * @param  args  Command line arguments
     */
    public static void main(final String... args)
    {
	GTK.initialise("java-gtk2.test", args);
	
	final GWindow window = new GWindow();
	window.setOpacity(0.5);
	window.setVisible(true);
	
	GTK.main();
    }

}

