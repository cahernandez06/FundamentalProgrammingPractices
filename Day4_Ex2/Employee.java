package Day4_Ex2;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {

	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private Date hireDate;
	
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire){
		this.name = name;
		GregorianCalendar cal = new GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire);
		hireDate = cal.getTime();
	}

	public void createNewChecking(double startAmount) {
		// implement
		if (startAmount > 0)
			checkingAcct = new Account(this,AccountType.CHECKING,startAmount);
	}
	public void createNewSavings(double startAmount) {
		// implement
		if (startAmount > 0)
			savingsAcct = new Account(this,AccountType.SAVINGS,startAmount);
	}
	public void createNewRetirement(double startAmount) {
		// implement
		if (startAmount > 0)
			retirementAcct = new Account(this,AccountType.RETIREMENT,startAmount);
	}
	public void deposit(AccountType acctType, double amt){
		// implement
		switch (acctType) {
		case CHECKING:
			checkingAcct.makeDeposit(amt);
			break;
		case SAVINGS:
			savingsAcct.makeDeposit(amt);
			break;
		case RETIREMENT:
			retirementAcct.makeDeposit(amt);
			break;
		default:
			return;
		}
	}
	public boolean withdraw(AccountType acctType, double amt){
		// implement
		boolean boAns=false;
		
		switch (acctType) {
		case CHECKING:
			boAns=checkingAcct.makeWithdrawal(amt);
			break;
		case SAVINGS:
			boAns=savingsAcct.makeWithdrawal(amt);
			break;
		case RETIREMENT:
			boAns=retirementAcct.makeWithdrawal(amt);
			break;
		default:
			return false;
		}
		return false;
	}

	public String getFormattedAcctInfo() {
		// implement
		String s1="", s2="", s3="";
		
		if (checkingAcct != null)
			s1=checkingAcct.toString();
		if (savingsAcct != null)
			s2=savingsAcct.toString();
		if (retirementAcct != null)
			s3=retirementAcct.toString();
		return "ACCOUNT INFO FOR "+this.name+"\n\n"+s1+"\n"+s2+"\n"+s3+"\n";
	}
}
