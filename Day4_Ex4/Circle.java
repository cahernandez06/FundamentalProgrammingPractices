package Day4_Ex4;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle  triang1 = new Triangle(10,6.5); 
		Rectangle rect1   = new Rectangle(5.5,7);
		Circle    circ1   = new Circle(4.5);
		Triangle  triang2 = new Triangle(-1,20.3); //Boundary condition

		System.out.printf("Area of Triangle is %f \n ",triang1.computeArea());
		System.out.printf("Area of Rectangle is %f \n ",rect1.computeArea());
		System.out.printf("Area of Circle is %f \n ",circ1.computeArea());
		System.out.printf("Area of Triangle is %f \n ",triang2.computeArea());
	}

	private double radius;
	
	public Circle(double radius) {
		if (radius > 0)
			this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double computeArea() {
		return getRadius()*getRadius()*Math.PI;
	}
}
