package com.company;

import java.util.Scanner;

public class common_elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        String[] input1 = scanner.nextLine().split(" ");

        String result = "";
        for (var g : input1) {
            if (input.equals(g)) {
                result += " ";
                System.out.println(g);
            }
        }
        System.out.println(result);
    }
}
