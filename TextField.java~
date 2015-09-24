/*
 * Nick Flores
 * nicholas.flores@tufts.edu
 * TextField class: implementation for text field widget
 */
 
import javax.swing.*;

import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TextField extends JPanel implements ActionListener {
	protected JTextField textField;
	
	protected TextField () {
		// Create/Initialize text field and label
		String label = "Type and Press Enter for Standard Output:";
		JLabel myLabel = new JLabel(label);
		textField = new JTextField(20);
        textField.addActionListener(this);

        // Create the text box with GridBagConstraints
        GridBagConstraints textBox = new GridBagConstraints();
        textBox.gridwidth = GridBagConstraints.REMAINDER;
        textBox.fill = GridBagConstraints.HORIZONTAL;
        
        // Add label and text box
        add(myLabel, textBox);
        add(textField, textBox);
    }
	
	public void actionPerformed(ActionEvent evt) {
		// Get text from text field and print
        String text = textField.getText();
        System.out.println (text);
    }
}