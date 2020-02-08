package Day8_Prog7_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Prog_7_1 extends JFrame implements ActionListener {

    // Default frame width
    private static final int FRAME_WIDTH    = 710;

    // Default frame height
    private static final int FRAME_HEIGHT   = 280;

    // X coordinate of the frame default origin point
    private static final int FRAME_X_ORIGIN = 150;

    // Y coordinate of the frame default origin point
    private static final int FRAME_Y_ORIGIN = 250;

     // Default width for buttons
    private static final int BUTTON_WIDTH  = 80;

    // Default height for buttons
    private static final int BUTTON_HEIGHT = 30;

    // Constant for empty string
    private static final String EMPTY_STRING = "";

    // Constant for platform specific newline
    private static final String NEWLINE = System.getProperty("line.separator");

    // The Swing button for Submit
    private JButton submitButton;

    // The Swing button for Text fields
    private JTextField inpName, inpStreet, inpCity, inpState, inpZip;

    // The JTextArea for displaying the entered text
    private JTextArea  textArea;


//----------------------------------
//      Main method
//----------------------------------
    public static void main(String[] args) {
        Prog_7_1 frame = new Prog_7_1();
        frame.setVisible(true);
    }

//----------------------------------
//    Constructors
//----------------------------------
    public Prog_7_1() {
        Container contentPane;

        //set the frame properties
        setSize      (FRAME_WIDTH, FRAME_HEIGHT);
        setResizable (false);
        setTitle     ("Program Ch7TextFrame3");
        setLocation  (FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

        contentPane = getContentPane( );
        contentPane.setLayout( null );
        //contentPane.setBackground( Color.white );

        //create and place two buttons on the frame
        submitButton = new JButton("Submit");
        submitButton.setBounds(290, 180, BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(submitButton);

        //register this frame as an action listener 
        submitButton.addActionListener(this);

        JLabel lblName = new JLabel("Name");
        lblName.setBounds(90, 25, 170, 25);
        inpName = new JTextField();
        inpName.setBounds(90, 50, 170, 25);
        contentPane.add(lblName);
        contentPane.add(inpName);

        JLabel lblStreet = new JLabel("Street");
        lblStreet.setBounds(270, 25, 170, 25);
        inpStreet = new JTextField();
        inpStreet.setBounds(270, 50, 170, 25);
        contentPane.add(lblStreet);
        contentPane.add(inpStreet);
        
        JLabel lblCity = new JLabel("City");
        lblCity.setBounds(450, 25, 170, 25);
        inpCity = new JTextField();
        inpCity.setBounds(450, 50, 170, 25);
        contentPane.add(lblCity);
        contentPane.add(inpCity);
        
        JLabel lblState = new JLabel("State");
        lblState.setBounds(160, 85, 170, 25);
        inpState = new JTextField();
        inpState.setBounds(160, 110, 170, 25);
        contentPane.add(lblState);
        contentPane.add(inpState);
        
        JLabel lblZip = new JLabel("Zip");
        lblZip.setBounds(340, 85, 170, 25);
        inpZip = new JTextField();
        inpZip.setBounds(340, 110, 170, 25);
        contentPane.add(lblZip);
        contentPane.add(inpZip);
        
        //register 'Exit upon closing' as a default close operation
        setDefaultCloseOperation( EXIT_ON_CLOSE );
    }


    public void actionPerformed(ActionEvent event) {

        if (event.getSource() instanceof JButton) {
            JButton clickedButton = (JButton) event.getSource();

            if (clickedButton == submitButton) {//Same Addresses.Same object
                System.out.printf("%s \n%s\n%s, %s %s",inpName.getText(),inpStreet.getText(),inpCity.getText(),inpState.getText(),inpZip.getText());
            } 
        } 
    }

}
