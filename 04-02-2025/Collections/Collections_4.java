package practicePackage;

import java.util.ArrayList;
import java.util.List;

public class Collections_4 {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        System.out.println("Element at index 2: " + colors.get(2));
    }
}

