package com.company;

import java.util.Scanner;

public class MathPower {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double number = Double.parseDouble(sc.nextLine());
        int power = Integer.parseInt(sc.nextLine());
        System.out.printf("%.3f", powerOfNumber(number, power));
    }

    private static double powerOfNumber(double number, int power) {
        return Math.pow(number, (int) power);
    }
}
