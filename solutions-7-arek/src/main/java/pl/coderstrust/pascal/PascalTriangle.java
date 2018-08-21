package pl.coderstrust.pascal;

import java.util.ArrayList;

public class PascalTriangle {

    public static ArrayList<String> printPascalTriangle(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("maxNumber should be greater than 0");
        }
        ArrayList<String> resultPascalTriangle = new ArrayList<String>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int row = 0; row < size; row++) {
            for (int col = 1; col < size - row; col++) {
                stringBuilder.append(String.format("%2s",""));
            }
            for (int col = 0; col <= row; col++) {
                Long nodeValue = calculateTriangleNodeValue(row, col);
                stringBuilder.append(String.format("%4s",nodeValue));
            }
            resultPascalTriangle.add(stringBuilder.toString());
            stringBuilder.delete(0,stringBuilder.length());
        }
        return resultPascalTriangle;
    }

    private static long calculateTriangleNodeValue(int row, int col) {
            return factorial(row) / (factorial(col) * factorial(row - col));
    }

    private static long factorial(int n) {
        long result = 1;
        while (n >= 1) {
            result *= n;
            n--;
        }
        return result;
    }
}
