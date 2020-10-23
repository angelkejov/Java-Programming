package com.company;

import java.util.Scanner;

public class PrimeAndOddPositions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sumOfOdd = 0;
        int oddMin = 0;
        int oddMax = 0;
        int sumOfPrime = 0;
        int primeMin = 0;
        int primeMax = 0;

        for (int i = 0; i < n; i++) {
            int numbers = Integer.parseInt(scanner.nextLine());

            if (numbers % 2 == 0) {
                sumOfPrime += numbers;
            } else {
                sumOfOdd += numbers;
            }

            oddMin = Math.min(numbers, numbers);
            oddMax = Math.max(numbers, numbers);
            primeMin = Math.min(numbers, numbers);
            primeMax = Math.max(numbers, numbers);
        }

        System.out.println("Odd Sum=" + sumOfOdd);
        System.out.println("Odd Min=" + oddMin);
        System.out.println("Odd Max=" + oddMax);
        System.out.println("Even Sum=" + sumOfPrime);
        System.out.println("Even Min=" + primeMin);
        System.out.println("Even Max=" + primeMax);
    }
}
