package com.company;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String password = sc.nextLine();

        if (!passwordDigitsAndLetters(password)) {
            System.out.println("kur");
        }
    }

    private static boolean passwordDigitsAndLetters(String password) {
        boolean isItContainsOnlyDigitsAndLetters = false;
        for (int i = 0; i < password.length(); i++) {
            char currChar = (char) i;
            if (Character.isDigit(currChar) && Character.isLetter(currChar)) {
                isItContainsOnlyDigitsAndLetters = true;
            }
        }

        return isItContainsOnlyDigitsAndLetters;
    }
}
