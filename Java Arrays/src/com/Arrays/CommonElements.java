package com.Arrays;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] array1 = sc.nextLine().split(" ");
        String[] array2 = sc.nextLine().split(" ");

        for (String item1 : array1) {
            for (String item2 : array2) {
                if (item1.equals(item2)) {
                    System.out.print(item2 + " ");
                }
            }
        }
    }
}
