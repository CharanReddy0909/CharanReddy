package practicePackage;
import java.util.*;
import java.util.stream.*;

public class Streams_5 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "apricot", "grape");

        char letter = 'a';

        long count = words.stream()
                          .filter(word -> word.startsWith(String.valueOf(letter)))
                          .count();

        System.out.println("Count of words starting with '" + letter + "': " + count);
    }
}
