// abstract class in not full class
public abstract class BigMachine implements Machine {
	// declared addNumbers method and defined it - just like in a normal class
	public void addNumbers(int a, int b) {
		int c = a + b;
		System.out.println("added: " + c);
	}
	
	// declared subtractNumbers method and did not define it - just like in an interface
	public abstract void subtractNumbers(int a, int b);
}
