package Day14_RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class CheckColombiaPhones {
    private static final String STOP    = "STOP";
    private static final String VALIDMOB   = "Valid phone number (Mobile)";
    private static final String VALIDFIX   = "Valid phone number (Fixed)";
    private static final String INVALID = "Not a valid Colombia phone number";

    private static final String VALID_IDENTIFIER_PAT_MOB
                   	= "[0-9]{3}-[0-9]{7}";   //Mobile example: 300-4633523
    private static final String VALID_IDENTIFIER_PAT_FIX
    				= "\\([0-9]\\)[0-9]{7}"; //Fixed example: (4)3252754

    public static void main (String[] args) {
        String str, reply=INVALID;
        while (true) {
            str = JOptionPane.showInputDialog(null, "Enter your Colombia phone number:");

            if (str.equals(STOP)) break;
            if (str.matches(VALID_IDENTIFIER_PAT_MOB)) {
                reply = VALIDMOB;

            } else if (str.matches(VALID_IDENTIFIER_PAT_FIX)){
                reply = VALIDFIX;
            } else 
                reply = INVALID;
            
            JOptionPane.showMessageDialog(null,
                                          str + ":\n" + reply);
        }
    }
}
