package Day7_Ex1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exponential myExp = new Exponential();
		Scanner myScan = new Scanner(System.in);
		double base = 0;
		int exp = 0;
		
		System.out.println("Exponential: Give me the base: ");
		base = myScan.nextInt();
		System.out.println("Give me the exp: ");
		exp = myScan.nextInt();
		System.out.printf("Exponential of %.2f at %d is: %.2f",base,exp,myExp.power(base,exp));
	}

}
