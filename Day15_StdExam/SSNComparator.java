package Day15_StdExam;

import java.util.Comparator;

public class SSNComparator implements Comparator<Employee> {
	
	public int compare(Employee e1, Employee e2) {
		
		if ((e1 == null)||(e2 == null))
			return 0;
		
		return e1.getSsn().compareTo(e2.getSsn());
	}

}
