package practicePackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Generics_4 {

    
    public static <T> List<T> reverseList(List<T> list) {
        List<T> reversedList = new ArrayList<>(list);
        Collections.reverse(reversedList);
        return reversedList;
    }

    public static void main(String[] args) {
        // Example usage
        List<Integer> intList = List.of(1, 2, 3, 4, 5);
        System.out.println("Original List: " + intList);
        System.out.println("Reversed List: " + reverseList(intList));

        List<String> stringList = List.of("A", "B", "C", "D");
        System.out.println("Original List: " + stringList);
        System.out.println("Reversed List: " + reverseList(stringList));
    }
}

