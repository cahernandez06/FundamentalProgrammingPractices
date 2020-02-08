package Day5_Ex3;

public class RetirementAccount extends Account {
	
	private static final double INTERES_PEN_SAVINGS=2;

	RetirementAccount(Employee emp, double balance) {
		super(emp, balance);
	}
	
	public AccountType getAcctType() {
		return AccountType.RETIREMENT;
	}
	
	public double getBalance() {
		double baseBalance = super.getBalance();
		double penalty = (INTERES_PEN_SAVINGS/100)*baseBalance;
		return baseBalance - penalty;
	}
}
