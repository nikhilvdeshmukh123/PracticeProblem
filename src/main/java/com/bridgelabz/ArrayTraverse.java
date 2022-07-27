package com.bridgelabz;

public class ArrayTraverse {
    public static void main(String args[]) {
        int[] array = new int[6];
        array[0] = 4;
        array[1] = 7;
        array[2] = 8;
        array[3] = 3;
        array[4] = 5;
        array[5] = 6;

        System.out.println("Array elements are: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}