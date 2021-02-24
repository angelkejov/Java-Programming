package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplyEvensByOdds {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Math.abs(Integer.parseInt(sc.nextLine()));
        int result = FindResult(num);
        System.out.println(result);

    }

    private static int FindResult(int num) {
        return FindSumOfEvens(num) * FindSumOfOdds(num);
    }

    static int FindSumOfOdds(int num) {

        int sumOfOdds = 0;

        while (num != 0) {
            int nextNum = num % 10;

            if (nextNum % 2 == 1) {
                sumOfOdds += nextNum;
            }
            num -= nextNum;
            num /= 10;

        }


        return sumOfOdds;
    }

    static int FindSumOfEvens(int num) {

        int sumOfEvens = 0;
        while (num != 0) {
            int nextNum = num % 10;

            if (nextNum % 2 == 0) {
                sumOfEvens += nextNum;
            }
            num -= nextNum;
            num /= 10;

        }

        return sumOfEvens;
    }
}
