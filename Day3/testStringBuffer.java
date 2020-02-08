package Day3;

import java.util.Scanner;

public class testStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScan;
		String  answer;
		char    chrCar;
		
		myScan = new Scanner(System.in);
		System.out.println("Type a string: ");
		answer = myScan.nextLine(); 
		
		StringBuffer myStringB = new StringBuffer(answer);
		myStringB.append("bye");
		System.out.println(myStringB);
		
		System.out.println("Your string transformed is: ");
			
		for (int i=0;i < myStringB.length();i++) {
			chrCar = myStringB.charAt(i);
			if (Character.isLowerCase(chrCar)) {
				System.out.print(Character.toUpperCase(chrCar));
			} else 
				System.out.print(Character.toLowerCase(chrCar));

		}
	}

}
