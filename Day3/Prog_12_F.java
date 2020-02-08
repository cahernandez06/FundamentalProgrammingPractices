package Day3;

import java.util.Scanner;

public class Prog_12_F {

    // Prints a rectangle with the lines indicated by user with
    // this form, if it is an even number there is no peak at end:
    //   *
	//  * *
	// *   *
	//  * *
	//   *
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScan=new Scanner(System.in);
		int     numLines=0;
		int     half=0,k=0;
		
		System.out.println("Enter a number of lines for shape D: ");
		numLines = myScan.nextInt();
		half = numLines/2;
		//k = half+1;
		
		if (numLines < 3) {
			System.out.println("At least 3 lines, exit");
			return;
		}
		
		for (int i=0; i < numLines; i++) {
			for (int j=0; j < half+k+1;j++) {
				if (j == half-k || j == half+k)
					System.out.print("*");
				else
					System.out.print(" ");
			}
	        System.out.print("\n");
			if (i < half) 
				k++;
			else 
				k--;
		}
	}
}