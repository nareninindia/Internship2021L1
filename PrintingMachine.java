public class PrintingMachine implements Machine {
	public void multiplyNumbers(int a, int b) { // 3, 4 -> 24
		int c = a * b * 2;
		System.out.println("Multipled: " + c);
	}
}
