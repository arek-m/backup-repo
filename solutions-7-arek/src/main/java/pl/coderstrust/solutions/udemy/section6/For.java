package pl.coderstrust.solutions.udemy.section6;

public class For {
    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));

        for (int i = 8; i > 1; i--) {
            System.out.println("int i =" + i);
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }
        int count = 0;
        for (int i = 10; i < 1000; i++){
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
            }
        }
        System.out.println("In this range we have " + count + " prime numbers");
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            //System.out.println(n + " (cond.1) Its not a prime number ");
            return false;
        } else {
            for (int i = 2; i <= (long) Math.sqrt(n); i++) {
                if (n % i == 0) {
                //    System.out.println(n + " (cond.2) Its not a prime number ");
                    return false;
                } else {
                //    System.out.println("I checked conditions for i up to " + i);
                }
            }

            //System.out.println(n + " It is a prime number ");
            return true;
        }
    }


    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

}
