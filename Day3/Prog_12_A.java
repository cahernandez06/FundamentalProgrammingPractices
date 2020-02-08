package Day3;

import java.util.Scanner;

public class Prog_12_A {

    // Prints a rectangle with the lines indicated by user with
    // this form:
    // *
	// **
	// * *
	// *  *
	// *****
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScan=new Scanner(System.in);
		int     numLines=0;
		
		System.out.println("Enter a number of lines for shape A: ");
		numLines = myScan.nextInt();
		if (numLines < 2) {
			System.out.println("At least 2 lines, exit");
			return;
		}
		
		for (int i=1; i <= numLines; i++) {
	
			for (int j=1; j < i;j++)
			    if (j!=1&&i!=numLines)
				    System.out.print(" ");
			    else
			    	System.out.print("*");
			System.out.print("*\n");
		}
		//for (int i=1;i <= numLines;i++) {
			//if (i != numLines)
			//  System.out.format("%s%"+(i)+"s\n","*","*");
			//else System.out.format("%"+(i+1)+"s\n", "*");
		//}

	}   
}
