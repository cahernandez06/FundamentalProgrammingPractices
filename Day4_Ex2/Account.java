package Day4_Ex2;

class Account {

	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType acctType;
	private Employee employee;

	Account(Employee emp, AccountType acctType, double balance){
		employee = emp;
		this.acctType =acctType;
		this.balance = balance;
	}

	Account(Employee emp, AccountType acctType){
		this(emp,acctType,DEFAULT_BALANCE);
	}
	public String toString() {
		return "type = "+acctType+", balance = "+balance;
	}
	public double getBalance() {
		return balance;
	}
	public AccountType getAcctType() {
		return acctType;
	}
	public void makeDeposit(double val) {
	//implement
		if (val < 0)
			return;
		else
			balance += val;
	}
	public boolean makeWithdrawal(double val) {
		if (val > balance)
			return false;
		else 
			balance -= val;
		return true;
	}
	public double computeInterest() {
		double interestCal=0;
		
		switch (acctType){
			case CHECKING:
				interestCal = ((balance*20)/100)*12;
				break;
			case SAVINGS:
				interestCal = ((balance*40)/100)*12;
				break;
			case RETIREMENT:
				interestCal = ((balance*50)/100)*12;
				break;
			default:
				interestCal = 0;
		}
		return interestCal;
	}
}

