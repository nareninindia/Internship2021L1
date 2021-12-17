import numbermanipulations.ListExercise;
import numbermanipulations.NumberManipulator;
import org.json.JSONObject;

public class StringExercise {
    /**
     * Auto-completion
     * Immediate compilation
     * See documentation of earlier implementations in IDE
     * Read documentation available in the internet
     */
    /**
     * Target:
     * Understand String class and its available method for String manipulation
     * How to use existing methods
     * @param args
     */
    public static void main(String[] args) {
        // int, char, boolean, double, float, String
        String s1 = new String("String s1"); // 1 new String object with variable name s1
        String s2 = "String s1"; // 1 new String object with variable name s2
        Double d1 = 10.00;

        // Numbers - addition, subtraction, mul, div
        boolean isS1EqualsToS2 = s1.equals(s2);
        System.out.println("s1 equals s2: " + isS1EqualsToS2);

        boolean isS1EqualsToD1 = s1.equals(d1);
        System.out.println("s1 equals d1: " + isS1EqualsToD1);

        String s3 = "string s1";
        boolean isS1EqualsToIgnoreCaseS3 = s1.equalsIgnoreCase(s3);
        System.out.println("s1 equals s3: " + isS1EqualsToIgnoreCaseS3);
        int[] intArray = {4, 5, 6};
        String[] emptyStringArray = {};
        int length = emptyStringArray.length;
        StringExercise[] stringExercises = {new StringExercise(), new StringExercise()};
        int numberAtIndex2 = intArray[2]; // Output is 6

        int x = 3;
        int y = 4;
        int z = 5;
        NumberManipulator numberManipulator = new NumberManipulator();
        int p = numberManipulator.addTwoNumbers(numberManipulator.addTwoNumbers(x, y), z);
        System.out.println(p);

        int q = numberManipulator.addTwoNumbers(x, y);
        int r = numberManipulator.addTwoNumbers(q, z);
        System.out.println(r);

        //{ "name": "Rahul", "year": 3}
        JSONObject j1 = new JSONObject();
        j1.put("name", "Rahul");
        j1.put("year", 3);
        j1.put("college", "xyz");
        System.out.println(j1.toString());

        /*System.out.println("addStringsToList:");
        ListExercise.addStringsToList();
        System.out.println("addStringsToLinkedList:");
        ListExercise.addStringsToLinkedList();*/
        System.out.println("addStringsToHashSet:");
        ListExercise.addStringsToHashSet();
        ListExercise.addVehiclesToHashSet();
        ListExercise.customComparison();
        ListExercise.addVehiclesToHashMap();
        //ListExercise.generateException();
        ListExercise.catchExceptionThrows();
        ListExercise.catchExceptionThrow();
        ListExercise.addPlanetsToHashMap();
    }
}
