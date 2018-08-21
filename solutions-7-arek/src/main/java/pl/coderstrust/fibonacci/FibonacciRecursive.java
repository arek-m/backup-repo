package pl.coderstrust.fibonacci;

public class FibonacciRecursive {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(fibonacci(i));
        }
    }

    static long fibonacci(long fibonacciNumberInOrder) {
        if (fibonacciNumberInOrder < 2) {
            return fibonacciNumberInOrder;
        } else {
            return (fibonacci(fibonacciNumberInOrder - 1) + fibonacci(fibonacciNumberInOrder - 2));
        }
    }
}
