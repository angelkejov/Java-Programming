package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class array_rotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();
       int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            int temp = numbers[0];

            for (int j = 0; j < numbers.length - 1; j++) {
                numbers[i] = numbers[i + 1];
            }
            numbers[numbers.length - 1] = temp;
        }

        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
