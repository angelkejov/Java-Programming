package com.company;

import java.util.Scanner;

public class even_and_odd_sum_substraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        int sumEven = 0;
        int sumOdd = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }
        }

        int result = sumEven - sumOdd;

        System.out.println(result);
    }
}
