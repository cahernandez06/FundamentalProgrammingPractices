package Day4_Ex1;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employees {

	/* Just added to previous case tests
	public static void main(String[] args) {
		// Employees
		Employee emp1 = new Employee("Carlos",100000,2019,05,01);
		Employee emp2 = new Employee("Pedros",60000,2019,05,01);
		Employee emp3 = new Employee("Jhonson",30000,2019,05,01);
		Employee emp4 = new Employee("Pite",20000,2019,05,01);
		// Accounts
		Account  acctEmp1 = new Account(emp1,Account.CHECKING,100);
		Account  acctEmp2 = new Account(emp2,Account.SAVINGS,100);
		Account  acctEmp3 = new Account(emp3,Account.RETIREMENT,100);
		Account  acctEmp4 = new Account(emp4,"n/a",100); //Boundary case
		
		//Case 1:
		System.out.printf("Employee %s with a salary of %s has a tax of: %f, the yearly interest is: %f \n",emp1.getName(),emp1.getSalary(),emp1.yearlyFederalTax(),acctEmp1.computeInterest());
		//Case 2:
		System.out.printf("Employee %s with a salary of %s has a tax of: %f, the yearly interest is: %f \n",emp2.getName(),emp2.getSalary(),emp2.yearlyFederalTax(),acctEmp2.computeInterest());
		//Case 3:
		System.out.printf("Employee %s with a salary of %s has a tax of: %f, the yearly interest is: %f \n",emp3.getName(),emp3.getSalary(),emp3.yearlyFederalTax(),acctEmp3.computeInterest());
		//Case 4:
		System.out.printf("Employee %s with a salary of %s has a tax of: %f, the yearly interest is: %f \n",emp4.getName(),emp4.getSalary(),emp4.yearlyFederalTax(),acctEmp4.computeInterest());

	}  */
}
	
		//same as the Employee class defined in the lecture
		class Employee {
		//constructor
		Employee(String aName, double aSalary, int aYear, int aMonth, int aDay) 
		{	name = aName;
			salary = aSalary;
			GregorianCalendar cal = new GregorianCalendar(aYear,aMonth-1,aDay);
			hireDay = cal.getTime();
		}

		// instance methods
		public String getName() {
			return name;
		}
		
		public double getSalary() {
		return salary;
		}
		//needs to be improved!!
		public Date getHireDay() {
			GregorianCalendar dateNice = new GregorianCalendar();
			dateNice.setTime(hireDay);
			return dateNice.getTime();
		}

		public void raiseSalary(double byPercent) {
			double raise = salary * byPercent / 100;
			salary += raise;
		}
		
		public double yearlyFederalTax() {
			
			if (salary > 80000)
				return (salary*28)/100;
			else if (salary > 50000)
				return (salary*24)/100;
			else if (salary > 26000)
				return (salary*20)/100;
			else 
				return 0;
		}
		
		//instance fields
		private String name;
		private double salary;
		private Date hireDay;
		
	}

