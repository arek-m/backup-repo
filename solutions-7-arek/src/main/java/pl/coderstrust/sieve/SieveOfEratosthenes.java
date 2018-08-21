package pl.coderstrust.sieve;

import java.util.Arrays;

public class SieveOfEratosthenes {
    private final static int MARKER = 0;

    public static void main(String[] args) {
        System.out.print(Arrays.toString(sieve(12)));
    }

    static int[] sieve(int maxNumber) {
        int[] arrayOfAllNumbers = createInitialArray(maxNumber);
        for (int i = 2; i < maxNumber; i++) {
            removeMultiplies(arrayOfAllNumbers, i);
        }
        return extractPrimeNumbers(arrayOfAllNumbers);
    }

    static int[] createInitialArray(int maxNumber) {
        int[] arrayOfNumbers = new int[maxNumber];
        for (int i = 0; i < maxNumber; i++) {
            arrayOfNumbers[i] = i;
        }
        return arrayOfNumbers;
    }

    static void removeMultiplies(int[] arrayToClean, int number) {
        for (int i = number + number; i < arrayToClean.length; i += number) {
            arrayToClean[i] = MARKER;
        }
    }

    static int getCountOfPrimeNumbers(int[] array) {
        int counter = 0;
        for (int i = 2; i < array.length; i++) {
            if (array[i] != MARKER) {
                counter++;
            }
        }
        return counter;
    }

    static int[] extractPrimeNumbers(int[] array) {
        int[] arrayWithPrimeNumbers = new int[getCountOfPrimeNumbers(array)];
        for (int i = 2, j = 0; i < array.length; i++) {
            if (array[i] != MARKER) {
                arrayWithPrimeNumbers[j++] = i;
            }
        }
        return arrayWithPrimeNumbers;
    }
}
