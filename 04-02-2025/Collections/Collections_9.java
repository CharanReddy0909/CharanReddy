package practicePackage;

import java.util.ArrayList;

public class Collections_9 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);

        ArrayList<Integer> list2 = new ArrayList<>(list1);
        System.out.println(list2);
    }
}
