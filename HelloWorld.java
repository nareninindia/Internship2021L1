public class HelloWorld{

     public static void main(String []args){
        
        int index = 1;
        while (index <= 100) {
            System.out.println("Number 1: " + index);
            index++;
        }
        Student s1 = new Student(1, "Rajesh", 3);
        Student s2 = new Student();
        System.out.println("Student s1: " + s1);
        System.out.println("Student s2: " + s2);
        
        s2 = s1; // assignment
        System.out.println("Student s1: " + s1);
        System.out.println("Student s2: " + s2);
        
        // Garbage collection for s2
        
        System.out.println("Student s1 year: " + s1.getYear());
     }
}
