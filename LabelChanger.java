/*
 * Nick Flores
 * nicholas.flores@tufts.edu
 * LabelChanger: implementation for label changing button
 */

import javax.swing.JButton;
import javax.swing.Timer;
import javax.swing.text.JTextComponent;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LabelChanger extends JButton implements ActionListener {
    protected LabelChanger (String label) {
    	// Pass in label text
    	setText (label);
    	addActionListener (this);
    }
    
    public void actionPerformed(ActionEvent e) {
    	// Initial text
    	setText("Processing...");
    	ActionListener taskPerformer = new ActionListener() {
    		
    		public void actionPerformed(ActionEvent evt) {
    			// Text after delay, then prints
    			setText("Processed");
    			System.out.println ("The button is done processing");
    		}
        };
        // Delay for label changing
        Timer process = new Timer(1000, taskPerformer);
        process.setRepeats(false);
        process.start();
    }
}