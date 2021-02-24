package com.company;

import java.util.Scanner;

public class PalindromeIntegers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        while(true) {
            input = sc.nextLine();

            if (input.equals("END")) {
                break;
            } else {
                int numbers = Integer.parseInt(input);
                if (isPalindrome(numbers)) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }
            }
        }
    }

    public static boolean isPalindrome(int number) {
        int palindrome = number;
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        if (number == reverse) {
            return true;
        }
        return false;
    }
}
