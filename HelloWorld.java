public class HelloWorld{

     public static void main(String []args){
        
        /*int index = 1;
        while (index <= 100) {
            System.out.println("Number 1: " + index);
            index++;
        }*/
        /* Student s1 = new Student(1, "Rajesh", 3);
        Student s2 = new Student();
        System.out.println("Student s1: " + s1);
        System.out.println("Student s2: " + s2);
        
        s2 = s1; // assignment
        System.out.println("Student s1: " + s1);
        System.out.println("Student s2: " + s2);
        
        // Garbage collection for s2
        
        System.out.println("Student s1 year: " + s1.getYear());
        
        System.out.println("Student s1 unique id: " + s1.getUniqueId());
        
        /**
         * objectReference.methodName(Arguments)
         * assigningVariable = objectReference.methodName(Arguments)
         */
        /*System.out.println("Student s1 add two numbers: " + s1.addTwoNumbers(2, 3));
        
        int addedNumber = s1.addTwoNumbers(200, 300);
        System.out.println("Student s1 add two numbers: " + addedNumber);
        
        s1.generateUniqueId();
        int p = s1.divideTwonumbers(10, 1);
        int q = s1.multiplyNumbers(10, 0);
        int r = s1.getremainder(10, 10);
        int s = s1.subTwoNumbers(1, 100);
        int t = s1.multiplyNumbers(10, 10, 10);
        System.out.println("Output: " + p + ", " + q + ", " + r + ", " + s + ", " + t);*/
        
        Car car = new Car(4, true, 5, true, "Petrol", 1);
        System.out.println("Wheels count: " + car.getWheelsCount());
        car.printFuelType();
        car.printWheelsCount();
        
        Car car2 = new Car(4, true, 5, true, "Petrol");
        System.out.println("Wheels count: " + car2.getWheelsCount());
        car2.printFuelType();
        car2.printWheelsCount();
        car2.additionOfTwoNumbers(10, 20);
        car2.subtractNumbers2(10, 20);
        car2.subtractNumbers(10, 20);
        car2.multiplyNumbers(10, 20);
     }
}
