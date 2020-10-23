package com.company;

import java.util.Scanner;

public class integer_operation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());
        int n4 = Integer.parseInt(scanner.nextLine());

        int result1 = n1 + n2;
        int result2 = result1 / n3;
        int result3 = result2 * n4;

        System.out.println(result3);
    }
}
