/*
 * Nick Flores
 * nicholas.flores@tufts.edu
 * Main class: creates window and adds widgets/buttons
 */
 
import javax.swing.*;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

public class Main extends JFrame {
    public static void main (String [] args) {
    	new Main ();
    }
    
    protected Main () {
	// Window setup
	Container window = getContentPane();
	window.setLayout(new FlowLayout());
	setSize(800, 200);

	// Hello World Button
	HelloWorld b1 = new HelloWorld ("Click Me");
	b1.setPreferredSize(new Dimension(100, 100));
	window.add (b1);
	
	// Label Changer Button
	LabelChanger b2 = new LabelChanger ("Click Me Too");
	b2.setPreferredSize(new Dimension(100, 100));
	window.add (b2);
	
	// Text Field
	TextField textField = new TextField();
	window.add (textField);

	// Show the window
	setVisible (true);
    }
}