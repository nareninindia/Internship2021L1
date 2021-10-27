public class Loops{

     public static void main(String []args){
        // for, while, do-while
        // Print all numbers divisible by 10 from 1 to 1000 (for loop)
        int index = 1;
        while (index <= 1000) {
            if (index % 10 == 0) {
                System.out.println("Number: " + index);
            }
            index++;
        }
        System.out.println("Final: " + index);

        int sum;
        for (index = 1, sum = 0; index <= 1000; index++) {
            sum = sum + index;
            // sum = 0 + 1; index = 2; if (index <= 1000)
            // sum = 1 + 2; index = 3; if (index <= 1000)
            // sum = 3 + 4
            // sum = 7 + 5...
            // sum = 500500; index = 1001; if (index <= 1000)
        }
        System.out.println("Sum by for loop: " + sum);
        index = 1000;
        sum = (index * (index + 1))/2;
        System.out.println("Sum by formula: " + sum);

        // Exercise: 1- Infinite loops using for, while, do-while
        index = 1;
        do {
            if (index % 10 == 0) {
                System.out.println("Number: " + index);
            }
            index++;
        } while (index <= 1000);
        System.out.println("Final: " + index);

        index = 0;
        sum = 0;
        do {
            index++;
            sum = sum + index;

            // index = 1; sum = 0 + 1; if (index <= 1000)
            // index = 2; sum = 1 + 2; if (index <= 1000)..
            // index = 1000; sum = 500500; if (index <= 1000)
            // index = 1001; sum = 501501; if (index <= 1000)
        } while (index <= 1000);
        System.out.println("Sum by do-while loop: " + sum);

        index = 0;
        while (index == 1) {
            System.out.println("index - while: " + index);
        }

        index = 0;
        do {
            System.out.println("index - do-while: " + index);
        } while (index == 1);

        // for - initializations; conditon; execute {}; postExecution
        // while - condition; execute {}
        // do-while - execute {}; condition
     }
}
