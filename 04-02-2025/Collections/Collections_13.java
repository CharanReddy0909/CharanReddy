package practicePackage;

import java.util.LinkedList;

public class Collections_13 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        int startPosition = 2;
        for (int i = startPosition; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

