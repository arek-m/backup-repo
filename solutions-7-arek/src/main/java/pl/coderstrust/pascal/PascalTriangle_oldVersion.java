package pl.coderstrust.pascal;

public class PascalTriangle_oldVersion {
    public static void main(String[] args) {
        int size;
        printPascalTriangle(5);
        printPascalTriangle(20);
    }

     static void printPascalTriangle(int size) {
            for (int row = 0; row <= size; row++) {
                for (int col = 0; col < (size - row); col++) {
                    System.out.print("    ");
                }
                for (int col = 0; col <= row; col++) {
                    long value1 = calculateTriangleCellValue(row,col);
                    long value2 = calculateTriangleCellValue(row,col+1);
                    System.out.print(value1 + printSpaces(value2));
                }
                System.out.println();
            }
            System.out.println();
    }

    static long calculateTriangleCellValue(long row, long col) {
        return factorial(row) / (factorial(col) * factorial(row - col));
    }

    static long factorial(long n) {
        long result = 1;
        while (n >= 1) {
            result *= n;
            n--;
        }
        return result;
    }

    static String printSpaces(long value) {
        if (value < 10) {
            return "       ";
        } else if (value < 100) {
            return "      ";
        } else if (value < 1000) {
            return "     ";
        } else if (value < 10000) {
            return "    ";
        } else if (value < 100000) {
            return "   ";
        } else {
            return "  ";
        }

    }
}
