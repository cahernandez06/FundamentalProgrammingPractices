package Day6_Ex1;

public class Circle implements Figure{

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
