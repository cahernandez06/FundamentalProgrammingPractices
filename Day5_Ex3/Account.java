package Day5_Ex3;

class Account {

	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private Employee employee;

	Account(Employee emp, double balance){
		employee = emp;
		this.balance = balance;
	}

	Account(Employee emp){
		this(emp,DEFAULT_BALANCE);
	}
	
	public String toString() {
		return "account balance = "+balance;
	}
	
	public double getBalance() {
		return balance;
	}

	public boolean makeDeposit(double val) {
		if (val < 0) {
			System.out.println("You cannot to deposit a negative amount.");
			return false;
		}else
			balance += val;
		return true;
	}
	
	public boolean makeWithdrawal(double val) {
		if (val > balance) {
			System.out.println("You don't have enogh funds, cannot withdraw that quantity.");
			return false;
		}else 
			balance -= val;
		return true;
	}
	
	public AccountType getAcctType() {
		return null;
	}
	
}

