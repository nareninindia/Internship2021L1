package numbermanipulations;

public class Vehicle { // Only one class or abstract class can be extended
	
	public static final int SOME_CONSTANT = 5;
	public int wheelsCount;
	boolean hasStorage;
	int numberOfPeople;
	public static int randomVariable = 4;
	
	public Vehicle() {
		/*wheelsCount = DEFAULT_WHEELS_COUNT;
		hasStorage = false;
		numberOfPeople = 2;*/
	}
	
	public Vehicle(int wheelsCount, boolean hasStorage, int numberOfPeople) {
		// DEFAULT_WHEELS_COUNT = 5; cannot assign a value to final variable
		this.wheelsCount = wheelsCount;
		this.hasStorage = hasStorage;
		this.numberOfPeople = numberOfPeople;
	}
	
	public void setWheelsCount(int wheelsCount) {
		this.wheelsCount = wheelsCount;
	}
	
	public int getWheelsCount() {
		return wheelsCount;
	}
	
	public final int getNumberOfPeople() {
		additionOfTwoNumbers(1, 2);
		return numberOfPeople;
	}
	
	public void additionOfTwoNumbers(int a, int b) {
		int c = a + b;
		System.out.println("Added: " + c);
	}
	
	public void subtractNumbers(int a , int b) {
		int c = a - b;
		System.out.println("Subtracted: " + c);
	}
	
	public void multiplyNumbers(int a, int b) {
		int c = a * b;
		System.out.println("Multipled: " + c);
	}
	
	public static void divideNumbers(int a, int b) {
		int c = a/b;
		System.out.println("Divided: " + c);
	}
}
