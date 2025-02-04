package practicePackage;

import java.util.LinkedList;

public class Collections_19 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(30);
        list.add(40);

        list.add(1, 20);
        list.add(2, 25);
        System.out.println(list);
    }
}
