package com.company;

import java.util.Scanner;

public class sdv {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            System.out.println(input);
        }
    }
}
