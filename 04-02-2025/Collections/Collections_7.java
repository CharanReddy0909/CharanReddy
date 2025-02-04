package practicePackage;

import java.util.ArrayList;

public class Collections_7 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        int element = 30;
        if (list.contains(element)) {
            System.out.println(element + " is present in the list.");
        } else {
            System.out.println(element + " is not found in the list.");
        }
    }
}

