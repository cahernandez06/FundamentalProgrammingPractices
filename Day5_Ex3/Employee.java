package Day5_Ex3;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Employee {

	private ArrayList<Account> accounts=new ArrayList<Account>();
	private String name;
	private Date hireDate;
	
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire){
		this.name = name;
		GregorianCalendar cal = new GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire);
		hireDate = cal.getTime();
	}

	public String getName() {
		return name;
	}
	
	public void createNewChecking(double startAmount) {
		if (startAmount > 0)
			accounts.add(new CheckingAccount(this,startAmount));
	}
	public void createNewSavings(double startAmount) {
		if (startAmount > 0)
			accounts.add(new SavingsAccount(this,startAmount));
	}
	public void createNewRetirement(double startAmount) {
		if (startAmount > 0)
			accounts.add(new RetirementAccount(this,startAmount));
	}
	
	public void depositAcctType(int numaccType,double amount) {
		for (Account a : accounts) 
			if (a.getAcctType().ordinal()==numaccType) {
				if (a.makeDeposit(amount)) {
					System.out.printf("%.1f has been deposited in the %s account of %s \n",amount,a.getAcctType(),this.getName());
					return;
				}
			}
	}
	
	public void witdrawAcctType(int numaccType,double amount) {
		for (Account a : accounts) 
			if (a.getAcctType().ordinal()==numaccType) {
				if (a.makeWithdrawal(amount)) {
					System.out.printf("%.1f has been withdraw from the %s account of %s",amount,a.getAcctType(),this.getName());
					return;
				}
			}
	}
	
	public String getFormattedAcctInfo() {
		String s1="\nACCOUNT INFO FOR "+this.name,s2="";
		
		for (Account a : accounts) {
			s2 = s2 + "\n" + a.toString();
		}
		return s1+s2;
	}

	public double getAllEmpBalance() {
		double totalBalance = 0;
		
		for (Account a : accounts)
			totalBalance += a.getBalance();
		return totalBalance;
	}
}
