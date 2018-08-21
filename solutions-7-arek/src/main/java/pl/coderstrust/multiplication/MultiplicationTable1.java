package pl.coderstrust.multiplication;

public class MultiplicationTable1 {
    public static void main(String[] args) {
        printMultiplicationTable(1);
        printMultiplicationTable(3);
        printMultiplicationTable(5);
        printMultiplicationTable(8);
        printMultiplicationTable(12);
    }

    public static void printMultiplicationTable(int size) {
        System.out.print("  ");   //first spacing to make corner
        for (int i = 1; i <= size; i++) { //first line printing
            System.out.print(spacing(i, 1) + i);
        }
        System.out.println();
        for (int row_i = 1; row_i <= size; row_i++) {
            System.out.print(spacing(row_i) + row_i); //first number in row printing
            for (int col_j = 1; col_j <= size; col_j++) {
                System.out.print(spacing(row_i, col_j) + row_i * col_j); //all other numbers printing
            }
            System.out.println();  //end of line, transition to next row
        }
        System.out.println(); //end of the whole multiplication table, print empty line
    }

    //I assume here I don't know the System.out.format, so I have to calculate spacings: Method for it below
    public static String spacing(int value1, int value2) {
        if (value1 * value2 < 10) {
            return "    ";
        } else if (value1 * value2 < 100) {
            return "   ";
        } else {
            return "  ";
        }
    }

    //spacing for row and column values , not for multiplication values
    public static String spacing(int value) {
        if (value < 10) {
            return " ";
        } else {
            return "";
        }
    }
}
