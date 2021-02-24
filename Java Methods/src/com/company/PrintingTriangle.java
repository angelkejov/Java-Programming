package com.company;

import java.util.Scanner;

public class PrintingTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++) {
           printLine(i);
        }

        for (int i = n - 1; i >= 1; i--) {
            printLine(i);
        }
    }

    private static void printLine(int maxNumber) {
        for (int i = 1; i <= maxNumber; i++) {
            System.out.print(i);
            if (i < maxNumber) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
