package Day5_Ex1;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScan = new Scanner(System.in);
		String  strAns, empName;
		double  sumSalaries=0;
		boolean found=false;
		DeptEmployee[ ] department = new DeptEmployee [6];
		GregorianCalendar hired;
		
		//Professors
		hired = new GregorianCalendar(1973,1,1);
		Professor prof1 = new Professor("Joseph",200000,hired.getTime(),10);
		hired = new GregorianCalendar(2019,5,1);
		Professor prof2 = new Professor("Carlos",150000,hired.getTime(),10);
		hired = new GregorianCalendar(2019,6,1);
		Professor prof3 = new Professor("Mauricio",100000,hired.getTime(),10);
		
		//Secretaries
		hired = new GregorianCalendar(1973,1,1);
		Secretary sec1 = new Secretary("Lina",50000,hired.getTime(),200);
		hired = new GregorianCalendar(1998,5,1);
		Secretary sec2 = new Secretary("Lucy",55000,hired.getTime(),200);
		
		//Administrators
		hired = new GregorianCalendar(1973,1,1);
		Administrator admin1 = new Administrator("Monica",180,hired.getTime(),160);
		
		//Populate array
		department[0] = prof1;
		department[1] = prof2;
		department[2] = prof3;
		department[3] = sec1;
		department[4] = sec2;
		department[5] = admin1;
		
		System.out.println("Do you want to see the sum of salaries in department? (Y/N)");
		strAns = myScan.next();
		if (strAns.equalsIgnoreCase("Y")) {
			for (DeptEmployee e : department) 
				sumSalaries += e.computeSalary();
			System.out.println("Sum of department salaries is: "+sumSalaries);
		}
		
		System.out.println("Do you want to locate an employee in department? (Y/N)");
		strAns = myScan.next();
		if (strAns.equalsIgnoreCase("Y")) {
			System.out.println("Enter the employee name:");
			strAns = myScan.next();
			
			for (DeptEmployee e : department) {
				empName=e.getName();
				if (strAns.equals(e.getName())) {
					found = true;
					System.out.println(e);
					break;
				}
			}
			if (!found) {
				System.out.printf("The employee %s doesn't exists in department",strAns);
			}
	    }
	}
}
