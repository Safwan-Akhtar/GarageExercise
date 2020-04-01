package qa.com.main;

public class Boat extends Vehicle {
	//Unique aspects of this vehicle.
	private boolean compartment = false;

	
	public Boat() {
		super();
	}
	
	public Boat(int numOfWheels, int sizeOfEngine, int numOfSeats, int price, boolean compartment) {
		super(numOfWheels, sizeOfEngine, numOfSeats, price);
		this.compartment = compartment;
		
	}
	
	@Override
	public String toString() {
		return "\nBoat: \n[Wheels: " + getNumOfWheels() + "]\n[Engine Size: CC" + getSizeOfEngine() + "]\n[Price: $" + getPrice() + "]\n[Compartment; " + compartment + "]";	
	}
	
	public boolean isCompartment() {
		return compartment;
	}

	public void setCompartment(boolean compartment) {
		this.compartment = compartment;
	}
}