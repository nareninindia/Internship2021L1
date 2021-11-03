public class Bus extends Vehicle {
	String fuelType; // Petrol, Diesel, Electric
	String seatingType; // Sleeper, ChairCar
	
	public Bus(int wheelsCount, boolean hasStorage, int numberOfPeople, String fuelType, String seatingType) {
		super(wheelsCount, hasStorage, numberOfPeople);
		this.fuelType = fuelType;
		this.seatingType = seatingType;
	}
}
