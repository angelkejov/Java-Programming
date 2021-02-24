package com.company;

import java.util.Scanner;

public class SmallestOfThreeNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = Integer.parseInt(sc.nextLine());
        int n2 = Integer.parseInt(sc.nextLine());
        int n3 = Integer.parseInt(sc.nextLine());

        System.out.println(getSmallestNumber(n1, n2, n3));
    }

    public static double getSmallestNumber(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }
}
