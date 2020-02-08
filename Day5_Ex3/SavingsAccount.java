package Day5_Ex3;

public class SavingsAccount extends Account {
	
	private static final double INTERES_PERC_SAVINGS = 0.25;

	SavingsAccount(Employee emp, double balance) {
		super(emp, balance);
	}
	
	public AccountType getAcctType() {
		return AccountType.SAVINGS;
	}
	
	public double getBalance() {
		double baseBalance = super.getBalance();
		double interest = (INTERES_PERC_SAVINGS/100)*baseBalance;
		return baseBalance + interest;
	}

}
