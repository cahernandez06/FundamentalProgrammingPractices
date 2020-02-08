package Day11_StackQueue;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Lab9_1A_ReverseStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> myStack = new LinkedList<Integer>();
		Scanner myScan = new Scanner(System.in);
		String strNumber;
		int inNumber=0, inStackSize=0;
		
		System.out.println("Enter some integers for me to reverse (-1 to end): ");
		while (inNumber!=-1) {
			strNumber=myScan.nextLine();
			try {
				inNumber = Integer.parseInt(strNumber);
			}
			catch (Exception e) {
				System.out.println("Invalid number");
				continue;
			}
			if (inNumber != -1)
				myStack.push(inNumber);
		}
		
		System.out.println("The integers reversed are :");
		inStackSize=myStack.size();
		for (int i=0; i < inStackSize;i++) {
			inNumber=myStack.pop();
			System.out.printf("%d",inNumber);
			if (i!=inStackSize-1)
				System.out.printf("%c ",',');
		}

	}

}
