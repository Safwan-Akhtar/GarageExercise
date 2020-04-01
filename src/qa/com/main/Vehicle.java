package qa.com.main;

public abstract class Vehicle {
	// aspect used for all vehicles
	private int numOfWheels;
	private int sizeOfEngine;
	private int numOfSeats;
	private int price;
	
	public Vehicle() {
		super();
	}
	
	public Vehicle(int numOfWheels, int sizeOfEngine, int numOfSeats, int price) {
		super();
		this.numOfWheels = numOfWheels;
		this.sizeOfEngine = sizeOfEngine;
		this.numOfSeats = numOfSeats;
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNumOfWheels() {
		return numOfWheels;
	}
	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}
	public int getSizeOfEngine() {
		return sizeOfEngine;
	}
	public void setSizeOfEngine(int sizeOfEngine) {
		this.sizeOfEngine = sizeOfEngine;
	}
	public int getNumOfSeats() {
		return numOfSeats;
	}
	public void setNumOfSeats(int numOfSeats) {
		this.numOfSeats = numOfSeats;
	}
}