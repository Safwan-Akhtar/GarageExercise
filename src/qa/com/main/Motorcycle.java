package qa.com.main;

public class Motorcycle extends Vehicle{
	//Unique aspects of this vehicle.
	private boolean sideCart = false;
	
	
	public Motorcycle() {
		super();
	}
	
	public Motorcycle(int numOfWheels, int sizeOfEngine, int numOfSeats, int price, boolean sideCart) {
		super(numOfWheels, sizeOfEngine, numOfSeats, price);
		this.sideCart = sideCart;
		
	}
	
	@Override
	public String toString() {
		return "\nMotorcycle: \n[Wheels: " + getNumOfWheels() + "]\n[Engine Size: CC" + getSizeOfEngine() + "]\n[Price: $" + getPrice() + "]\n[Side Car: " + sideCart + "]";	
	}

	public boolean isSideCart() {
		return sideCart;
	}

	public void setSideCart(boolean sideCart) {
		this.sideCart = sideCart;
	}
}