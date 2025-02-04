package practicePackage;

import java.util.ArrayList;
import java.util.List;

public class Collections_5 {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        colors.set(2, "Orange");

        System.out.println("Updated Color List: " + colors);
    }
}
