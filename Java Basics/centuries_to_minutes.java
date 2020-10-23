package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class centuries_to_minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int centuries = Integer.parseInt(scanner.nextLine());
        int years = centuries * 100;
        int days = (int)(years * 365.2422);
        int hours = days * 24;
        int minutes = hours * 60;

        System.out.printf("%d centuries = %d years = %d days = %d hours = " + minutes +" minutes",
                centuries, years, days, hours);
    }
}
