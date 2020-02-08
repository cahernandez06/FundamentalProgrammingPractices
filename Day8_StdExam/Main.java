package Day8_StdExam;

import java.time.LocalDate;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Bicycle bike1 = new Bicycle("Joe", "Schwinn");
		bike1.setMilesUsedToday(11);
		Automobile auto1 = new Automobile("Tom", "Ford");
		auto1.setMilesUsedToday(25);
		Boat boat1 = new Boat("Jim", LocalDate.of(12,12,12));
		boat1.setMilesUsedToday(12);
		Automobile auto2 = new Automobile("Harry", "Mazda");
		auto2.setMilesUsedToday(15);
		Bicycle bike2 = new Bicycle("Rich", "Schwinn");
		bike2.setMilesUsedToday(8);
		Automobile auto3 = new Automobile("Susan", "Toyota");
		auto3.setMilesUsedToday(18);
		Boat boat2 = new Boat("Anne", LocalDate.of(11,11,11));
		boat2.setMilesUsedToday(17);
		Object[] vehicles = {bike1, //11
							auto1,  //25
							boat1,  //12
							auto2,  //15
							bike2,  //8
							auto3,  //18
							boat2}; //17
		List<Vehicle> vehicleList = MilesCounter.convertArray(vehicles);
		int totalMiles = MilesCounter.computeTotalMiles(vehicleList);
		
		System.out.printf("Miles done: %d",totalMiles);
		
	}

}
