package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArrayOfStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] characters = sc.nextLine().split(" ");

        for (int i = 0; i < characters.length / 2; i++) {
            String tmp = characters[i];
            characters[i] = characters[characters.length - i - 1];
            characters[characters.length - i - 1] = tmp;

        }
        System.out.println(String.join(" ", characters));
    }
}
