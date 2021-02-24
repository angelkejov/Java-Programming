package com.company;

import java.util.Scanner;

public class PasswordValidator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password = sc.nextLine();
        if (!passwordLength(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        } else if (!passwordDigitsAndLetters(password)) {
            System.out.println("Password must consist only of letters and digits");
        } else if (!passwordMustHaveAtleastTwoDigits(password)) {
            System.out.println("Password must have at least 2 digits");
        }

        if (passwordLength(password) && passwordDigitsAndLetters(password)
                && passwordMustHaveAtleastTwoDigits(password)) {
            System.out.println("Password is valid");
        }
    }

    private static boolean passwordLength(String password) {
        boolean isInRange = false;
        if (password.length() >= 6 && password.length() <= 10) {
            isInRange = true;
        }
        return isInRange;
    }

    private static boolean passwordDigitsAndLetters(String password) {
        boolean isItContainsOnlyDigitsAndLetters = false;
        for (int i = 0; i < password.length(); i++) {
            char currChar = (char) i;
            if (Character.isDigit(currChar) || Character.isLetter(currChar)) {
                isItContainsOnlyDigitsAndLetters = true;
            }
        }

        return isItContainsOnlyDigitsAndLetters;
    }

    private static boolean passwordMustHaveAtleastTwoDigits(String password) {
        boolean isHaveTwoDigits = false;
        int counterOfDigits = 0;

        for (int i = 0; i < password.length(); i++) {
            char currChar = (char)i;
            if (Character.isDigit(currChar)) {
                counterOfDigits++;
            }
        }

        if (counterOfDigits >= 2) {
            isHaveTwoDigits = true;
        }

        return isHaveTwoDigits;
    }
}
