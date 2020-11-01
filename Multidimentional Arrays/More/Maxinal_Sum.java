package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Maxinal_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimentions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = dimentions[0];
        int cols = dimentions[1];

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        int maxSum = Integer.MIN_VALUE;
        int indexRow = 0, indexCol = 0;

        for (int i = 1; i < rows - 1; i++) {
            for (int j = 1; j < cols - 1; j++) {
                int sum = calculateMatrixSum(matrix,i, j);
                if (sum > maxSum) {
                    maxSum = sum;
                    indexRow = i;
                    indexCol = j;
                }
            }
        }

        System.out.println("Sum = " + maxSum);

        printMaxSubMatrix(matrix, indexRow, indexCol);
    }

    private static void printMaxSubMatrix(int[][] matrix, int indexRow, int indexCol) {
        for (int row = indexRow - 1; row <= indexRow + 1; row++) {
            for (int col = indexCol - 1; col <= indexCol + 1; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static int calculateMatrixSum(int[][] matrix, int i, int j) {
        int sum = 0;

        sum += matrix[i][j];
        sum += matrix[i][j + 1];
        sum += matrix[i][j - 1];
        sum += matrix[i - 1][j];
        sum += matrix[i + 1][j];
        sum += matrix[i - 1][j + 1];
        sum += matrix[i - 1][j - 1];
        sum += matrix[i + 1][j + 1];
        sum += matrix[i + 1][j - 1];

        return sum;
    }
}
