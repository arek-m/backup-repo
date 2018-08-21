package pl.coderstrust.fibonacci;

public class FibonacciIterativeArray {
    //Method 2: using large array
    static long calculateFibonacciWArray(int n) {
        if (n < 3) {
            return 1;
        } else {
            long[] fibonacciValuesArray = new long[n];
            fibonacciValuesArray[0] = 1;
            fibonacciValuesArray[1] = 1;
            for (int i = 3; i <= n; i++) {
                fibonacciValuesArray[i - 1] = fibonacciValuesArray[i - 2] + fibonacciValuesArray[i - 3];
            }
            return fibonacciValuesArray[n - 1];
        }
    }
}
