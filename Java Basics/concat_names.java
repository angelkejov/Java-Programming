package com.company;

import java.util.Scanner;

public class concat_names {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();
        String concat = scanner.nextLine();

        System.out.println(firstName + concat + secondName);
    }
}
