package com.company;

import java.util.Scanner;

public class print_part_of_the_ascii_table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        for (int i = start; i <= end; i++) {
            System.out.print((char) i + " ");

        }
    }
}
