/**
 * Student class
 */
public class Student {
	// Properties of a class - variables, constants, methods
    private int id;
    /**
     * Name of the student
     */
    private String name;
    private int year;
    private String uniqueId;
    
    // constructor overloading
    public Student() {
	}
	
    public Student(int id1, String name1, int year1) {
		id = id1;
		name = name1;
		year = year1;
	}
    
    public int getYear() {
        return year;
    }
    
    /**
     * Creating a unique id based on name and id
     * AccessModifier<optional> static/final<optional> ReturnType/void methodName(Arguments<optional>) {method functionality}
     * Return Type = what is the data type of the method's output
     * void = When the method doesn't return anything
     * Arguments = input for the method
     */
    public String getUniqueId() {
		String uniqueId = name + id; // Nikhil + 10 -> Nikhil10
		return uniqueId;
	}
	
	public int addTwoNumbers(int a, int b) {
		int c = a + b;
		return c;
	}
	
	public void generateUniqueId() {
		uniqueId = name + id; // Nikhil + 10 -> Nikhil10
	}
	
	public int getremainder(int a, int b){
		int c = a%b;
		return c;
	}
	
	public int subTwoNumbers(int a, int b) {
		int c = a - b;
		return c;
	}
	
	public int divideTwonumbers(int a, int b) {
		int c = a / b;
		return c;
	}
	
	public int multiplyNumbers(int x, int y) {
		int z=x*y;
		return z;
	}
	
	public void multiplyNumbers(int x, int y, int z) {
		int a = x * y * z;
	}
}
