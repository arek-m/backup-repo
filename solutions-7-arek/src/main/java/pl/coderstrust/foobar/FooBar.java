package pl.coderstrust.foobar;

import java.util.ArrayList;

public class FooBar {

    public static ArrayList<String> printFooOrBarUpToNumber(int maxNumber) {
        if (maxNumber < 0) {
            throw new IllegalArgumentException("maxNumber should be greater or equal to 0");
        }

        ArrayList<String> result = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <= maxNumber; i++) {
            stringBuilder.append(i + " ");
            if (i % 3 == 0) {
                stringBuilder.append("Foo");
            }
            if (i % 5 == 0) {
                stringBuilder.append("Bar");
            }
            result.add(stringBuilder.toString());
            stringBuilder.delete(0, stringBuilder.length());
        }
        return result;
    }
}
