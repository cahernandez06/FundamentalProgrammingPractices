package Day11_StackQueue;

import java.util.LinkedList;

public class Lab9_2A_ExpresionChecking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Character> myStack = new LinkedList<Character>();
		int inStackSize=0, i = 0;
		char currChar, prevChar=' ';
		//String s1="(a + b[(x+y)] + 10)";  //Case 1
		//String s1="()";					//Case 2
		//String s1="[]";					//Case 3
		//String s1="((a+b)";				//Case 4
		//String s1="(([a+b))";				//Case 5
		//String s1="(a+b))";				//Case 6
		//String s1="a+(b+c)";				//Case 7
		//String s1="(a+b)+c";				//Case 8
		String s1="//  an (easy) comment where the parentheses are ignored";
		
		//Push all the () [] expressions in stack
		for (i=0;i < s1.length();i++) {
			if (s1.charAt(i)=='(' || s1.charAt(i)=='[' )
				myStack.push(s1.charAt(i));
			if (s1.charAt(i)==')' || s1.charAt(i)==']') {
				if (myStack.isEmpty())
					break;
				else
					currChar=myStack.pop();
				if (currChar=='(' && s1.charAt(i) != ')') {
					System.out.println("Sintax error in your expression, missing ')'");
					break;
				}
				if (currChar=='[' && s1.charAt(i) != ']') {
					System.out.println("Sintax error in your expression, missing ']'");
					break;
				}
			}

		}
		inStackSize = myStack.size();
		if (inStackSize > 0 || i != s1.length())
			System.out.println("Sintax error in your expression");
		else
			System.out.println("Expression sintax correct!");
	}

}
