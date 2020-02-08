package Day3;

import java.util.Scanner;

public class Prog_12_D {

    // Prints a rectangle with the lines indicated by user with
    // this form, if it is an even number there is no peak at end:
    // *
	// **
	// * *
	// * *
	// **
	// *
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScan=new Scanner(System.in);
		int     numLines=0;
		int     half=0,k=1;
		
		System.out.println("Enter a number of lines for shape D: ");
		numLines = myScan.nextInt();
		half = numLines/2;
		k = half;
		
		if (numLines < 3) {
			System.out.println("At least 3 lines, exit");
			return;
		}
		
		for (int i=0; i < numLines; i++) {
	        System.out.print("*");
			for (int j=1; j <= i;j++) {
				if (i <= half) {
			        if (i==j)
				        System.out.print("*");
			        else
			    	    System.out.print(" ");
				}
				else {  // (i > half). j reaches the half, begin to decrease
					k--;
			        if (j==k)
				        System.out.print("*");
			        else {
			    	    System.out.print(" ");
						k++;
			        }
				}
			}
	        System.out.print("\n");
		}
	}
}
