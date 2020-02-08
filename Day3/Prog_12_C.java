package Day3;

import java.util.Scanner;

public class Prog_12_C {

       public static void main(String[] args) {
           // Prints a rectangle with the lines indicated by user with
  	       // this form:
  	       //         *    
    	   //        * *   
    	   //       *   *  
    	   //      *     * 
    	   //     *********

             Scanner myScan=new Scanner(System.in);
             int     numLines=0;
             int     base=0;
           
             System.out.println("Enter a number of lines for shape C: ");
             numLines = myScan.nextInt();
             base = numLines;
            
             if (numLines < 2) {
                    System.out.println("At least 2 lines, exit");
                    return;
             }
           
             for (int i=0; i < numLines; i++) {
                    for (int j=1; j < base*2;j++)
                        if (j==(base-i)||j==(base+i)||i==(numLines-1))
                               System.out.print("*");
                        else
                           System.out.print(" ");

                    System.out.print("\n");
             }
       }
}