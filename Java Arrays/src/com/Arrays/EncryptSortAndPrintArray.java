package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            String inputs = sc.nextLine();
            int length = inputs.length();
            int sum = 0;

            for (int j = 0; j < length; j++) {
                char currentChar = inputs.charAt(j);

                if (isVowel(currentChar)) {
                    sum += currentChar * length;
                } else if (isConsanant(currentChar)) {
                    sum += currentChar / length;
                }
            }
            numbers[i] += sum;
        }
        Arrays.sort(numbers);

        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static boolean isVowel(char c) {
        String vowels = "aeiouAEIOU";
        return vowels.contains(c + "");
    }

    public static boolean isConsanant(char c) {
        String cons = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        return cons.contains(c + "");
    }
}
