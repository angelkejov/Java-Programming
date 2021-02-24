package com.company;

import java.util.Scanner;

public class VowelsCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        System.out.println(countOfVowelsInString(input));
    }

    private static int countOfVowelsInString(String str) {
        char[] vowelsSmallerCase = new char[] {
                'a',
                'e',
                'i',
                'o',
                'u'
        };

        char[] vowelsUpperCase = new char[] {
                'A',
                'E',
                'I',
                'O',
                'U'
        };

        int counter = 0;
        for (int i = 0; i < vowelsSmallerCase.length; i++) {
                String currSmallerCaseChar = String.valueOf(vowelsSmallerCase[i]);

                if (str.contains(currSmallerCaseChar)) {
                    counter++;
                }
        }

        for (int i = 0; i < vowelsUpperCase.length; i++) {
            String currUpperCaseChar = String.valueOf(vowelsUpperCase[i]);
            if (str.contains(currUpperCaseChar)) {
                counter++;
            }
        }

        return counter;
    }
}
