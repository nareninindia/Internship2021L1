public class Car extends Vehicle {
	boolean hasSunRoof;
	String fuelType; // Petrol, Diesel, Electric
	int wheelsCount;
	
	//accessModifier[optional] className(arguments[optional)
	public Car(int wheelsCount, boolean hasStorage, int numberOfPeople, boolean hasSunfRoof, String fuelType, int extraWheelsCount) {
		// Calling constructor of parent class using super
		super(wheelsCount, hasStorage, numberOfPeople); // Access a constructor of parent class
		this.hasSunRoof = hasSunRoof;
		this.fuelType = fuelType;
		this.wheelsCount = extraWheelsCount;
		//wheelsCount = 0;
		//System.out.println("wheelsCount - this: " + this.wheelsCount + ",super: " + super.wheelsCount + ", nearestReference: " + wheelsCount);
	}
	
	// Calling another constructor of same class using this keyword
	public Car(int wheelsCount, boolean hasStorage, int numberOfPeople, boolean hasSunfRoof, String fuelType) {
		this(wheelsCount, hasStorage, numberOfPeople, true, "Petrol", 0);
	}
	
	public void printFuelType() {
		System.out.println("FuelType: " + fuelType);
	}
	
	public void printWheelsCount() {
		int wheelsCount = 10;
		int wheelsCount0 = wheelsCount;
		int wheelsCount1 = this.wheelsCount; // This always refers to own class
		int wheelsCount2 = this.getWheelsCount(); // This always refers to own class
		int wheelsCount3 = super.wheelsCount; // Access a variable of parent class
		int wheelsCount4 = super.getWheelsCount(); // Access a method of parent class
		System.out.println("WheelsCount: " + wheelsCount0 + ", " + wheelsCount1
		+ ", " + wheelsCount2 + ", " + wheelsCount3 + ", " + wheelsCount4);
	}
	
	// accessModifier[optional] static[optional] final[optional] returnType methodName(arguments[optional])
	// Method overriding - Parent class has method with same signature
	public int getWheelsCount() {
		// DEFAULT_WHEELS_COUNT = 5; cannot assign a value to final variable
		wheelsCount = DEFAULT_WHEELS_COUNT;
		additionOfTwoNumbers(2, 3);
		return wheelsCount;
	}
	
	// This method cannot be overridden, as the method in parent class is final
	/*public int getNumberOfPeople() {
		return numberOfPeople + 10;
	}*/
	
	// super - Access parent class's constructors, variables, constants, methods
	// this - Access own class's constructors, variables, constants, methods
	
	//12x+36y = 12(x+3y)
	
	public void subtractNumbers2(int a , int b) {
		super.subtractNumbers(a, b);
	}
	
	public void multiplyNumbers2(int a , int b) {
		super.multiplyNumbers(a, b);
	}
}
