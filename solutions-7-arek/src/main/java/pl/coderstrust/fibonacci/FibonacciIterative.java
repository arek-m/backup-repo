package pl.coderstrust.fibonacci;

public class FibonacciIterative {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(fibonacci(i));
        }
    }

    static long fibonacci(long fibonacciNumberInOrder) {
        long actualValue = 0;
        long previousValue = 1;
        for (long i = 0; i < fibonacciNumberInOrder; i++) {
            previousValue += actualValue;
            actualValue = previousValue - actualValue;
        }
        return actualValue;
    }
}
