package com.company;

import java.util.Scanner;

public class CharactersInRange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch1 = sc.nextLine().charAt(0);
        char ch2 = sc.nextLine().charAt(0);
        CountCharacters(ch1, ch2);
    }

    static void CountCharacters(char start, char end) {
        for (int i = start + 1; i < end; i++) {
            System.out.print((char) i + " ");
        }
    }
}
