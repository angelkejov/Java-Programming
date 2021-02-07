package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int[] array1 = new int[n];
        int[] array2 = new int[n];

        for (int i = 0; i < n; i++) {
            int[] nums = Arrays.stream(sc.nextLine().split(" "))
                    .mapToInt(e -> Integer.parseInt(e))
                    .toArray();
            for (int j = 0; j < nums.length - 1; j++) {
                array2[i] = nums[j];
                array1[i] = nums[j + 1];
            }
        }

        for (int i = 0; i < n; i+= 2) {
            int temp = 0;
            temp = array2[i];
            array2[i] = array1[i];
            array1[i] = temp;
        }

        String first = String.join(" ", Arrays.toString(array1));
        String second = String.join(" ", Arrays.toString(array2));

        System.out.println(first);
        System.out.println(second);
    }
}
