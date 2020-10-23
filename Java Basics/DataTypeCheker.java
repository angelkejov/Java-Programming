package com.company;


import java.util.Scanner;

public class DataTypeCheker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currBalance = Double.parseDouble(scanner.nextLine());
        String input = "";
        double price = 0;
        double spend = 0;
        String game = "";

        while (true) {
            input = scanner.nextLine();

            if (input.equals("Game Time")) {
                break;
            }

            if (input.equals("OutFall 4")) {
                price += 39.99;
                game = "OutFall 4";
            } else if (input.equals("CS:GO")) {
                price += 15.99;
                game = "CS:GO";
            } else if (input.equals("Zplinter Zell")) {
                price += 19.99;
                game = "Zplinter Zell";
            } else if (input.equals("Honored 2")) {
                price += 59.99;
                game = "Honored 2";
            } else if (input.equals("RoverWatch")) {
                price += 29.99;
                game = "RoverWatch";
            } else if (input.equals("RoverWatch Origins Edition")) {
                price += 39.99;
                game = "RoverWatch Origins Edition";
            } else {
                System.out.println("Not Found");
            }

             if (price > currBalance) {
                 System.out.println("Too Expensive");
             }

            currBalance -= price;
            spend += price;
            System.out.printf("Bought %s", game);

            if (currBalance == 0) {
                System.out.println("Out of money!");
            }
        }

        System.out.printf("Total spend: $%s. Remaining: $%s", spend, currBalance);
    }
}
