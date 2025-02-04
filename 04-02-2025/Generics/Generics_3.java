package practicePackage;

import java.util.List;

public class Generics_3 {

    
    public static <T> int findFirstOccurrence(List<T> list, T target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        
        List<Integer> intList = List.of(10, 20, 30, 40, 50);
        System.out.println("Index of 30: " + findFirstOccurrence(intList, 30)); // Output: 2
        
        List<String> stringList = List.of("A", "B", "C", "D");
        System.out.println("Index of 'B': " + findFirstOccurrence(stringList, "B")); // Output: 1
        
        
        System.out.println("Index of 'Z': " + findFirstOccurrence(stringList, "Z")); // Output: -1
    }
}