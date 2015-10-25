package com.example.mandiow.traceapp;

/**
 * Created by Mandiow on 25/10/2015.
 */
public class Quicksort {

    private int array[];
    private int length;

    public void Fill(int[] inputArr) {

        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;

    }

    public void Sort(int lowerIndex, int higherIndex) {

        int low = lowerIndex;
        int high = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
        // Divide into two arrays
        while (low <= high) {
            //Magic of quicksort: each time this is called in recursion, we find a number in the left witch is > than the pivot and a number < than pivot in the right side
            while (array[low] < pivot) {
                low++;
            }
            while (array[high] > pivot) {
                high--;
            }
            if (low <= high) {
                exchangeNumbers(low, high);
                //move index to next position on both sides
                low++;
                high--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < high)
            Sort(lowerIndex, high);
        if (low < higherIndex)
            Sort(low, higherIndex);
    }

    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
