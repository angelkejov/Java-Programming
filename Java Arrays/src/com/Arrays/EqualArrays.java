package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] arr2 = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;

        for (int i : arr1) {
            sum += i;
            for (int i1 : arr2) {
                if (i == i1) {
                    System.out.println(sum);
                } else {
                    System.out.printf("Arrays are not identical. Found\n" +
                            "difference at %d index.", i);
                    break;
                }
            }
        }

        // NE E DOVURSHERNO

    }
}
