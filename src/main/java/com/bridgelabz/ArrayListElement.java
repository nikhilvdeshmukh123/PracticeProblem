package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListElement {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Cat");
        arrayList.add("Dog");
        arrayList.add("Parrot");
        arrayList.add("Pigeon");
        arrayList.add("Penguin");
        System.out.println("Original ArrayList: " + arrayList);

        int index = 2;
        arrayList.remove(index);
        System.out.println("After removing third element ArrayList: " + arrayList);
    }
}

