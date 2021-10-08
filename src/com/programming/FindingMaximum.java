package com.programming;

public class FindingMaximum {

    public static Integer maxOfInteger(Integer a1, Integer a2, Integer a3) {
        Integer max = a1;
        if (a2.compareTo(max) > 0)
            max = a2;
        if (a3.compareTo(max) > 0)
            max = a3;
        return max;
    }

    public static void main(String[] args) {
        Integer a1 = 10, a2 = 8, a3 = 9;
        System.out.println("Maximum value is : " + maxOfInteger(a1, a2, a3));

    }
