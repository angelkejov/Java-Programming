package com.company;

import java.util.Scanner;

public class reverse_an_array_of_string {
    public static void main(String[] args) {
//        int[] numbers = new int[]{1, 2, 3, 4, 5, 6};
//        String[] numbersString = new String[numbers.length];
//
//        for (int i = 0; i < numbersString.length; i++) {
//           numbersString[i] = String.valueOf(numbers[i]);
//        }
//
//        System.out.println(String.join(", ", numbersString));


        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        for (int i = 0; i < input.length / 2; i++) {
            String temp = input[i];
            input[i] = input[input.length - 1 - i];
            input[i] = input[input.length - 1 - i] = temp;
        }

        System.out.print(String.join(" ", input));
    }
}
