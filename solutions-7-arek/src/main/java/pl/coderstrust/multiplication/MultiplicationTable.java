package pl.coderstrust.multiplication;

import java.util.ArrayList;

public class MultiplicationTable {

    public static ArrayList<String> printMultiplicationTable(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Size of Multiplication Table should be grater than 0");
        }
        ArrayList<String> resultTable = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("  ");
        //first line printing
        for (int i = 1; i <= size; i++) {
            stringBuilder.append(printSpacesForResult(i) + i);
        }
        resultTable.add(stringBuilder.toString());
        stringBuilder.delete(0,stringBuilder.length());
        for (int row_i = 1; row_i <= size; row_i++) {
            //first number in row printing
            stringBuilder.append(printSpacesForRowNumber(row_i) + row_i);
            for (int col_j = 1; col_j <= size; col_j++) {
                //all other numbers printing
                int result = row_i * col_j;
                stringBuilder.append(printSpacesForResult(result)+result);
            }
            resultTable.add(stringBuilder.toString());
            stringBuilder.delete(0,stringBuilder.length());
        }
        return resultTable;
    }

    private static String printSpacesForResult(int result) {
        if (result < 10) {
            return "    ";
        } else if (result < 100) {
            return "   ";
        } else {
            return "  ";
        }
    }

    private static String printSpacesForRowNumber(int value) {
        if (value < 10) {
            return " ";
        } else {
            return "";
        }
    }
}
