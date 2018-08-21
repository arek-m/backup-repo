package pl.coderstrust.sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] myArray = {100, 90, -89, -77, 55, 033, 22, 11, -9, 9, -9, 8, 8, -8, 1};
        System.out.println("Original array is ");
        System.out.println(Arrays.toString(myArray));
        System.out.println("After sorting array is ");
        System.out.println(Arrays.toString(sort(myArray)));
        System.out.println("Again original array is: ");
        System.out.println(Arrays.toString(myArray));
    }

    static int[] sort(int[] array) {
        int[] arrayToSort = Arrays.copyOf(array, array.length);
        for (int i = 0; i < arrayToSort.length; i++) {
            int indexOfMinimalValue = getIndexOfLowestValueInArray(arrayToSort,i);
            swapArrayElements(arrayToSort, i, indexOfMinimalValue);
        }
        return arrayToSort;
    }

    static int getIndexOfLowestValueInArray(int[] anArray, int initialIndex) {
        int minIndex = initialIndex;
        for (int i = initialIndex; i < anArray.length; i++) {
            if (anArray[i] <= anArray[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    static void swapArrayElements(int[] arrayToSwap, int indexOfFirstElement, int indexOfSecondElement) {
        int temporaryValue = arrayToSwap[indexOfFirstElement];
        arrayToSwap[indexOfFirstElement] = arrayToSwap[indexOfSecondElement];
        arrayToSwap[indexOfSecondElement] = temporaryValue;
    }
}
