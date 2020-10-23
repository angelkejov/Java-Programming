package com.company;

import java.util.Scanner;

public class pounds_to_dollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pounds = Integer.parseInt(scanner.nextLine());
        double result = pounds * 1.31;
        System.out.printf("%.3f", result);
    }
}
