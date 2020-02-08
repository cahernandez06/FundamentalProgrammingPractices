package Day5_Ex1;

import java.util.Date;

public class Professor extends DeptEmployee {
	int numberOfPublications;
	
	public Professor(String name, double salary, Date hiredate, int numPublications) {
		super(name, salary, hiredate);
		numberOfPublications=numPublications;
	}
	
	public int getNumPublications() {
		return numberOfPublications;
	}
	
	public void setNumPublications(int numPubs) {
		this.numberOfPublications = numPubs;
	}
	
}
