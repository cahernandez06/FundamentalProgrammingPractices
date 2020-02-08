package Day10;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class ListProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numTmp=0, numPos=0;
		Scanner myScan = new Scanner(System.in);
		String strUsr=null;

		
		String strCommand;
		char chCommand='X';
		LinkedList<Character> A = new LinkedList<Character>();
		LinkedList<Character> B = new LinkedList<Character>();
		LinkedList<Character> C = new LinkedList<Character>();
		LinkedList<Character> temp = new LinkedList<Character>();
		
		while (chCommand != 'Q') {
			System.out.println("\nEnter command: \n  (R)ead \n  (W)rite \n  (D)elete \n  (E)qual \n  (C)oncat\n  (L)ength \n  (I)nsert  \n  (Q)uit ");
			strCommand = myScan.nextLine();
			chCommand = Character.toUpperCase(strCommand.charAt(0));

			switch (chCommand) {
			case 'R': 	strUsr= askAorBorC();
						if (strUsr.equalsIgnoreCase("A")||strUsr.equalsIgnoreCase("B")||strUsr.equalsIgnoreCase("C")) {
							temp = Readstring();
							if (strUsr.equalsIgnoreCase("A"))
								A=temp;
							else if (strUsr.equalsIgnoreCase("B"))
								B=temp;
							else C=temp;
						}
						break;
			case 'W': 	strUsr= askAorBorC();
						if (strUsr.equalsIgnoreCase("A")||strUsr.equalsIgnoreCase("B")||strUsr.equalsIgnoreCase("C")) {
							if (strUsr.equalsIgnoreCase("A"))
								temp=A;
							else if (strUsr.equalsIgnoreCase("B"))
								temp=B;
							else
								temp=C;
							Writestring(temp);
						}
						break;
			case 'D':	strUsr= askAorBorC();
						if (strUsr.equalsIgnoreCase("A")||strUsr.equalsIgnoreCase("B")||strUsr.equalsIgnoreCase("C")) {
							if (strUsr.equalsIgnoreCase("A"))
								Clear(A);
							else if (strUsr.equalsIgnoreCase("B"))
								Clear(B);
							else 
								Clear(C);
							break;
						}
			case 'L':	strUsr= askAorBorC();
						if (strUsr.equalsIgnoreCase("A")||strUsr.equalsIgnoreCase("B")||strUsr.equalsIgnoreCase("C")) {
							if (strUsr.equalsIgnoreCase("A"))
								temp=A;
							else if (strUsr.equalsIgnoreCase("B"))
								temp=B;
							else
								temp=C;
							numTmp=Len(temp);
							System.out.printf("Length of LinkedList %s is: %d\n",strUsr,numTmp);
							break;
						}
						break;
			case 'E':	numTmp = String2Operate();
						if (numTmp==1)
							System.out.printf("A is equal to B?: %b\n",Equal(A,B));
						else if (numTmp==2)
							System.out.printf("B is equal to C?: %b\n",Equal(B,C));
						else if (numTmp==3)
							System.out.printf("A is equal to C?: %b\n",Equal(C,A));
						break;
			case 'C':	numTmp = String2Operate();
						if (numTmp==1)
							Concatenate(A,B);
						else if (numTmp==2)
							Concatenate(B,C);
						else if (numTmp==3)
							Concatenate(A,C);
						System.out.println("Concatenated.");
						break;
			case 'I':	numTmp = String2Operate();
						System.out.println("from position?: ");
						numPos = Integer.parseInt(myScan.nextLine());
						if (numTmp==1)
							Insert(A,B,numPos);
						else if (numTmp==2)
							Insert(B,C,numPos);
						else if (numTmp==3)
							Insert(A,C,numPos);
						break;
			case 'Q': System.out.printf("Q choosen, thanks for using!");
						break;
			default: System.out.printf("Not a valid command: %c\n",chCommand);
			}
		}
	}
	
	public static LinkedList<Character> Readstring() {
		String strUsr=null;
		LinkedList<Character> tmp = new LinkedList<Character>();
		Scanner myScan = new Scanner(System.in);
		
		System.out.printf("Enter text: ");
		strUsr = myScan.nextLine();
		if (strUsr==null) {
			System.out.println("Not a valid text");
			return null;
		}

		for (int i=0;i < strUsr.length();i++)
			tmp.add(strUsr.charAt(i));
		
		return tmp;
		
	}
	
	public static void Writestring(LinkedList<Character> llStr) {
		Iterator It1 = llStr.iterator();
		
		if (llStr.isEmpty()) {
			System.out.println("String is empty");
			return;
		}
		
		while (It1.hasNext()) {
			System.out.printf("%c",It1.next());
		}
		System.out.println("");
		
	}
	
	public static boolean Equal(LinkedList<Character> llStr1, LinkedList<Character> llStr2) {
		Iterator It1 = llStr1.iterator();
		Iterator It2 = llStr2.iterator();
		char char1, char2;
		int Len1=0, Len2=0;
		
		if (llStr1.isEmpty()&&llStr2.isEmpty()) {
			return true; //Both empty, returns equal=true
		}
		
		if (llStr1.isEmpty()||llStr2.isEmpty()) {
			return false; //One is empty, the other not
		}
		
		Len1 = Len(llStr1);
		Len2 = Len(llStr2);
		if (Len1 != Len2)
			return false;
		
		while (It1.hasNext()) {
			char1 = (char) It1.next();
			char2 = (char) It2.next();
			if (char1!=char2)
				return false;
		}
		return true;
		
	}
	
	public static void Concatenate(LinkedList<Character> llTarget, LinkedList<Character> llSource) {
		Iterator ItSource = llSource.iterator();
		char char1;
		
		if (llSource.isEmpty()) {
			return; 
		}
		
		while (ItSource.hasNext()) {
			char1 = (char) ItSource.next();
			llTarget.add(char1);
		}
	}

	public static void Insert(LinkedList<Character> llTarget, LinkedList<Character> llSource, int Start) {
		Iterator ItSource = llSource.iterator();
		Iterator ItTarget = llTarget.iterator();
		int i=Start;
		char char1;
		
		if (llSource.isEmpty()) {
			return; 
		}
		
		if (Start > llTarget.size()) {
			System.out.println("Invalid position to insert");
			return;
		}
		
		while (ItSource.hasNext()) {
			char1 = (char) ItSource.next();
			//llTarget.add(char1);
			llTarget.add(i,char1);
			i++;
		}
		System.out.println("Inserted");
	}
	
	public static int Len(LinkedList<Character> llStr) {
		int i=0;
		Iterator It1 = llStr.iterator();
		
		if (llStr.isEmpty()) {
			return 0;
		}
		while (It1.hasNext()) {
			i++;
			It1.next();
		}
		return i; 
		//return llStr.size();
	}
	
	public static void Clear(LinkedList<Character> llStr) {
		
		llStr.removeAll(llStr);
	}
	
	public static String askAorBorC() {
		Scanner myScan = new Scanner(System.in);
		String strUsr;
		
		System.out.printf("Enter string name (A/B/C): ");
		strUsr = myScan.nextLine();
		if (!strUsr.equalsIgnoreCase("A")&&!strUsr.equalsIgnoreCase("B")&&!strUsr.equalsIgnoreCase("C")) {
			System.out.println("Not a valid string name");
			return " ";
		}
		return strUsr;
	}

	public static int String2Operate() {
		Scanner myScan = new Scanner(System.in);
		String strUsr;
		
		System.out.printf("Enter strings to operate: \n  1. A and B \n  2. B and C \n  3. A and C ");
		strUsr = myScan.nextLine();
		if (!strUsr.equalsIgnoreCase("1")&&!strUsr.equalsIgnoreCase("2")&&!strUsr.equalsIgnoreCase("3")) {
			System.out.println("Not a valid option");
			return 0;
		}
		return Integer.parseInt(strUsr);
	}
	
}
