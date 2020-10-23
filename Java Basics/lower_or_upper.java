package com.company;

import java.nio.charset.IllegalCharsetNameException;
import java.util.Scanner;

public class lower_or_upper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char input = scanner.next().charAt(0);

        boolean isUpper = Character.isUpperCase(input);
        boolean isLower = Character.isLowerCase(input);

        if (isLower == true) {
            System.out.println("lower-case");
        } else if (isUpper == true) {
            System.out.println("upper-case");
        }
    }
}
