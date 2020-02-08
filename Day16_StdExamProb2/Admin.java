package Day16_StdExamProb2;

import java.util.LinkedList;
import java.util.List;

import org.hsqldb.lib.Iterator;

public class Admin {
	public static List<Student> convertArray(Object[] studentArray) {
		/* implement */
		List<Student> tmpList = new LinkedList<Student>();
		
		if (studentArray == null)
			return tmpList;
		
		for (int i=0;i < studentArray.length;i++)
			tmpList.add((Student) studentArray[i]);
		
		return tmpList;
	}
	
	
	public static double computeAverageGpa(List<Student> studentList) {
		/*implement */
		double sumGPAs=0;
		int countGPAs=0;
		
		for (Student s:studentList) {
			sumGPAs += s.computeGpa();
			countGPAs++;
		}
		return sumGPAs/countGPAs;
	}
}
