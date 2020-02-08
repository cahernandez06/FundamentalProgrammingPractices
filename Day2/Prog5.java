package Day2;

import java.util.Scanner;

public class Prog5 {

	public static void main(String[] args) {
		// 2. part a: Reverse string
		String toReverse;
		Scanner myScan = new Scanner(System.in);
		
		System.out.println("Enter the string to reverse: ");
		toReverse = myScan.nextLine();
		System.out.print("The reversed string is: ");
		for (int i=toReverse.length()-1;i >= 0;i--) {
			System.out.print(toReverse.charAt(i));
		}
		System.out.println(" ");
		
		// 2. part b: How many 'x' characters the string has
		String strToCheck;
		int countXs=0;
		
		System.out.println("Enter the string to check how many x's: ");
		strToCheck = myScan.nextLine();	
		
		for (int i=0;i < strToCheck.length();i++) {
			if (strToCheck.charAt(i)=='x') {
				countXs++;
			}
		}
		System.out.print("The string has: " + countXs + " ocurrencies of x");
	}

}
