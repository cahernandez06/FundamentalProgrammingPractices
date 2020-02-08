package Day5_Ex3;

public class CheckingAccount extends Account {
	
	private static final double MONTHLY_FEE_SAVINGS=5;

	CheckingAccount(Employee emp, double balance) {
		super(emp, balance);
	}
	
	public AccountType getAcctType() {
		return AccountType.CHECKING;
	}

	public double getBalance() {
		double baseBalance = super.getBalance();
		return baseBalance - MONTHLY_FEE_SAVINGS;
	}
}
