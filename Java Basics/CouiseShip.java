package com.company;

import java.util.Scanner;

public class CouiseShip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfCruise = scanner.nextLine();
        String typeOfCabin = scanner.nextLine();
        int countOfNights = Integer.parseInt(scanner.nextLine());

        double price = 0;

        if (typeOfCruise.equals("Mediterranean")) {
            if (typeOfCabin.equals("standard cabin")) {
                price = 27.50 * 4 * countOfNights;
            } else if (typeOfCabin.equals("cabin with balcony")) {
                price = 30.20 * 4 * countOfNights;
            } else if (typeOfCabin.equals("apartment")) {
                price = 40.50 * 4 * countOfNights;
            }
        } else if (typeOfCruise.equals("Adriatic")) {
            if (typeOfCabin.equals("standard cabin")) {
                price = 22.99 * 4 * countOfNights;
            } else if (typeOfCabin.equals("cabin with balcony")) {
                price = 25.00 * 4 * countOfNights;
            } else if (typeOfCabin.equals("apartment")) {
                price = 34.99 * 4 * countOfNights;
            }
        } else if (typeOfCruise.equals("Aegean")) {
            if (typeOfCabin.equals("standard cabin")) {
                price = (23.00 * 4) * countOfNights;
            } else if (typeOfCabin.equals("cabin with balcony")) {
                price = 26.60 * 4 * countOfNights;
            } else if (typeOfCabin.equals("apartment")) {
                price = 39.80 * 4 * countOfNights;
            }
        }

        if (countOfNights > 7) {
            price -= price * 0.25;
        }

        System.out.printf
                ("Annie's holiday in the %s sea costs %.2f lv."
                        , typeOfCruise, price);
    }
}

