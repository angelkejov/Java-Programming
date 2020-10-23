package com.company;

import java.util.Scanner;

public class special_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            int sumOfDigit = 0;
            int digits = i;

            while (digits > 0) {
                sumOfDigit += digits % 10;
                digits = digits / 10;
            }

            if (sumOfDigit == 5 || sumOfDigit == 7 || sumOfDigit == 11) {
                System.out.printf("%d -> True\n", i);
            } else {
                System.out.printf("%d -> False\n", i);
            }
        }
    }
}
