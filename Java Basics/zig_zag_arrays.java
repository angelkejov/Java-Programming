package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class zig_zag_arrays {
    public static void main(String[] args) {

        // int[] arr = Arrays
        //
        //.stream(sc.nextLine().split(" "))
        //
        //.mapToInt(e -> Integer.parseInt(e)).toArray();

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] firstArr = new int[n];
        int[] secondArr = new int[n];

        for (int i = 0; i < n; i++) {
            int[] input = Arrays
                    .stream(scanner.nextLine().split(" "))
                    .mapToInt(e -> Integer.parseInt(e)).toArray();

            if (i % 2 == 0) {
                firstArr[i] = input[0];
                secondArr[i] = input[1];
            } else {
                firstArr[i] = input[1];
                secondArr[i] = input[0];
            }

        }
        System.out.print("In first array: ");
        for (int h : firstArr) {
            System.out.print(h + " ");
        }

        System.out.println();

        System.out.print("In second array: ");
        for (int g : secondArr) {
            System.out.print(g + " ");
        }

    }
}
