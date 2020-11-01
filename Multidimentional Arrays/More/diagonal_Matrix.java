package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class diagonal_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimentions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int n = Integer.parseInt(String.valueOf(dimentions[0]));

        int[][] matrix = new int[n][n];
        for (int row = 0; row < matrix.length; row++) {
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix[row] = arr;
        }
        printDiagonalSums(matrix, n);
    }

    static void printDiagonalSums(int [][]mat,
                                  int n){
        int principal = 0, secondary = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j)
                    principal += mat[i][j];
                if ((i + j) == (n - 1))
                    secondary += mat[i][j];
            }
        }

        int difference = principal - secondary;
        if (difference < 0) {
            difference = Math.abs(difference);
            System.out.println(difference);
        } else {
            System.out.println(difference);
        }
    }

}
