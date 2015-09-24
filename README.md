Nick Flores
9/23/15
nicholas.flores@tufts.edu
COMP86 - Homework Assignment 1 "Hello World"

Synopsis:
	This is a simple Swing program with 3 implemented interface widgets,
	two buttons and a text field. All produce standard output.

Files:
	Main.java:
		This is the main for the program. It creates the interface
		window, an instance of each button/widget, then adds them all 
		together and displays the program.
	
	HelloWorld.java:
		This is the implementation for the simpler of the two buttons.
		It creates a JButton with an ActionListener and prints using
		standard output whith the an ActionEvent.
		
	LabelChanger.java:
		This is the implementation for the latter button. It creates a 
		JButton similar to HelloWorld's method. LabelChanger has two
		ActionEvent's which change the button's label after a short
		delay.
		
	TextField.java:
		This is the implementation for the text field widget in the 
		program. It creates a JTextField with a corresponding label. 
		The ActionEvent allows the user type text into the text box
		and is printed using standard output.
		
	NOTE:
		Each .java file has a corresponding .class file that is created
		by the Java compiler.
		
Running the Program:
	While in the Correct Directory:
		Compile - javac Main.java
		Run - java Main
		
END