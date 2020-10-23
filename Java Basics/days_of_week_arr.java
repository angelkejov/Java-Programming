package com.company;

import java.util.Scanner;

public class days_of_week_arr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] days = new String[7];
        days[0] = "Monday";
        days[1] = "Tuesday";
        days[2] = "Wednesday";
        days[3] = "Thursday";
        days[4] = "Friday";
        days[5] = "Saturday";
        days[6] = "Sunday";

        int n = Integer.parseInt(scanner.nextLine());

        if (n == 1) {
            System.out.println(days[0]);
        } else if (n == 2) {
            System.out.println(days[1]);
        } else if (n == 3) {
            System.out.println(days[2]);
        } else if (n == 4) {
            System.out.println(days[3]);
        } else if (n == 5) {
            System.out.println(days[4]);
        } else if (n == 6) {
            System.out.println(days[5]);
        } else {
            System.out.println("Invalid day!");
        }

    }
}
