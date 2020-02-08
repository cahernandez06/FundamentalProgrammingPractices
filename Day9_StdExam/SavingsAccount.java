package Day9_StdExam;

public final class SavingsAccount extends Account {
	
	public SavingsAccount(double balance, double interestRate) {
		this.balance = balance;
		this.interestRate = interestRate;
	}

	double interestRate;
	
	public double getBalance() {
		double newbalance = balance + interestRate * balance;
		return newbalance;
	}
	
}
