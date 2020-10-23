package com.company;

import java.util.Scanner;

public class equal_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input1 = scanner.nextLine().split(" ");
        String[] input2 = scanner.nextLine().split(" ");
        int[] numbers1 = new int[input1.length];
        int[] numbers2 = new int[input2.length];

        for (int i = 0; i < input1.length; i++) {
            numbers1[i] = Integer.parseInt(input1[i]);
        }
        for (int i = 0; i < input2.length; i++) {
            numbers2[i] = Integer.parseInt(input2[i]);
        }

        int sum = 0;

        for (int i = 0; i < numbers1.length; i++) {
            sum += numbers1[i];

            if (numbers1[i] != numbers2[i]) {
                System.out.printf("Arrays are not identical." +
                        " Found difference at %d index", i);
            } else {
                System.out.printf("Arrays are identical. Sum: %d", sum);
            }
        }
    }
}
