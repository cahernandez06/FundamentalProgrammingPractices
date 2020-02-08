package Day8_Prog7_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
*   This frame includes one MenuBar, two Menu objects File and Edit,
 *   and eight MenuItem objects. When a menu item is selected, a string
 *   showing which menu choice is selected will appear on the frame.
 *
  */

class MyMenuFrame extends JFrame implements ActionListener
{

//----------------------------------
//    Data Members
//----------------------------------

    /**
     * Default frame width
     */
    private static final int FRAME_WIDTH    = 300;

    /**
     * Default frame height
     */
    private static final int FRAME_HEIGHT   = 250;

    /**
     * X coordinate of the frame default origin point
     */
    private static final int FRAME_X_ORIGIN = 150;

    /**
     * Y coordinate of the frame default origin point
     */
    private static final int FRAME_Y_ORIGIN = 250;

    /**
     * Text shown in response to the menu selection
     */
    private JLabel   response;

    /**
     * File menu group
     */
    private JMenu    fileMenu;

    /**
     * Edit menu group
     */
    private JMenu    editMenu;
    
    /**
     * Color menu group
     */
    private JMenu    colorMenu;


//----------------------------------
//      Main method
//----------------------------------
    public static void main(String[] args) {
        MyMenuFrame frame = new MyMenuFrame();
        frame.setVisible(true);
    }

//----------------------------------
//    Constructors
//----------------------------------

    /**
     * Default constructor
     */
    public MyMenuFrame()
    {
        Container contentPane;

        //set the frame properties
        setTitle     ("MyMenuFrame  : Testing Swing Menus");
        setSize      (FRAME_WIDTH, FRAME_HEIGHT);
        setResizable (false);
        setLocation  (FRAME_X_ORIGIN, FRAME_Y_ORIGIN);


        contentPane = getContentPane( );
        contentPane.setLayout(null);
        contentPane.setBackground( Color.white );

        //create two menus and their menu items
        createFileMenu();
        createEditMenu();
        createColorMenu();

        //and add them to the menubar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(colorMenu);

        //create and position reponse label
        response = new JLabel("Hello, this is your menu tester." );
        response.setBounds(50, 50, 250, 50);
        contentPane.add(response);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent event) {
        String  menuName;
        Container contentPane;
        
        menuName = event.getActionCommand();

        if (menuName.equals("Quit")) {
           System.exit(0);
        } 
        contentPane = getContentPane( );
        switch (menuName) {
        	case "Erase":
        		contentPane.setBackground( Color.white );
                break;
        	case "Red":
        		contentPane.setBackground( Color.red );
                break;
        	case "Green":
        		contentPane.setBackground( Color.green );
                break;
        	case "Blue":
        		contentPane.setBackground( Color.blue );
                break;
        	case "Pink":
        		contentPane.setBackground( Color.pink );
                break;
        	case "Black":
        		contentPane.setBackground( Color.black );
                break;
        }
    }

    private void createFileMenu( ) {
        JMenuItem    item;

        fileMenu = new JMenu("File");

        item = new JMenuItem("Quit");       //Quit
        item.addActionListener( this );
        fileMenu.add( item );
    }

    /**
     * Create Edit menu and its menu items
     *
     */
    private void createEditMenu( ) {
        JMenuItem    item;

        editMenu = new JMenu("Edit");

        item = new JMenuItem("Erase");      //Cut
        item.addActionListener( this );
        editMenu.add( item );
    }

    /**
     * Create Edit menu and its menu items
     *
     */
    private void createColorMenu( ) {
        JMenuItem    item;

        colorMenu = new JMenu("Color");

        item = new JMenuItem("Red");      //Red
        item.addActionListener( this );
        colorMenu.add( item );

        item = new JMenuItem("Green");    //Green
        item.addActionListener( this );
        colorMenu.add( item );

        item = new JMenuItem("Blue");    //Blue
        item.addActionListener( this );
        colorMenu.add( item );
        
        item = new JMenuItem("Pink");    //Pink
        item.addActionListener( this );
        colorMenu.add( item );

        item = new JMenuItem("Black");    //Black
        item.addActionListener( this );
        colorMenu.add( item );
    }
    
}
