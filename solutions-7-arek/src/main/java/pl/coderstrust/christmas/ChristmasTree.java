package pl.coderstrust.christmas;

import java.util.ArrayList;

public class ChristmasTree {

   static ArrayList<String> printChristmasTree(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Size of Christmas Tree should be greater than 0");
        }
        ArrayList<String> christmasTree = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < size - i; j++) {
                stringBuilder.append(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                stringBuilder.append("*");
            }
            christmasTree.add(stringBuilder.toString());
            stringBuilder.delete(0,stringBuilder.length());
        }
        for (int i = 1; i <= size - 2; i++) {
            stringBuilder.append(" ");
        }
        stringBuilder.append("**");
        christmasTree.add(stringBuilder.toString());
        return christmasTree;
    }
}
