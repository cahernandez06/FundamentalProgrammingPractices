package Day5_Ex1;

import java.util.Date;

public class DeptEmployee {

		private String name;
		protected double salary;
		private Date hiredate;
		
		public DeptEmployee(String name, double salary, Date hiredate) {
			setName(name);
			setHiredate(hiredate);
			this.salary = salary;
		}
		
		public String getName() {
			return name;
		}
		
		public Date getHiredate() {
			return hiredate;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public void setHiredate(Date hiredate) {
			this.hiredate = hiredate;
		}
		
		public double computeSalary() {
			return salary;
		}
		
		public String toString() {
			return "The employee " + name+ " has a salary of " + salary + 
					" and works in department since " + String.format("%1$te/%1$tm/%1$tY", hiredate);
		}
}
