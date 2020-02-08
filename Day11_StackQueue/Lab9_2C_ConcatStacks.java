package Day11_StackQueue;

	import java.util.LinkedList;
	import java.util.Queue;
	import java.util.Stack;

	public class Lab9_2C_ConcatStacks {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			LinkedList<Character> myStack1 = new LinkedList<Character>();
			LinkedList<Character> myStack2 = new LinkedList<Character>();
			LinkedList<Character> StackTmp = new LinkedList<Character>();
			int inStack1Size=0;
			char currChar, prevChar=' ';
			String s1="ABCDEFGH";				//Case 1
			String s2="IJKLMNOP";
			
			//Push all the characters of s1 into the stack1
			for (int i=0;i < s1.length();i++) {
				myStack1.push(s1.charAt(i));
			}
			System.out.println(myStack1);
			
			//Push all the characters of s2 into the stack2
			for (int i=0;i < s2.length();i++) {
				myStack2.push(s2.charAt(i));
			}
			System.out.println(myStack2);
			
			inStack1Size=myStack1.size();
			for (int i=0;i < inStack1Size;i++)
				StackTmp.push(myStack1.pop());
			for (int i=0;i < inStack1Size;i++)
				myStack2.push(StackTmp.pop());
			
			System.out.println(myStack2);
		}

	}
