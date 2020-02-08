package Day8_StdExam;

import java.util.ArrayList;
import java.util.List;

public class MilesCounter {
	
	public static List<Vehicle> convertArray(Object[] vehicleArray) {
		List<Vehicle> vehList = new ArrayList<Vehicle>();
		
		for (Object ObjVeh : vehicleArray)
			vehList.add((Vehicle) ObjVeh);
		return vehList;
	}
	
	
	public static int computeTotalMiles(List<Vehicle> vehicleList) {
		int sumMiles=0;
		
		for (Vehicle veh : vehicleList)
			sumMiles += veh.getMilesUsedToday();
		return sumMiles;
	}
}
