package com.company;

import java.util.Scanner;

public class Savings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double dohodNaMesec = Double.parseDouble(scanner.nextLine());
        int meseciCount = Integer.parseInt(scanner.nextLine());
        double neobhodimaSuma = Double.parseDouble(scanner.nextLine());

        double lichniRazhodi = dohodNaMesec * 0.30;
        double spestqvaniqNaMesec = dohodNaMesec - (neobhodimaSuma + lichniRazhodi);
        double meseciSpestqvane = meseciCount * spestqvaniqNaMesec;

        double procent = Math.abs(spestqvaniqNaMesec / dohodNaMesec * 100);

        System.out.printf("She can save %.2f\n", procent);
        System.out.printf("%.2f\n", meseciSpestqvane);
    }
}
