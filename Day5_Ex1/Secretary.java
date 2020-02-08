package Day5_Ex1;

import java.util.Date;

public class Secretary extends DeptEmployee{
	double overtimeHours;
	
	public Secretary(String name, double salary, Date hiredate, double overTimeH) {
		super(name,salary,hiredate);
		overtimeHours=overTimeH;
	}
	
	public double getOverTimeH() {
		return overtimeHours;
	}
	
	public void setOverTimeH(double overtimeHours) {
		this.overtimeHours=overtimeHours;
	}
	
	public double computeSalary() {
		return salary+12*overtimeHours;
	}
}
