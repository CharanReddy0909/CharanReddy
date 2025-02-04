package practicePackage;

import java.util.ArrayList;
import java.util.List;

public class Collections_2 {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        for (String color : colors) {
            System.out.println(color);
        }
    }
}