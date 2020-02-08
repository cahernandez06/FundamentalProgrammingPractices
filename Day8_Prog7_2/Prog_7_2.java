package Day8_Prog7_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Prog_7_2 extends JFrame implements ActionListener {

    // Default frame width
    private static final int FRAME_WIDTH    = 510;

    // Default frame height
    private static final int FRAME_HEIGHT   = 260;

    // X coordinate of the frame default origin point
    private static final int FRAME_X_ORIGIN = 150;

    // Y coordinate of the frame default origin point
    private static final int FRAME_Y_ORIGIN = 250;

     // Default width for buttons
    private static final int BUTTON_WIDTH  = 140;

    // Default height for buttons
    private static final int BUTTON_HEIGHT = 30;

    // Constant for empty string
    private static final String EMPTY_STRING = "";

    // Constant for platform specific newline
    private static final String NEWLINE = System.getProperty("line.separator");

    // The Swing button for Submit
    private JButton countButton;
    private JButton reverseButton;
    private JButton removeButton;

    // The Swing button for Text fields
    private JTextField inpInput, inpOutput, inpCity, inpState, inpZip;

    // The JTextArea for displaying the entered text
    private JTextArea  textArea;


//----------------------------------
//      Main method
//----------------------------------
    public static void main(String[] args) {
        Prog_7_2 frame = new Prog_7_2();
        frame.setVisible(true);
    }

//----------------------------------
//    Constructors
//----------------------------------
    public Prog_7_2() {
        Container contentPane;

        //set the frame properties
        setSize      (FRAME_WIDTH, FRAME_HEIGHT);
        setResizable (false);
        setTitle     ("String Utilities");
        setLocation  (FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

        contentPane = getContentPane( );
        contentPane.setLayout( null );
        //contentPane.setBackground( Color.white );

        //create and place two buttons on the frame
        countButton = new JButton("Count Letters");
        countButton.setBounds(50, 30, BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(countButton);

        reverseButton = new JButton("Reverse Letters");
        reverseButton.setBounds(50, 80, BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(reverseButton);
        
        removeButton = new JButton("Remove Duplicates");
        removeButton.setBounds(50, 130, BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(removeButton);
        
        //register this frame as an action listener 
        countButton.addActionListener(this);
        reverseButton.addActionListener(this);
        removeButton.addActionListener(this);

        JLabel lblInput = new JLabel("Input");
        lblInput.setBounds(220, 25, 200, 25);
        inpInput = new JTextField();
        inpInput.setBounds(220, 50, 200, 25);
        contentPane.add(lblInput);
        contentPane.add(inpInput);

        JLabel lblOutput = new JLabel("Output");
        lblOutput.setBounds(220, 85, 200, 25);
        inpOutput = new JTextField();
        inpOutput.setBounds(220, 110, 200, 25);
        contentPane.add(lblOutput);
        contentPane.add(inpOutput);
        
        //register 'Exit upon closing' as a default close operation
        setDefaultCloseOperation( EXIT_ON_CLOSE );
    }


    public void actionPerformed(ActionEvent event) {

        if (event.getSource() instanceof JButton) {
            JButton clickedButton = (JButton) event.getSource();

            if (clickedButton == countButton) {//Same Addresses.Same object
                inpOutput.setText(countLetters(inpInput.getText()));
            } 
            if (clickedButton == reverseButton) {//Same Addresses.Same object
                inpOutput.setText(reverseLetters(inpInput.getText()));
            } 
            if (clickedButton == removeButton) {//Same Addresses.Same object
                inpOutput.setText(removeDups(inpInput.getText()));
            } 
        } 
    }

    public static String countLetters(String str) {
    	return Integer.toString(str.length());
    }
    
    public static String reverseLetters(String str) {
    	String myRevStr="";
    	
    	for (int i=str.length()-1; i >= 0;i--)
    		myRevStr += str.charAt(i);
    	return myRevStr;
    }
    
    public static String removeDups(String str) {
    	String myNodupStr="";
    	
    	for (int i=0;i < str.length(); i++)
    		if (contains(myNodupStr,str.charAt(i))==false)
    			myNodupStr += str.charAt(i);
    	return myNodupStr;
    }
    
    public static boolean contains(String str, char chr ) {

        for(int i = 0; i < str.length(); i++)
            if(str.charAt(i) == chr)
                return true;
        return false;
    }

}
