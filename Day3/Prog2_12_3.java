package Day3;

import java.util.Scanner;

public class Prog2_12_3 {

       public static void main(String[] args) {
             Scanner myScan = new Scanner(System.in);
             String  str2Convert;
             char    chrCar;

             System.out.println("Enter a string to transform lower/upper: ");
             str2Convert = myScan.nextLine();
             System.out.println("Your string transformed is: ");

             for (int i=0;i < str2Convert.length();i++) {
                    chrCar = str2Convert.charAt(i);
                    if (Character.isLowerCase(chrCar)) 
                           System.out.print(Character.toUpperCase(chrCar));
                    else 
                           System.out.print(Character.toLowerCase(chrCar));
             }
       }
}