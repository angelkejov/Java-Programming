package com.company;

import java.util.Scanner;

public class FactorialDivision {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = Integer.parseInt(sc.nextLine());
        int n2 = Integer.parseInt(sc.nextLine());
        System.out.printf("%.2f", getFactorial(n1, n2));
    }

    private static double getFactorial(double n1, double n2) {
        double fact1 = 1;
        double fact2 = 1;
        for(int i = 1;i <= n1;i++){
            fact1 = fact1 * i;
        }

        for(int i = 1;i <= n2;i++){
            fact2 = fact2 * i;
        }

        return fact1 / fact2;
    }
}
