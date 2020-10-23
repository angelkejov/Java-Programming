package com.company;

import java.util.Scanner;

public class Vacantion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleCount = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double price = 0;

        if (typeOfGroup.equals("Students")) {
            if (dayOfWeek.equals("Friday")) {
                price = 8.45 * peopleCount;
            } else if (dayOfWeek.equals("Saturday")) {
                price = 9.80 * peopleCount;
            } else if (dayOfWeek.equals("Sunday")) {
                price = 10.46 * peopleCount;
            }

            if (peopleCount >= 30) {
                price -= price * 0.15;;
            }

        } else if (typeOfGroup.equals("Business")) {
            if (peopleCount >= 100) {
                peopleCount = 90;
            }

            if (dayOfWeek.equals("Friday")) {
                price = 10.90 * peopleCount;
            } else if (dayOfWeek.equals("Saturday")) {
                price = 15.60 * peopleCount;
            } else if (dayOfWeek.equals("Sunday")) {
                price = 16.00 * peopleCount;
            }


        } else if (typeOfGroup.equals("Regular")) {
            if (dayOfWeek.equals("Friday")) {
                price = 15.00 * peopleCount;
            } else if (dayOfWeek.equals("Saturday")) {
                price = 20.00 * peopleCount;
            } else if (dayOfWeek.equals("Sunday")) {
                price = 22.50 * peopleCount;
            }

            if (peopleCount >= 10 && peopleCount <= 20 ) {
                price -= price * 0.5;
            }
        }

        System.out.println(price);
    }
}
