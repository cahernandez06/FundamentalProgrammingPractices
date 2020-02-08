package Day2;

public class Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        float num1 = (float) 1.27;
        float num2 = (float) 3.881;
        float num3 = (float) 9.6;
        
        System.out.println("The sum of the floats as an integer is: " + (int) (num1+num2+num3));
        System.out.println("The sum of the floats as an integer, rounding the sum to the nearest is: " + (int) Math.round((num1+num2+num3)));
	}

}
