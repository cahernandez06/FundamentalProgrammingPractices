package Day6_Ex4;

import java.util.ArrayList;

public class Test2 {
	
	public static void main(String[] args) {

		//ArrayList<Polygon> myPolygons = new ArrayList<Polygon>();
		ArrayList myPolygons = new ArrayList();  //Try with generic array list + casting
		Polygon P;
		
		myPolygons.add(new Rectangle(3,4));
		myPolygons.add(new Triangle(4,5,6));
		myPolygons.add(new Square(3));

		//compute areas
		for(int i=0;i < myPolygons.size();i++) {
			P = (Polygon) myPolygons.get(i);
			System.out.printf("For this %s \n", P.getClass().getSimpleName());
			System.out.printf("  Number of sides = %d \n",P.getNumberOfSides());
			System.out.printf("  Perimeter = %.2f \n", P.computePerimeter());
			
		}
    
	}

}