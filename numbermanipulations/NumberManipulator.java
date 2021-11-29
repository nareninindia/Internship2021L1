package numbermanipulations;

public class NumberManipulator {
    /**
     * Adding two numbers
     * @param a first number
     * @param b second number
     * @return int added number
     */
    public int addTwoNumbers(int a, int b) {
        int c = a + b;
        int[] n = new int[3];
        n[0] = 1;
        n[1] = 2;
        n[2] = 3; // {1, 2, 3}
        int[] o = new int[3];
        o[0] = 10;
        o[1] = 11;
        o[2] = 12; // {1, 2, 3}
        int[][] m = new int[2][3];
        m[0] = n;
        m[1] = o;
        // {{1, 2, 3}, {10, 11, 12}}
        return c;
    }
}
