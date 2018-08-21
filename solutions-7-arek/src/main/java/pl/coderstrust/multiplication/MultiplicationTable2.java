package pl.coderstrust.multiplication;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        printMultiplicationTable2(1);
        printMultiplicationTable2(3);
        printMultiplicationTable2(5);
        printMultiplicationTable2(8);
        printMultiplicationTable2(12);
    }

    public static void printMultiplicationTable2(int size) {
        for (int row_i = 0; row_i <= size; row_i++) {
            for (int col_j = 0; col_j <= size; col_j++) {
                if (row_i == 0 || col_j == 0) {
                    if (row_i == 0 && col_j == 0) {
                        System.out.print("  ");
                    } else if (row_i == 0) {
                        System.out.print(spacing(col_j, 1) + col_j);
                    } else {
                        System.out.print(spacing(row_i) + row_i);
                    }
                } else {
                    System.out.print(spacing(row_i, col_j) + row_i * col_j); //all other numbers printing
                }

            }
            System.out.println();
        }
        System.out.println(); //end of the whole multiplication table, print empty line
    }

    //I assume here I don't know the System.out.format, so I have to calculate spacings: Method for n
    public static String spacing(int value1, int value2) {
        if (value1 * value2 < 10) {
            return "    ";
        } else if (value1 * value2 < 100) {
            return "   ";
        } else {
            return "  ";
        }
    }

    public static String spacing(int value) {
        if (value < 10) {
            return " ";
        } else {
            return "";
        }
    }
}
