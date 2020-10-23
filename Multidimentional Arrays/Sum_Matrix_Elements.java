package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Sum_Matrix_Elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimentions = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = dimentions[0];
        int cols = dimentions[1];

        int[][] matrix = new int[rows][];

        for (int i = 0; i < rows; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix[i] = arr;
        }
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        int sum = 0;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                sum += matrix[row][col];
            }
        }

        System.out.println(sum);
    }
}
