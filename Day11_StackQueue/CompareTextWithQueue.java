package Day11_StackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CompareTextWithQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Character> myQueue = new LinkedList<Character>();
		Scanner myScan = new Scanner(System.in);
		boolean diffs=false;
		int sizeQueue=0;
		char chQueue;
		String[] strParts;
		String usrString;
		
		System.out.println("Enter two strings separated with ':' to compare: ");
		usrString=myScan.nextLine();
		
		strParts=usrString.split(":");
		if (strParts.length < 1||usrString.charAt(usrString.length()-1)==':'||strParts.length > 2) {
			System.out.println("Nothing to compare ");
			return;
		}
		
		//Populate queue
		for (int i=0;i < strParts[0].length();i++)
			myQueue.add(strParts[0].charAt(i));

		if (strParts.length < 2) {
			System.out.println("N: No colon on the line");  //Prints first part
			return;
		}
		sizeQueue=myQueue.size();
		//Compare 2nd string with queue
		for (int i=0;i < strParts[1].length();i++) {
			if (!myQueue.isEmpty())
				chQueue=myQueue.remove();
			else
				break;
			if (chQueue!=strParts[1].charAt(i)) {
				diffs=true;
				break;
			}
		}
		if (sizeQueue==strParts[1].length()&&!diffs)
			System.out.println("S:The left and right parts are exactly the same");
		else if (sizeQueue==strParts[1].length())
			System.out.println("D:The left and right parts have the same length but are different");
		else if (sizeQueue>strParts[1].length())
			System.out.println("L:The left part (before the colon) is longer than the right.");
		else //strParts[1].length()>sizeQueue
			System.out.println("R:The right part (after the colon) is longer than the left");


	}

}
