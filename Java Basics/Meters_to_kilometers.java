package com.company;

import java.util.Scanner;

public class Meters_to_kilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int meters = Integer.parseInt(scanner.nextLine());
        double result = meters * 0.001;
        System.out.printf("%.2f", result);
    }
}
