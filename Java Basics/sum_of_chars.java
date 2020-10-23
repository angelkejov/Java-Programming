package com.company;

import java.util.Scanner;

public class sum_of_chars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        char ch = ' ';
        int sum = 0;

        for (int i = 0; i < n; i++) {
           ch = scanner.next().charAt(0);

           int ascii = ch;

            sum += ascii;
        }


        System.out.printf("The sum equals: %d", sum);
    }
}
