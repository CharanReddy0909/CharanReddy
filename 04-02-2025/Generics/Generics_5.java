package practicePackage;

import java.util.ArrayList;
import java.util.List;

public class Generics_5 {

   
    public static <T> List<T> mergeAlternating(List<T> list1, List<T> list2) {
        List<T> mergedList = new ArrayList<>();
        int maxSize = Math.max(list1.size(), list2.size());

        for (int i = 0; i < maxSize; i++) {
            if (i < list1.size()) {
                mergedList.add(list1.get(i));
            }
            if (i < list2.size()) {
                mergedList.add(list2.get(i));
            }
        }
        return mergedList;
    }

    public static void main(String[] args) {
        // Example usage
        List<Integer> intList1 = List.of(1, 3, 5);
        List<Integer> intList2 = List.of(2, 4, 6, 8);
        System.out.println("Merged Integer List: " + mergeAlternating(intList1, intList2));

        List<String> stringList1 = List.of("A", "C", "E");
        List<String> stringList2 = List.of("B", "D", "F", "G");
        System.out.println("Merged String List: " + mergeAlternating(stringList1, stringList2));
    }
}