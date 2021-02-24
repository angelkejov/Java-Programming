package com.company;

import java.util.Scanner;

public class Calculations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String operation = sc.nextLine();
        int number1 = Integer.parseInt(sc.nextLine());
        int number2 = Integer.parseInt(sc.nextLine());

        switch (operation) {
            case "add":
                add(number1, number2);
                break;
            case "subtract":
                subtract(number1, number2);
                break;
            case "multiply":
                multiply(number1, number2);
                break;
            case "divide":
                divide(number1, number2);
                break;
        }
    }

    private static void divide(int n1, int n2) {
        System.out.println(n1 / n2);
    }

    private static void subtract(int n1, int n2) {
        System.out.println(n1 - n2);
    }

    private static void add(int n1, int n2) {
        System.out.println(n1 + n2);
    }

    private static void multiply(int n1, int n2) {
        System.out.println(n1 * n2);
    }
}
