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
 * GTK button class, a button that can have a label or icon
 * 
 * @author  Mattias Andrée <a href="mailto:maandree@member.fsf.org">maandree@member.fsf.org</a>
 */
public class GButton extends GBin
{
    /**
     * Constructor
     * 
     * @param  memaddress  The memory address of the component
     */
    protected GButton(final long memaddress)
    {
        super(memaddress);
    }
    
    /**
     * Constructor
     */
    public GButton()
    {
	this(__new());
    }
    
    /**
     * Constructor
     * 
     * @param  text  The text on the button, use underscore in front of characters that should be underlined, the first underline will be the mnemonic
     */
    public GButton(final String text)
    {
	this(text, true);
    }
    
    /**
     * Constructor
     * 
     * @param  text      The text on the button
     * @param  mnemonic  Whether underscore in front of characters should underline them and set the first on the be the mnemonic
     */
    public GButton(final String text, final boolean mnemonic)
    {
	this(mnemonic ? __newWithMnemonic(text) : __newWithLabel(text));
    }
    
    
    
    /**
     * Create a stock button
     * 
     * @parma  item  The name of the stock item, such as {@code "gtk-ok"} or {@code "gtk-apply"}.
     */
    public static GButton fromStock(final String item)
    {
	return new GButton(__fromStock(item));
    }
    
    
    
    /**
     * Native constructor
     */
    private static native long __new(); // gtk_button_new
    
    /**
     * Native constructor
     * 
     * @param   text  The text on the button
     * @return        The memory address of the component
     */
    private static native long __newWithLabel(String text); // gtk_button_new_with_label
    
    /**
     * Native constructor
     * 
     * @param   text  The text on the button, use underscore in front of characters that should be underlined, the first underline will be the mnemonic
     * @return        The memory address of the component
     */
    private static native long __newWithMnemonic(String text); // gtk_button_new_with_mnemonic
    
    /**
     * Native constructor
     * 
     * @param   item  Stock item identifier
     * @return        The memory address of the component
     */
    private static native long __fromStock(String item); // gtk_button_new_from_stock
    
    
    
    /**
     * Sets the relief styles of the edges
     * 
     * @param  style  The style
     */
    public void setRelief(final int style)
    {
	__setRelief(this.memaddress, style);
    }
    
    /**
     * Gets the relief styles of the edges
     * 
     * @return  The style
     */
    public int getRelief()
    {
	return __getRelief(this.memaddress);
    }
    
    /**
     * Sets the relief styles of the edges
     * 
     * @param  memaddress  The memory address of the component
     * @param  style       The style
     */
    private static native void __setRelief(long memaddress, int style); // gtk_button_set_relief
    
    /**
     * Gets the relief styles of the edges
     * 
     * @param   memaddress  The memory address of the component
     * @return              The style
     */
    private static native int __getRelief(long memaddress); // gtk_button_get_relief
    
    
    
    /**
     * Sets the text on the button
     * 
     * @param  text  The new text on the button
     */
    public void setText(final String text)
    {
	__setText(this.memaddress, text);
    }
    
    /**
     * Gets the text on the button
     * 
     * @return  The text on the button
     */
    public String getText()
    {
	return __getText(this.memaddress);
    }
    
    /**
     * Sets the text on the button
     * 
     * @param  memaddress  The memory address of the component
     * @param  text        The new text on the button
     */
    private static native void __setText(long memaddress, String text); // gtk_button_set_label
    
    /**
     * Gets the text on the button
     * 
     * @param   memaddress  The memory address of the component
     * @return              The text on the button
     */
    private static native String __getText(long memaddress); // gtk_button_get_label
    
    
    // TODO document
    
    
    /**
     */
    public void setStock(final boolean value)
    {
	__setStock(this.memaddress, value);
    }
    
    /**
     */
    public boolean isStock()
    {
	return __isStock(this.memaddress);
    }
    
    /**
     */
    private static native void __setStock(long memaddress, boolean value); // gtk_button_set_use_stock
    
    /**
     */
    private static native boolean __isStock(long memaddress); // gtk_button_get_use_stock
    
    
    
    /**
     */
    public void setUnderlined(final boolean value)
    {
	__setUnderlined(this.memaddress, value);
    }
    
    /**
     */
    public boolean isUnderlined()
    {
	return __isUnderlined(this.memaddress);
    }
    
    /**
     */
    private static native void __setUnderlined(long memaddress, boolean value); // gtk_button_set_use_underline
    
    /**
     */
    private static native boolean __isUnderlined(long memaddress); // gtk_button_get_use_underline
    
    
    
    // TODO http://developer.gimp.org/api/2.0/gtk/GtkButton.html#gtk-button-set-focus-on-click and onward
    
    
}

