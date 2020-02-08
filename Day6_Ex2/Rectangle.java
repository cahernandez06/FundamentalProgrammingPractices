package Day6_Ex2;

public class Rectangle extends ClosedCurve {

	double width;
	double length;
	
	Rectangle(double width, double length){
		this.width = width;
		this.length = length;
	}
	
	public double computeArea() {
		return width*length;
	}

}
