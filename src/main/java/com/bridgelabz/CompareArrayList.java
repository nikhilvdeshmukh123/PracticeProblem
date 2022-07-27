package com.bridgelabz;

import java.util.ArrayList;

public class CompareArrayList {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Red");
        list1.add("Orange");
        list1.add("Blue");
        list1.add("Black");
        System.out.println("ArrayList1: " + list1);

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("White");
        list2.add("Orange");
        list2.add("Blue");
        list2.add("Black");
        System.out.println("ArrayList2: " + list2);

        if (list1 == list2) {
            System.out.println("Both Arraylist are equal");
        } else {
            System.out.println("Both Arraylist are not equal");
        }
    }
}