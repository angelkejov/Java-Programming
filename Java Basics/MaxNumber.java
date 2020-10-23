package com.company;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int numbers = Integer.parseInt(scanner.nextLine());
            sum += numbers;

            if (numbers > max) {
                max = numbers;
            }
        }

        int sumWithoutMax = max - sum;

        if (max == sumWithoutMax) {
            System.out.println("Yes");
            System.out.println("Sum: " + sumWithoutMax);
        } else {
            int diff = Math.abs(max - sumWithoutMax);
            System.out.println("No");
            System.out.println("Diff: " + diff);
        }
    }
}
