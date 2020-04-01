package qa.com.main;

public class RunnerGarage {

	public static void main(String[] args) {
		
		Garage garage = new Garage();
		
		Car car1 = new Car(4, 1000, 4, 10000, true);
		Motorcycle motorcycle1 = new Motorcycle(2, 2000, 1, 50000, true);
		Boat boat1 = new Boat(0, 3000, 4, 20000, true);
		
		garage.garagelist.add(car1);
		garage.garagelist.add(motorcycle1);
		garage.garagelist.add(boat1);
		System.out.println(garage.garagelist);
		
//		garage.removeFromGarage(car1);
//		System.out.println(garage.garagelist);
	}
}