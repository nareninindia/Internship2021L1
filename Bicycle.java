public class Bicycle extends Vehicle {
	String spokeType; // SpokeLess, Spoked
	
	public Bicycle(int wheelsCount, boolean hasStorage, int numberOfPeople, String spokeType) {
		super(wheelsCount, hasStorage, numberOfPeople);
		this.spokeType = spokeType;
	}
}

