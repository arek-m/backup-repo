package pl.coderstrust.multiplication;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MultiplicationTable3 {
    public static void main(String[] args) {
        printMultiplicationTable3(1);
        printMultiplicationTable3(3);
        printMultiplicationTable3(5);
        printMultiplicationTable3(8);
        printMultiplicationTable3(12);
    }

    static void printMultiplicationTable3(int size) {
        String fileName = "output_size" + size + ".txt";
        try {
            PrintWriter fileWriter = new PrintWriter(fileName);
            System.out.println("Success, created file");
            //first spacing to make corner
            fileWriter.print("  ");
            //first line printing
            for (int i = 1; i <= size; i++) {
                fileWriter.print(printSpacesForResult(i) + i);
            }
            fileWriter.println();
            for (int row_i = 1; row_i <= size; row_i++) {
                //first number in row printing
                fileWriter.print(printSpacesForRowNumber(row_i) + row_i);
                for (int col_j = 1; col_j <= size; col_j++) {
                    //all other numbers printing
                    int result = row_i * col_j;
                    fileWriter.print(printSpacesForResult(result) + result);
                }
                fileWriter.println();
            }
            fileWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static String printSpacesForResult(int result) {
        if (result < 10) {
            return "    ";
        } else if (result < 100) {
            return "   ";
        } else {
            return "  ";
        }
    }

    static String printSpacesForRowNumber(int value) {
        if (value < 10) {
            return " ";
        } else {
            return "";
        }
    }
}
