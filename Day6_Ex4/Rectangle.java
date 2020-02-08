package Day6_Ex4;

public class Rectangle extends ClosedCurve implements Polygon {

	double width;
	double length;
	
	Rectangle(double width, double length){
		this.width = width;
		this.length = length;
	}
	
	public double computeArea() {
		return width*length;
	}

	public int getNumberOfSides() {
		return 4;
	}
	
	public double computePerimeter() {
		return (width*2)+(length*2);
	}
}
