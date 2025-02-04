package practicePackage;

import java.util.LinkedList;

public class Collections_16 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(20);
        list.add(30);
        list.add(40);

        list.addFirst(10);
        list.addLast(50);
        System.out.println(list);
    }
}

