package com.company;

import java.util.Scanner;

public class nameagegarde {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double grade = Double.parseDouble(scanner.nextLine());

        System.out.println("Name: %s, Age: %d, Grade: %.2f");
    }
}
