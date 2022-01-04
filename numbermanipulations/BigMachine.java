package numbermanipulations;

// abstract class in not full class
public class BigMachine extends Machine {
	// declared addNumbers method and defined it - just like in a normal class
	public void addNumbers(int a, int b) {
		int c = a + b;
		System.out.println("added: " + c);
	}

	public void multiplyNumbers(int a, int b) {
		int c = a * b;
		System.out.println("Multipled: " + c);
	}
}
