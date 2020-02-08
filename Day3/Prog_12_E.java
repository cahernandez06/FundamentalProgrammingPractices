package Day3;

import java.util.Scanner;

public class Prog_12_E {

	    // Prints a rectangle with the lines indicated by user with
	    // this form, if it is an even number there is no peak at end:
	    //   *
		//  **
		// * *
		//  **
		//   *
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner myScan=new Scanner(System.in);
			int     numLines=0;
			int     half=0,k=1;
			
			System.out.println("Enter a number of lines for shape E: ");
			numLines = myScan.nextInt();
			half = numLines/2;
			k = half+1;
			
			if (numLines < 3) {
				System.out.println("At least 3 lines, exit");
				return;
			}
			
			for (int i=0; i < numLines; i++) {
				for (int j=1; j <= half+1;j++) {
					if (j==half+1) {
				        System.out.print("*\n");
				        if (i < half)
				        	k--;
				        else // (i > half). j reaches the half, begin to increase
				        	k++;
						continue;
					}
			        if (j==k) {
				        System.out.print("*");
			        }else {
			    	    System.out.print(" ");
			        }
				}
			}
		}
}
