public class TataCar extends Car {
	public TataCar(int wheelsCount, boolean hasStorage, int numberOfPeople, boolean hasSunfRoof, String fuelType, int extraWheelsCount) {
		super(wheelsCount, hasStorage, numberOfPeople, false, fuelType, extraWheelsCount);
	}
	
	public void multiplyNumbers3(int a , int b) {
		super.multiplyNumbers(a, b);
	}
}
