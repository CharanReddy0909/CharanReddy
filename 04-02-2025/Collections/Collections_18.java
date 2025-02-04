package practicePackage;

import java.util.LinkedList;

public class Collections_18 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        list.addLast(40);
        System.out.println(list);
    }
}

