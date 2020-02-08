package Day7_Ex2;

public class fibo {

	public static void main(String[] args) {
		// Try with fibonacci
		System.out.printf("The fibonacci of number 5 is: %d", Fibo(5));
		
	}
	
	public static int Fibo(int value) {
		if (value==0||value==1)
			return 1;
		return value*Fibo(value-1);
	}
   
}
