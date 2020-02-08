package Day11_StackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Lab9_2_Queue2Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Character> myStack = new LinkedList<Character>();
		Queue<Character> myQueue = new LinkedList<Character>();
		int inStackSize=0;
		char currChar, prevChar=' ';
		String s1="ABCDEFGH";				//Case 1
		
		//Populate queue
		for (int i=0;i < s1.length();i++)
			myQueue.add(s1.charAt(i));
		System.out.println(myQueue);
		
		inStackSize=myQueue.size();
		//Push all the characters into the stack
		for (int i=0;i < inStackSize;i++) {
			currChar=myQueue.remove();
			myStack.push(currChar);
		}
		System.out.println(myStack);
	}

}
