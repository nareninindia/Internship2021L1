public class Vehicle {
	int wheelsCount;
	boolean hasStorage;
	int numberOfPeople;
	
	public Vehicle(int wheelsCount, boolean hasStorage, int numberOfPeople) {
		this.wheelsCount = wheelsCount;
		this.hasStorage = hasStorage;
		this.numberOfPeople = numberOfPeople;
	}
	
	public int getWheelsCount() {
		return wheelsCount;
	}
}
