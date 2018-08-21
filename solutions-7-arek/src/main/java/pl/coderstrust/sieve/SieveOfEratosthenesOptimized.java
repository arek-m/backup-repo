package pl.coderstrust.sieve;

import java.util.Arrays;

public class SieveOfEratosthenesOptimized {
    public static void main(String[] args) {
        System.out.print(Arrays.toString(sieve(1000)));
    }

    static int[] sieve(int maxNumber) {
        int[] arrayOfAllNumbers = new int[maxNumber - 1];
        int[] arrayOfPrimeNumbers = new int[maxNumber / 2];
        int counter = 0;
        for (int i = 2; i <= maxNumber; i++) {
            if (arrayOfAllNumbers[i - 2] != -1) {
                arrayOfAllNumbers[i - 2] = i;
            }
            if (i <= maxNumber / 2 + 1) {
                for (int j = 2; j <= maxNumber / i; j++) {
                    arrayOfAllNumbers[j * i - 2] = -1;
                }
            }
            if (arrayOfAllNumbers[i - 2] != -1) {
                arrayOfPrimeNumbers[counter] = arrayOfAllNumbers[i - 2];
                counter++;
                //If I could here use dynamically generated array then everything would be done in the first run of
                //the first for loop. Otherwise using only arrays I am forced to run another loop of for to count number
                //of prime numbers to define new arrayOfPrimeNumbers size  ... which I wanted to avoid actually
            }
        }
        return arrayOfPrimeNumbers;
    }
}
