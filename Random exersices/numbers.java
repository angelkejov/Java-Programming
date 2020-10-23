package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] numbersasString = input.split("\\s+");
        int a = Integer.parseInt(numbersasString[0]);
        int b = Integer.parseInt(numbersasString[1]);
        int p = Integer.parseInt(numbersasString[2]);
        int q = Integer.parseInt(numbersasString[3]);
        int count = 0;

        for (int i = a; i <= b; i++) {
            if (i % p == q) {
                count++;
            }
        }
        System.out.println(count);
    }
}
