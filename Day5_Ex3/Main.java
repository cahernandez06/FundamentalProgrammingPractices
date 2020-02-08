package Day5_Ex3;

import java.util.Scanner;

public class Main {
	Employee[] emps = null;
	public static void main(String[] args) {
		new Main();
	}
	Main(){
		emps = new Employee[3];
		int choosenEmp=0,choosenAcct=0;
		emps[0] = new Employee("Jim Daley", 2000, 9, 4);
		emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
		emps[2] = new Employee("Susan Randolph", 1997, 2,13);
		
		emps[0].createNewChecking(10500);
		emps[0].createNewSavings(1000);
		emps[0].createNewRetirement(9300);
		emps[1].createNewChecking(34000);
		emps[1].createNewSavings(27000);
		emps[2].createNewChecking(10038);
		emps[2].createNewSavings(12600);
		emps[2].createNewRetirement(9000);	
		
//		for phase I – console output
		Scanner sc = new Scanner(System.in);
		System.out.println("A. See a report of all accounts.\nB. Make a deposit.\nC. Make a withdrawal.\nMake a selection (A/B/C):");
		String answer = sc.next(); 
		if (answer.equalsIgnoreCase("A")){
			//List accounts
			String info = getFormattedAccountInfo();
			System.out.println(info);
		}else if (answer.equalsIgnoreCase("B")){
			//Make a deposit
			choosenEmp = chooseEmployee();
			if (choosenEmp == -1)
				return;
			choosenAcct = chooseAccount();
			if (choosenAcct == -1)
				return;
			System.out.println("Deposit amount: ");
			answer = sc.next(); 
			emps[choosenEmp].depositAcctType(choosenAcct,Double.parseDouble(answer));
		}else if (answer.equalsIgnoreCase("C")) {
			//Make a withdraw
			choosenEmp = chooseEmployee();
			if (choosenEmp == -1)
				return;
			choosenAcct = chooseAccount();
			if (choosenAcct == -1)
				return;
			System.out.println("Amount to withdraw: ");
			answer = sc.next(); 
			emps[choosenEmp].witdrawAcctType(choosenAcct,Double.parseDouble(answer));
		}else 
			System.out.println("Invalid option, good bye");
		
		System.out.printf("Total employees balance is: %.1f",totalOfAllBalances());
	}
	
	private String getFormattedAccountInfo() {
		//implement
		String accInfo="";
		
		for (Employee emp1 : emps) 
			accInfo += emp1.getFormattedAcctInfo()+"\n";
		return accInfo;
	}
	
	private int chooseAccount() {
		Scanner scEmp = new Scanner(System.in);
		int option = 0;
		
		System.out.println("0. checking \n1. savings \n2. retirement");
        System.out.println("Select an account: (type a number) ");
		String answer = scEmp.next();
		option = Integer.parseInt(answer);
		if (option < 0 || option > 2) {
			System.out.println("Invalid account type, good bye");
			return -1;
		}
		return option;
	}
	
	public int chooseEmployee() {
		Scanner scEmp = new Scanner(System.in);
		int i = 0,option = 0;
		
		for (Employee e : emps) {
			System.out.printf("%d. %s \n",i,e.getName());
			i++;
		}
		System.out.println("Select an employee: (type a number) ");
		String answer = scEmp.next();
		option = Integer.parseInt(answer);
		if (option < 0 || option > emps.length-1) {
			System.out.println("Invalid employee, good bye");
			return -1;
		}
		return option;
	}
	
	public double totalOfAllBalances() {
		double totalBalance = 0;
		
		for (Employee e : emps) {
			totalBalance += e.getAllEmpBalance();
		}
		return totalBalance;
	}
}


