package practicePackage;

import java.util.*;
import java.util.stream.*;

public class Streams_2{
    public static void main(String[] args) {
        List<String> words = Arrays.asList("a", "b", "c", "d");

        List<String> upperCaseWords = words.stream().map(String::toUpperCase).collect(Collectors.toList());

        System.out.println("Uppercase: " + upperCaseWords);

        List<String> lowerCaseWords = words.stream()
                                           .map(String::toLowerCase)
                                           .collect(Collectors.toList());

        System.out.println("Lowercase: " + lowerCaseWords);
    }
}
