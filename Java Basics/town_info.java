package com.company;

import java.util.Scanner;

public class town_info {
    public  static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int population = Integer.parseInt(scanner.nextLine());
        int squareKm = Integer.parseInt(scanner.nextLine());

        System.out.printf("Town %s has population of %d and area %d square km."
                , name, population, squareKm);
    }
}
