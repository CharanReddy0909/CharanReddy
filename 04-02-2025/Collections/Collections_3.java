package practicePackage;

import java.util.ArrayList;
import java.util.List;

public class Collections_3 {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        colors.add(0, "Orange");

        System.out.println("New color List: " + colors);
    }
}