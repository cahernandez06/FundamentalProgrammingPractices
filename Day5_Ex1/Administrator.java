package Day5_Ex1;

import java.util.Date;

public class Administrator extends DeptEmployee {
	int hoursWorked;
	
	public Administrator(String name, double salary, Date hiredate, int hoursWorked) {
		super(name, salary, hiredate);
		this.hoursWorked=hoursWorked;
	}
	
	public int getHoursWorked() {
		return hoursWorked;
	}
	
	public void setHoursWorked(int hours) {
		this.hoursWorked = hours;
	}
	
	public double computeSalary() {
		return hoursWorked*20;
	}
}
