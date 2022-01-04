package numbermanipulations;

import org.junit.Assert;
import org.junit.Test;

public class MachineTest {

    /**
     * 1. Identity method we need to write test case.
     * 2. Identity the test cases.
     * 3. Write pre-conditions for the test.
     * 4. Write post-conditions for the test.
     * 5. Get the dependencies
     */
    @Test // annotation
    public void additionOfTwoNumbersTest() {
        // Add two positive numbers: 2, 3
        Machine machine = new Machine();
        int addedValue1 = machine.additionOfTwoNumbers(2, 3);
        Assert.assertEquals(addedValue1, 5);

        // Add two negative numbers
        int addedValue2 = machine.additionOfTwoNumbers(-2, -3);
        Assert.assertEquals(addedValue2, -5);

        // Add one pos and one neg number.
        int addedValue3 = machine.additionOfTwoNumbers(-1000, 2000);
        Assert.assertEquals(addedValue3, 1000);
    }

    @Test
    public void subtractionTest() {
        // Subtract two positive numbers: 2, 3
        Machine machine = new Machine();
        int subValue1 = machine.subtractNumbers(2, 3);
        Assert.assertEquals(subValue1, -1);

        // Subtract two negative numbers
        int subValue2 = machine.subtractNumbers(-2, -3);
        Assert.assertEquals(subValue2, 1);

        // Subtract one pos and one neg number.
        int subValue3 = machine.subtractNumbers(-1000, 2000);
        Assert.assertEquals(subValue3, -3000);
    }
}
