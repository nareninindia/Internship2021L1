package numbermanipulations;

import java.util.*;

public class ListExercise {
    public static void addStringsToList() {
        List<String> stringList = new ArrayList<String>(3); // String is GENERIC here
        //ArrayList<String> stringList = new ArrayList<String>(3);
        stringList.add("One"); // 0
        stringList.add("Two"); // 1
        stringList.add("Five"); // 2
        System.out.println(stringList.size()); //Similar to Array.length
        stringList.add("Ten"); // 3
        stringList.add("Six"); // 4
        System.out.println(stringList.size());

        /*String[] stringArray = {"One", "Two", "Five"};
        System.out.println(stringArray.length);
        stringArray[3] = "Ten";
        System.out.println(stringArray.length);*/

        String fourthElement = stringList.get(4);
        System.out.println(fourthElement);

        String secondElement = stringList.get(2);
        System.out.println("Second index:" + secondElement);

        String removedElement = stringList.remove(2);
        System.out.println(removedElement);
        System.out.println(stringList.size());
        /*fourthElement = stringList.get(4);
        System.out.println(fourthElement);*/ // java.lang.IndexOutOfBoundsException
        secondElement = stringList.get(2);
        System.out.println("Second index:" + secondElement);

        stringList.add("Eleven"); // 4
        fourthElement = stringList.get(4);
        System.out.println(fourthElement);

        stringList.add(2, "Five");
        secondElement = stringList.get(2);
        System.out.println("Second index:" + secondElement);

        List<String> stringList2 = new ArrayList<String>(3); // String is GENERIC here
        stringList2.add("Ten"); // 0
        stringList2.add("Fifteen"); // 1
        stringList2.add("Twenty"); // 2
        stringList.addAll(stringList2);
        secondElement = stringList.get(2);
        System.out.println("Second index:" + secondElement);
    }

    public static void addStringsToLinkedList() {
        List<String> stringList = new LinkedList<String>(); // String is GENERIC here
        stringList.add("One"); // 0
        stringList.add("Two"); // 1
        stringList.add("Five"); // 2
        System.out.println(stringList.size()); //Similar to Array.length
        stringList.add("Ten"); // 3
        stringList.add("Six"); // 4
        System.out.println(stringList.size());

        /*String[] stringArray = {"One", "Two", "Five"};
        System.out.println(stringArray.length);
        stringArray[3] = "Ten";
        System.out.println(stringArray.length);*/

        String fourthElement = stringList.get(4);
        System.out.println(fourthElement);

        String secondElement = stringList.get(2);
        System.out.println("Second index:" + secondElement);

        String removedElement = stringList.remove(2);
        System.out.println(removedElement);
        System.out.println(stringList.size());
        /*fourthElement = stringList.get(4);
        System.out.println(fourthElement);*/ // java.lang.IndexOutOfBoundsException
        secondElement = stringList.get(2);
        System.out.println("Second index:" + secondElement);

        stringList.add("Eleven"); // 4
        fourthElement = stringList.get(4);
        System.out.println(fourthElement);

        stringList.add(2, "Five");
        secondElement = stringList.get(2);
        System.out.println("Second index:" + secondElement);

        List<String> stringList2 = new ArrayList<String>(3); // String is GENERIC here
        stringList2.add("Ten"); // 0
        stringList2.add("Fifteen"); // 1
        stringList2.add("Twenty"); // 2
        stringList.addAll(stringList2);
        secondElement = stringList.get(2);
        System.out.println("Second index:" + secondElement);
        for (int index = 0; index < stringList2.size(); index++) {
            System.out.println("Value:" + stringList2.get(index));
        }
    }

    public static void addStringsToHashSet() {
        Set<Integer> set = new HashSet<>(4);
        set.add(2);
        set.add(3);
        set.add(2);
        set.add(4);
        //System.out.println("Set data" + set.toArray());
        Iterator<Integer> iterator = set.iterator(); // [2, 3, 4]
        while (iterator.hasNext()) {
            System.out.println("Set Values:" + iterator.next());
        }

        List<Integer> list = new ArrayList<>(3); // String is GENERIC here
        list.add(3); // 0
        list.add(5); // 1
        list.add(10); // 2
        list.add(10); // 3

        for (int index = 0; index < list.size(); index++) {
            System.out.println("List Values:" + list.get(index));
        }

        set.addAll(list);
        iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println("Set Values:" + iterator.next());
        }
        // Duplicates are removed
    }

    public static void addVehiclesToHashSet() {
        Vehicle v1 = new Vehicle(); // 0, false, 0
        Vehicle v2 = new Vehicle(); // 0, false, 0
        Vehicle v3 = new Vehicle(); // 0, false, 0
        Vehicle v4 = v2;

        Set<Vehicle> set = new HashSet<>(3);
        set.add(v1);
        set.add(v2);
        set.add(v3);
        set.add(v4);
        System.out.println("Set size: " + set.size()); // 1 or 3 or 4? Ans: 3
    }

    /**
     * If wheelsCount, hasStorage and numberOfPeople of two vehicles is same,
     * then consider those 2 vehicles as same
     */
    public static void customComparison() {
        Vehicle v1 = new Vehicle(4, true, 4);
        Vehicle v2 = new Vehicle(4, true, 4);

        System.out.println("Are v1 and v2 same objects?: " + (v1 == v2)); // false
        System.out.println("v1 objectId: " + v1 + ", v2 objectId: " + v2); // same because objectId is using hashCode

        System.out.println("Are v1 and v2 equal?: " + (v1.equals(v2))); // true - comparison is based on attributes of Vehicle class now
    }

    public static void addVehiclesToHashMap() {
        Vehicle v1 = new Vehicle(0, false, 0);
        Vehicle v2 = new Vehicle(1, false, 2);
        Vehicle v3 = new Vehicle(1, true, 2);
        Vehicle v4 = v2;
        Vehicle v5 = new Vehicle(1, true, 2);

        Map<String, Vehicle> vehiclesMap = new HashMap(5);
        vehiclesMap.put("vehicle1", v1);
        vehiclesMap.put("vehicle2", v2);
        vehiclesMap.put("vehicle3", v3);
        vehiclesMap.put("vehicle4", v4);
        vehiclesMap.put("vehicle4", v5);
        System.out.println("Map size: " + vehiclesMap.size());
        System.out.println("Compare values in vehicle4 key: " + (v5 == vehiclesMap.get("vehicle4")));
    }

    public static void addPlanetsToHashMap() {
        Planet p1 = new Planet("Earth", 1);
        Planet p2 = new Planet("Jupiter", 79);
        Planet p3 = new Planet("Saturn", 82);
        Planet p4 = new Planet("Mars", 2);
        Planet p5 = new Planet("Uranus", 27);

        Map<String, Planet> planetsMap = new HashMap(5);
        planetsMap.put("Planet 1", p1);
        planetsMap.put("Planet 2", p2);
        planetsMap.put("Planet 3", p3);
        planetsMap.put("Planet 4", p4);
        planetsMap.put("Planet 5", p5);

        System.out.println("Planet maps size is = " + planetsMap.size());

        Set<String> keySet = planetsMap.keySet();
        Iterator<String> itr1 = keySet.iterator();

        while (itr1.hasNext()) {
            String key = itr1.next();
            Planet planet = planetsMap.get(key);
            System.out.println(planet.getName());

            //System.out.println(planetsMap.get(itr1.next()).getName());
        }
    }

    public static void catchExceptionThrows() {
        try {
            generateExceptionThrows();
        } catch (ArithmeticException e) {
            // Log the exception
            e.printStackTrace();
            System.out.println("ArithmeticException happened");
        }
    }

    public static void generateExceptionThrows() throws ArithmeticException {
        int a = 100;
        int b = 0;
        int c = a / b;

        System.out.println(c);
    }

    public static void catchExceptionThrow() {
        try {
            generateExceptionThrow();
        } catch (OwnException e) {
            e.printStackTrace();
            e.printCustomMessage();
            System.out.println("OwnException happened");
        }
    }

    public static void generateExceptionThrow() throws OwnException {
        try {
            int a = 100;
            int b = 0;
            int c = a / b;

            System.out.println(c);
        } catch (ArithmeticException e) {
            // Log the exception
            /*e.printStackTrace();
            System.out.println("ArithmeticException happened");*/
            throw new OwnException();
        }
    }

    public static void generateException() {
        // Open a file
        // DB/DB cursor is opened
        try {
            // Reading from a file
            // Reading from the DB/DB cursor
            int a = 100;
            int b = 0;
            int c = a / b;

            System.out.println(c);
        } catch (ArithmeticException e) {
            // Log the exception
            e.printStackTrace();
            System.out.println("ArithmeticException happened");
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("ArrayIndexOutOfBoundsException happened");
        } finally {
            // Independent of exception handling finally block is guaranteed to be executed.
            // Close the file
            // Close the DB cursor or DB connection
            // Release the resources
            System.out.println("Exception happened");
        }
    }

    public static void printNumbersOneToHundred() {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i< 100; i++) {
                    System.out.println(i+1);
                }
            }
        });
        t.start();
    }

    public static Runnable printNumbersOneToHundredRunnable() {
        return new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i< 100; i++) {
                    System.out.println(i+1);
                }
            }
        };
    }

    public static void printNumbers101To200() {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 100; i< 200; i++) {
                    System.out.println(i+1);
                }
                // Nesting another thread
                printNumbers201To300InThread();
            }
        });
        t.start();
    }

    public static void printNumbers201To300InThread() {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 100; i< 200; i++) {
                    System.out.println(i+1);
                }
                // Nesting another thread
                printNumbersOneToHundred();
            }
        });
        t.start();
    }

    public static void printNumbers201To300() {
        for (int i = 200; i< 300; i++) {
            System.out.println(i+1);
        }
    }
}
