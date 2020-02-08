package Day6_Ex1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Figure> myFigures = new ArrayList<Figure>();
		
		//To populate the arraylist
		myFigures.add(new Triangle(10,6.5));
		myFigures.add(new Rectangle(5.5,7));
		myFigures.add(new Circle(4.5));
		myFigures.add(new Triangle(-1,20.3));  //Boundary condition

		for (int i=0;i < myFigures.size();i++)
		    System.out.printf("Area of figure %s is %f \n",myFigures.get(i).getClass().getSimpleName(),myFigures.get(i).computeArea());

	}

}
