public class Student {
	// Properties of a class - variables, constants, methods
    private int id;
    private String name;
    private int year;
    
    // constructor overloading
    public Student() {
	}
	
	public Student(int id1, String name1, int year1) {
		id = id1;
	}
	
    public Student(int id1, String name1, int year1) {
		id = id1;
		name = name1;
		year = year1;
	}
    
    public int getYear() {
        return year;
    }
}
