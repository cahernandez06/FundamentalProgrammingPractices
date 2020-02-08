package Day2;

import java.util.Scanner;

public class Prog7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScan = new Scanner(System.in);
		String sqlSel="SELECT ";
		String sqlFrom="  FROM ";
		String sqlWhere=" WHERE salary > ";
		String partSentence;
		int    numCols=0;
		
		System.out.println("Table name: ");
		partSentence = myScan.nextLine();
		sqlFrom += partSentence;
		//partSentence = myScan.next();
		
		System.out.println("Number of column names: ");
		partSentence = myScan.nextLine();
		numCols = Integer.parseInt(partSentence);
		if (numCols <= 0) {
			System.out.println("The column numbers must be > 1, exiting");
			return;
		}

		for (int i=1; i <= numCols;i++) {
		    System.out.printf("Column %d name: ",i);
			partSentence = myScan.nextLine();
			sqlSel += partSentence;
			sqlSel += (i==numCols)? "" : ",";
		}

		System.out.println("salary value: ");
		partSentence = myScan.nextLine();
		sqlWhere += partSentence;
		System.out.println(sqlSel + "\n" + sqlFrom + "\n" + sqlWhere);
	}

}
