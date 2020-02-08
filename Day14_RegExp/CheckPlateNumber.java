package Day14_RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class CheckPlateNumber {
    private static final String STOP    = "STOP";
    private static final String VALID   = "Valid plate identifier";
    private static final String INVALID = "Not a valid plate identifier";

    private static final String VALID_IDENTIFIER_PATTERN
                   = "[a-zA-Z]{2}-[0-9]{4}-[a-zA-Z]{3}";

    public static void main (String[] args) {
        String str, reply;
        while (true) {
            str = JOptionPane.showInputDialog(null, "Enter you Plate:");

            if (str.equals(STOP)) break;
            if (str.matches(VALID_IDENTIFIER_PATTERN)) {
                reply = VALID;

            } else {
                reply = INVALID;
            }
            JOptionPane.showMessageDialog(null,
                                          str + ":\n" + reply);
        }
    }
}
