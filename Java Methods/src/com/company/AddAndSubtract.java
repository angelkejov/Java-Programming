package com.company;

import java.util.Scanner;

public class AddAndSubtract {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int n1 = Integer.parseInt(sc.nextLine());
        int n2 = Integer.parseInt(sc.nextLine());

        System.out.println(substractWithThird(n, n1, n2));
    }

    private static int sumFirstTwoIntegers(int n1, int n2) {
        return n1 + n2;
    }

    private static int substractWithThird(int n1, int n2, int n3) {
        return sumFirstTwoIntegers(n1, n2) - n3;
    }
}
