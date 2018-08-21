package pl.coderstrust.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] myArray = {-100, 90, 89, 77, 55, 0, -33, 22, 11, -444, 9, -9, 8, 8, 8, 1};
        System.out.println("Original array is ");
        System.out.println(Arrays.toString(myArray));
        System.out.println("After sorting array is: ");
        System.out.println(Arrays.toString(sort(myArray)));
        System.out.println("Again original array is: ");
        System.out.println(Arrays.toString(myArray));
    }

    static int[] sort(int[] array) {
        int[] arrayToSort = Arrays.copyOf(array, array.length);
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < (arrayToSort.length - 1); i++) {
                if (arrayToSort[i] > arrayToSort[i + 1]) {
                    swapArrayElements(arrayToSort, i, i + 1);
                    swapped = true;
                }
            }
        } while (swapped);
        return arrayToSort;
    }

    static void swapArrayElements(int[] arrayToSwap, int indexOfFirstElement, int indexOfSecondElement) {
        int temporaryValue = arrayToSwap[indexOfFirstElement];
        arrayToSwap[indexOfFirstElement] = arrayToSwap[indexOfSecondElement];
        arrayToSwap[indexOfSecondElement] = temporaryValue;
    }
}
