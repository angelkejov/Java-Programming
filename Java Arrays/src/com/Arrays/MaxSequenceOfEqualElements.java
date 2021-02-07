package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] input = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int big = 0;
        int times = 1;
        int digit = 0;
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] == input[i + 1]) {
                times++;

                if (times > big) {
                    big = times;
                    digit = input[i];
                } else {
                    times = 1;
                }
            }
        }

        for (int i = 0; i < big; i++) {
            System.out.println(digit);
        }
    }
}
