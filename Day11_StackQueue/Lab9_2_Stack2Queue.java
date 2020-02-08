package Day11_StackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Lab9_2_Stack2Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Character> myStack = new LinkedList<Character>();
		Queue<Character> myQueue = new LinkedList<Character>();
		int inStackSize=0;
		char currChar, prevChar=' ';
		String s1="ABCDEFGH";				//Case 1
		
		//Push all the characters into the stack
		for (int i=0;i < s1.length();i++) {
			myStack.push(s1.charAt(i));
		}
		System.out.println(myStack);
		inStackSize=myStack.size();
		for (int i=0;i < inStackSize;i++)
			myQueue.add(myStack.pop());
		System.out.println(myQueue);
	}

}
