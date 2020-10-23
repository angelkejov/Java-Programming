package com.company;

import java.util.Scanner;

public class beer_kegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double maxFormula = 0;
        String biggestKegs = "";

        int count = 0;
        for (int i = 0; i < n; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double formula = Math.PI * radius * radius * height;

            if (formula > maxFormula) {
                maxFormula = formula;
                biggestKegs = model;
            }
        }

        System.out.println(biggestKegs);
    }
}
