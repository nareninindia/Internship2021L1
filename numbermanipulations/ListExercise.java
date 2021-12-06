package numbermanipulations;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
    }
}
