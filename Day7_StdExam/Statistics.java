package Day7_StdExam;
import java.util.*;
public class Statistics {
	/** 
	 * Polymorphically computes and returns the sum
	 * of all the salaries of all the staff/teachers in the list.
	 */
	public static double computeSumOfSalaries(List<EmployeeData> aList) {
		double sumSalaries = 0;
		
		for (EmployeeData e : aList) {
			sumSalaries += e.getSalary();
		}
		return sumSalaries;
	}
}
