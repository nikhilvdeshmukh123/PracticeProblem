package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter nth number to print the sum: ");
        int n = scanner.nextInt();
        ArrayList<Integer> integers = new ArrayList<>();
        for(int i = 0; i <= n; i++){
            integers.add(i);
        }
        Integer ans = integers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(ans);
    }
}
