package com.company;

import java.util.Scanner;

public class Counter_Strike {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int energy = Integer.parseInt(scanner.nextLine());
        String input;
        int count = 0;

        while (true) {
            input = scanner.nextLine();

            if (input.equals("End of battle")) {
                System.out.printf("Won battles: %d. Energy left: %d%n", count, energy);
                break;
            }

            int distance = Integer.parseInt(input);

            if (energy <= 0) {
                break;
            } else {
                energy -= distance;
                count++;
            }

            if (count % 3 == 0) {
                energy += count;
            }

            if (distance > energy) {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy%n", count, energy);
            }

        }

    }
}
