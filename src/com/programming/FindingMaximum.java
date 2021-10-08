package com.programming;

import java.util.Arrays;

public class FindingMaximum<T> {

    T[] elements;

    public FindingMaximum(T[] elements) {
        this.elements = elements;
    }

    /*
     * Generic method to store values in array and return maximum value.
     *
     * @param elements.
     *
     */
    public static <T> T maxOFValues(T[] elements) {
        Arrays.sort(elements);
        int length = elements.length;
        T max = elements[length - 1];
        return max;
    }

    public static void main(String[] args) {

        Integer[] intMax = {1, 82, 5, 80, 4, 87, 100, 58};
        System.out.println("Maximum value is: " + maxOFValues(intMax));

        Float[] floatMax = {1.6f, 87.8f, 82.8f, 80.2f, 4.8f};
        System.out.println("Maximum value is: " + maxOFValues(floatMax));

        String[] stringMax = {"S", "A", "M", "B", "M"};
        System.out.println("Maximum value is: " + maxOFValues(stringMax));

    }

}