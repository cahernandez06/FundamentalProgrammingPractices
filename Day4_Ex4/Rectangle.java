package Day4_Ex4;

public class Rectangle {

	private double width;
	private double height;
	
	public Rectangle(double width, double length) {
		if (width > 0 && length > 0) {
			this.width = width;
			this.height = length;
		}
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double computeArea() {
		return getWidth()*getHeight();
	}
}
