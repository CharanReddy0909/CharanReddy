package practicePackage;

import java.util.LinkedList;

public class Collections_20 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(40);

        int firstOccurrence = list.indexOf(20);
        int lastOccurrence = list.lastIndexOf(20);

        System.out.println("First occurrence of 20: " + firstOccurrence);
        System.out.println("Last occurrence of 20: " + lastOccurrence);
    }
}

