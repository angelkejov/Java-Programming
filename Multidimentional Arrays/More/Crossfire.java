package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Crossfire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimentions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = dimentions[0];
        int cols = dimentions[1];

        List<List<Integer>> matrix = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < rows; i++) {
            matrix.add(new ArrayList<>());
            for (int j = 0; j < cols; j++) {
                count++;
                matrix.get(i).add(count);

            }
        }
        String input = scanner.nextLine();

        while (!input.equals("Nuke it from orbit")) {

            String[] numbers = input.split("\\s+");
            int row = Integer.parseInt(numbers[0]);
            int column = Integer.parseInt(numbers[1]);
            int radius = Integer.parseInt(numbers[2]);

            for (int i = row - radius; i <= radius + row; i++) {
                if (isInRange(i, column, matrix) && i != row) {
                    matrix.get(i).remove(column);
                }
            }

            for (int i = column + radius; i >= radius - column; i--) {
                if (isInRange(row, i, matrix)) {
                    matrix.get(row).remove(i);
                }
            }
            matrix.removeIf(List::isEmpty);
            input = scanner.nextLine();
        }

        for (List<Integer> integers : matrix) {
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
    private static boolean isInRange(int row, int col, List<List<Integer>> matrix) {
        return row >= 0 && row < matrix.size() && col >= 0 && col < matrix.get(row).size();
    }
}
