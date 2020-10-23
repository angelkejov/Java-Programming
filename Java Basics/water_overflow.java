package com.company;

import java.util.Scanner;

public class water_overflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = 255;
        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 0; i < n; i++) {
            n = Integer.parseInt(scanner.nextLine());

            if (sum + n > capacity) {
                System.out.println("Insufficient capacity!");
            } else {
                sum += n;
            }
        }

        System.out.println(sum);
    }
}
