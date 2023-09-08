package hw5;

import java.util.ArrayList;
import java.util.List;

public class PrintArray {
    
    public static void printArray(List<?> array) {
        for (Object item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();
        intList.add(6);
        intList.add(19);
        intList.add(7);
        intList.add(12);

        List<String> stringList = new ArrayList<>();
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        stringList.add("D");

        printArray(intList);
        printArray(stringList);
        
    }
}
