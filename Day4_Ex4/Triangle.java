package Day4_Ex4;

public class Triangle {

	private double base;
	private double height;
	
	public Triangle(double base, double height) {
		if (base > 0 && height > 0) {
			this.base = base;
			this.height = height;
		}
	}
	
	public double getBase() {
		return base;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double computeArea() {
		return (getBase()*getHeight())/2;
	}
}
