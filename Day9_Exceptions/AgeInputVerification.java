package OtherPck9;

import javax.swing.*;

class AgeInputVerification {
    /** Default prompt message */
    private static final String DEFAULT_MESSAGE = "Your age:";
    /**
     * Default constructor
     */
    public AgeInputVerification ( ) {
    }
    public static void main(String[] args) {
    	int usrAge=0;
    	
    	usrAge=getAge("Type you age: ");
    	System.out.println("Your age: "+usrAge);
    }
    /**
     * Inputs the age from an input dialog with
     * default prompt
     */
    public static int getAge() {

        return getAge(DEFAULT_MESSAGE);
    }
    /**
     * Inputs the age from an input dialog with
     * the designated prompt
     *
     * @param prompt message to prompt the user
     */
    public static int getAge(String prompt) {
        String inputStr;
        int    age;
        while (true) {
            inputStr  = JOptionPane.showInputDialog(null, prompt);
            try {
                age = Integer.parseInt(inputStr);
                assert (age >= 0 && age <= 140) : " age not valid!: "+age;
                return age;  //  We get out.
                 } 
           catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "'" + inputStr + "' is invalid\n"
                                            + "Please enter digits only");
            }
            finally {
                System.out.println("getAge is done");
            }
        }
        
    }

}
