package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        for (int i = 0; i < numbers.length / 2; i++) {
            int rightSum = 0;
            int leftSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += numbers[j];
            }

            for (int k = i + 1; k < numbers.length; k++) {
                rightSum += numbers[k];
            }

            if (rightSum == leftSum) {
                System.out.println(i);

                if (numbers[i] == 0 && numbers[i + 1] == 0)
                {
                    continue;
                }
                else
                {
                    return;
                }
            } else {
                System.out.println("no");
            }
        }
    }
}
