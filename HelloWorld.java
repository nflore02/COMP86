/*
 * Nick Flores
 * nicholas.flores@tufts.edu
 * HelloWorld: implementation for simple output button
 */

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HelloWorld extends JButton implements ActionListener {
    protected HelloWorld (String label) {
    	// Pass in label text
    	setText (label);
    	addActionListener (this);
    }
    
    public void actionPerformed (ActionEvent e) {
    	// Print out
    	System.out.println ("Hello World");
    }
}