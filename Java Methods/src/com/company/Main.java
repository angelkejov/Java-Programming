package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        if (isPositive(n)) {
            System.out.printf("The number %d is positive.", n);
        } else {
            System.out.printf("The number %d is negative.", n);
        }
    }

    public static boolean isPositive(int n) {
        if (n >= 0) {
            return true;
        } else {
            return false;
        }
    }

}
