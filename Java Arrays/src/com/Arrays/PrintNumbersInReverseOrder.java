package com.Arrays;

import java.util.Scanner;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int[] nums = new int[n];

        for (int i = 0; i < nums.length; i++) {
            int number = Integer.parseInt(sc.nextLine());
            nums[i] = number;
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }
    }
}
