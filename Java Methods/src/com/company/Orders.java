package com.company;

import java.util.Scanner;

public class Orders {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String product = sc.nextLine();
        int quantity = Integer.parseInt(sc.nextLine());
        price(product, quantity);
    }

    private static void price(String p, int q) {
        if (p.equals("water")) {
            System.out.println(q * 1.00);
        } else if (p.equals("coffee")) {
            System.out.println(q * 1.50);
        } else if (p.equals("coke")) {
            System.out.println(q * 1.40);
        } else if (p.equals("snacks")) {
            System.out.println(q * 2.00);
        }
    }
}
