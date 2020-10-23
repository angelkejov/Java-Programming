package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Positions_Of {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimentions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = dimentions[0];
        int cols = dimentions[1];

        int[][] matrix = new int[rows][];
        boolean isFound = false;

        for (int i = 0; i < rows; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix[i] = arr;
        }

        int searchNumber = Integer.parseInt(scanner.nextLine());

            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix[row].length; col++) {
                    if (matrix[row][col] == searchNumber) {
                        System.out.printf("%d %d%n", row, col);
                        isFound = true;
                    }
                }
            }

        if (!isFound) {
            System.out.println("not found");
        }
    }
}
