package com.company;

import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = n; i <= end; i++) {
            System.out.print(i + " ");

            sum += i;
        }
        System.out.println();
        System.out.println("Sum: " + sum);
    }
}
