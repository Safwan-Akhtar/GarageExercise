package qa.com.main;

import java.util.ArrayList;
import java.util.List;

public class Garage {
		
	
	public List<Vehicle> garagelist = new ArrayList<>();
	
	public boolean addToGarage(Vehicle vehicle) {
		return this.garagelist.add(vehicle);
	}
	
	public boolean removeFromGarage(Vehicle vehicle) {
		return this.garagelist.remove(vehicle);
	}
	
//	public boolean clearGarage() { 
//		return this.garagelist.clear();	//error ???
//	}
}