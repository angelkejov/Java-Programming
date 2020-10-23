package com.company;

import java.util.Scanner;

public class train_wagons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfWagons = Integer.parseInt(scanner.nextLine());
        int[] wagons = new int[countOfWagons];

        int sum = 0;
        for (int i = 0; i < countOfWagons; i++) {
            wagons[i] = Integer.parseInt(scanner.nextLine());

            sum += wagons[i];
        }

        System.out.println(sum);
    }
}
