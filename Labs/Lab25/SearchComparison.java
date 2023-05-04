package com.example.ghostbusters;

import java.util.Arrays;

public class SearchComparison {

    public static void main(String[] args) {
        int[] array = createArray(100000000);
        double toSec = 0.000000001;

        long startTime, endTime, executionTime;

        // Linear Search
        startTime = System.nanoTime();
        for (int i = 0; i <= 100000; i++) {
            linearSearch(array, i);
        }
        endTime = System.nanoTime();
        executionTime = endTime - startTime;
        System.out.println("Linear Search Execution Time: " + executionTime * toSec + " Seconds");

        // Binary Search
        startTime = System.nanoTime();
        for (int i = 0; i <= 100000000; i++) {
            Arrays.binarySearch(array, i);
        }
        endTime = System.nanoTime();
        executionTime = endTime - startTime;
        System.out.println("Binary Search Execution Time: " + executionTime * toSec + " Seconds");
    }

    public static int[] createArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }
        return array;
    }

    public static int linearSearch(int[] array, int targetValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == targetValue) {
                return i;
            }
        }
        return -1;
    }
}

