package Day4_Ex1;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main emp3Accts = new Main("Carlos","Hernandez",100000,2019,05,01);
		
		System.out.printf("Employee %s has the following account: %s \n",emp3Accts.emp.getName(),emp3Accts.empAccCheck.toString());
		System.out.printf("..its computed interest is: %f \n",emp3Accts.empAccCheck.computeInterest());
		System.out.printf("Employee %s has the following account: %s \n",emp3Accts.emp.getName(),emp3Accts.empAccSavs.toString());
		System.out.printf("..its computed interest is: %f \n",emp3Accts.empAccSavs.computeInterest());
		System.out.printf("Employee %s has the following account: %s \n",emp3Accts.emp.getName(),emp3Accts.empAccRet.toString());
		System.out.printf("..its computed interest is: %f \n",emp3Accts.empAccRet.computeInterest());
		System.out.printf("...and he was contrated in: %tF \n", emp3Accts.emp.getHireDay());
	}
	
	Employee emp;
	Account empAccCheck;
	Account empAccSavs;
	Account empAccRet;
	
	Main(String FName, String LName, double aSalary, int aYear, int aMonth, int aDay){
		
		emp = new Employee(FName+" "+LName,aSalary,aYear,aMonth,aDay);
		empAccCheck = new Account(emp,AccountType.CHECKING,300);
		empAccSavs  = new Account(emp,AccountType.SAVINGS,300);
		empAccRet   = new Account(emp,AccountType.RETIREMENT,300);
	}

}
