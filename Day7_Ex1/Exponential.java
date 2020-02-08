package Day7_Ex1;

public class Exponential {

	double power(double x,int n) {
		if (n==0)  //Base case
			return 1;
		return x*power(x,n-1);
	}
	
}
