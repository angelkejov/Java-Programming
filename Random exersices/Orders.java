package com.company;

import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> orders = new TreeMap<>();
        String input;

        while (true) {
            input = scanner.nextLine();

            if (input.equals("buy")) {
                break;
            }

            String[] tokens = input.split(" ");
            String name = tokens[0];
            double price = Double.parseDouble(tokens[1]);
            int quantity = Integer.parseInt(tokens[2]);

            double total = price * quantity;

            if (!orders.containsKey(name)) {
                orders.put(name, total);
            } else {
                //Do if name is contaising to add new price and quantuty
            }
        }

        for (Map.Entry<String, Double> stringDoubleEntry : orders.entrySet()) {
            System.out.printf("%s -> %.2f%n", stringDoubleEntry.getKey(), stringDoubleEntry.getValue());
        }
    }
}
