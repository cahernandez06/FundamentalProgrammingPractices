package Day9_StdExam;

import java.util.ArrayList;
import java.util.List;

public class AccountManager {
	
	public static double computeAccountBalanceSum(List<Employee> emps) {
		double sumBalances = 0;
		List<Account> empAccounts = new ArrayList<Account>();
		
		for (Employee emp:emps) {
			empAccounts = emp.getAccounts();
			for (Account act:empAccounts)
				sumBalances += act.getBalance();
		}
		return sumBalances;
	}
}
