package com.company;

import java.util.Scanner;

public class MathOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = Integer.parseInt(sc.nextLine());
        String operator = sc.nextLine();
        int n2 = Integer.parseInt(sc.nextLine());

        System.out.println(calculate(n1, operator, n2));
    }

    private static double calculate(int number1, String operation, int number2) {
        double sum = calculateSum(number1, number2);
        double difference = calculateDifference(number1, number2);
        double multitude = calculateMultitude(number1, number2);
        double division = calculateDivision(number1, number2);

        return switch (operation) {
            case "+" -> sum;
            case "-" -> difference;
            case "*" -> multitude;
            case "/" -> division;
            default -> 0;
        };
    }

    private static double calculateSum(int number1, int number2) {
        return number1 + number2;
    }

    private static double calculateDifference(int number1, int number2) {
        return number1 - number2;
    }

    private static double calculateMultitude(int number1, int number2) {
        return number1 * number2;
    }

    private static double calculateDivision(double number1, double number2) {
        return number1 / number2;
    }
}
