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
        
        TataCar tataCar1 = new TataCar(4, true, 5, true, "Petrol", 1);
        // TataCar extends Car extends Vehicle
        boolean isTataCarType = tataCar1 instanceof TataCar;
        boolean isCarType = tataCar1 instanceof Car;
        boolean isVehicleType = tataCar1 instanceof Vehicle;
        //boolean isBusType = tataCar1 instanceof Bus;
        System.out.println("isTataCarType: " + isTataCarType);
        System.out.println("isCarType: " + isCarType);
        System.out.println("isVehicleType: " + isVehicleType);
        //System.out.println("isBusType: " + isBusType);
        
        Vehicle tataCar2 = new TataCar(4, true, 5, true, "Petrol", 1);
        // TataCar extends Car extends Vehicle
        boolean isTataCarType2 = tataCar2 instanceof TataCar;
        boolean isCarType2 = tataCar2 instanceof Car;
        boolean isVehicleType2 = tataCar1 instanceof Vehicle;
        boolean isBusType2 = tataCar2 instanceof Bus;
        System.out.println("isTataCarType: " + isTataCarType2);
        System.out.println("isCarType: " + isCarType2);
        System.out.println("isVehicleType: " + isVehicleType2);
        System.out.println("isBusType: " + isBusType2);
        
        Vehicle vehicle3 = new TataCar(4, true, 5, true, "Petrol", 1); // vehicle3 is a TataCar, is a Car, is a Vehicle, is a Machine, is not a Bus
        Vehicle vehicle4 = new Car(4, true, 5, true, "Petrol");
        boolean isTataCarType3 = vehicle3 instanceof TataCar; // true
        boolean isCarType3 = vehicle3 instanceof Car; // true
        boolean isTataCarType4 = vehicle4 instanceof TataCar; // false
        boolean isCarType4 = vehicle4 instanceof Car; // true
        System.out.println("isTataCarType3: " + isTataCarType3);
        System.out.println("isCarType3: " + isCarType3);
        System.out.println("isTataCarType4: " + isTataCarType4);
        System.out.println("isCarType4: " + isCarType4);
        
        vehicle3.multiplyNumbers(3, 4); 
        vehicle4.multiplyNumbers(5, 6); // vehicle4 is of type Car, so it will run methods from Car class
        // Identification of a method happens from referencing type(Vehicle), but running the methods happens from the actual object type(Car)
        
        Machine machine1 = new Vehicle();
        Machine machine2 = new PrintingMachine();
        boolean isMachineType1 = machine1 instanceof Machine; // true
        boolean isVehicleType1 = machine1 instanceof Vehicle; // true
        boolean isMachineType2 = machine2 instanceof Machine; // true
        boolean isVehicleType_2 = machine2 instanceof Vehicle; // false
        boolean isPrintineMachineType2 = machine2 instanceof PrintingMachine; // true
        System.out.println("isMachineType1: " + isMachineType1);
        System.out.println("isVehicleType1: " + isVehicleType1);
        System.out.println("isMachineType2: " + isMachineType2);
        System.out.println("isVehicleType_2: " + isVehicleType_2);
        System.out.println("isPrintineMachineType2: " + isPrintineMachineType2);
        
        Machine machine3 = new PrintingMachine();
        Machine machine4 = new Vehicle();
        machine3.multiplyNumbers(3, 4); // 3 * 4 * 2 = 24
        machine4.multiplyNumbers(3, 4); // 3 * 4 = 12
        
        System.out.println("machine3 type Machine: " + (machine3 instanceof Machine)); // true machine3 'is a' Machine
        System.out.println("machine4 type Machine: " + (machine4 instanceof Machine)); // true machine4 'is a' Machine
        System.out.println("machine3 type Vehicle: " + (machine3 instanceof Vehicle)); // false machine3 'is a' Vehcle - No
        System.out.println("machine3 type Vehicle: " + (machine4 instanceof Vehicle)); // true machine4 'is a' Vehcle - Yes
        System.out.println("machine3 type PrintingMachine: " + (machine3 instanceof PrintingMachine)); // true machine3 'is a' PrintingMachine - Yes
        System.out.println("machine4 type PrintingMachine: " + (machine4 instanceof PrintingMachine)); // false machine4 'is a' PrintingMachine - No
        
        if (machine3 instanceof Vehicle) {
			// Do some operation
		} else if (machine3 instanceof PrintingMachine) {
			// Do some other operation
		}
        
     }
}
