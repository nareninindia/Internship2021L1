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
    }
}