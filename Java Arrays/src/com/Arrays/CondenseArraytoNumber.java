package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArraytoNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] originalArray = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        if (originalArray.length == 1) {
            System.out.println(originalArray[0]);
        } else {

            while (originalArray.length != 1) {
                int[] condensed = new int[originalArray.length - 1];

                for (int i = 0; i < originalArray.length - 1; i++) {
                    condensed[i] = originalArray[i] + originalArray[i + 1];
                }
                originalArray = condensed;
            }
        }
        System.out.println(originalArray[0]);
    }
}
