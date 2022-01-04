package numbermanipulations;

public class Machine {
	// define constants, declare variables, declare methods
	public final int DEFAULT_WHEELS_COUNT = 2;
	public void multiplyNumbers(int a, int b) {
		int c = a * b;
		System.out.println("Multipled: " + c);
	}
	public int additionOfTwoNumbers(int a, int b) {
		int c = a + b;
		System.out.println("Added: " + c);
		return c;
	}

	public int subtractNumbers(int a , int b) {
		int c = a - b;
		System.out.println("Subtracted: " + c);
		return c;
	}
	public void divideNumbers(int a, int b) {
		int c = a/b;
		System.out.println("Divided: " + c);
	}
	
}
