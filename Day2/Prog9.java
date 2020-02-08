package Day2;

import java.util.Scanner;

public class Prog9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  myScan=new Scanner(System.in);
		String   usrStr;
		String[] allStrs=new String[100];
		int k=0;
		
		System.out.println("Enter a string to return all substrings in it: ");
		usrStr = myScan.nextLine();
		
		for (int i=0;i <= usrStr.length();i++) {
			for (int j=i+1;j <= usrStr.length();j++) {
			    //System.out.println(usrStr.substring(i,j));
			    if (ExistsIn(allStrs, k, usrStr.substring(i,j))==false) {
			    	allStrs[k] = usrStr.substring(i,j);
			    	k++;
			    }
			}
		}
		
		printStrs(allStrs,usrStr.length(),k);

	}
	
	private static void printStrs(String[] s1, int maxLength, int numElements) {
		for (int i=1;i <= maxLength;i++) {
			System.out.printf("Substrings of length %d \n",i);
	        for (int j=0;j < numElements;j++) {
	        	if (i==s1[j].length()) {  //just print the elements of length==i
		            System.out.printf("[%s] \n",s1[j]);
	        	}
	        }
	    }
	}
	
	private static boolean ExistsIn(String[] s1, int numElems, String s2) {
		
		for (int i=0;i < numElems;i++) {
			if (s1[i].equals(s2)) {
				return true;
			}
		}
		return false;
	}

}
