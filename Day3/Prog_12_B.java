package Day3;

import java.util.Scanner;

public class Prog_12_B {

      // Prints a rectangle with the lines indicated by user with
      // this form:
      //    *
	  //   **
	  //  * *
	  // *  *
	  //*****

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScan=new Scanner(System.in);
		int     numLines=0;
		
		System.out.println("Enter a number of lines for shape B: ");
		numLines = myScan.nextInt();
		if (numLines < 2) {
			System.out.println("At least 2 lines, exit");
			return;
		}
		
		for (int i=numLines; i > 0; i--) {
	
			for (int j=1; j < numLines;j++)
			    if (j!=i && j!=numLines && i!= 1)
				    System.out.print(" ");
			    else
			    	System.out.print("*");
			System.out.print("*\n");
		}
	}   
}