package qa.com.main;

public class Car extends Vehicle {
	//Unique aspects of this vehicle.
	private boolean bootDoor = false;
	
	
	public Car() {
		super();
	}
	
	public Car(int numOfWheels, int sizeOfEngine, int numOfSeats, int price, boolean bootDoor) {
		super(numOfWheels, sizeOfEngine, numOfSeats, price);
		this.bootDoor = bootDoor;
		
	}
	
	@Override
	public String toString() {
		return "\nCar: \n[Wheels: " + getNumOfWheels() + "]\n[Engine Size: CC" + getSizeOfEngine() + "]\n[Price: $" + getPrice() + "]\n[Boot: " + bootDoor + "]";	
	}

	public boolean isBootDoor() {
		return bootDoor;
	}

	public void setBootDoor(boolean bootDoor) {
		this.bootDoor = bootDoor;
	}
}