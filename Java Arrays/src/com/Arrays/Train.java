package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Train {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vagons = Integer.parseInt(sc.nextLine());
        int[] peopleInVagons = new int[vagons];
        int sum = 0;

        for (int i = 0; i < vagons; i++) {
            int currentNum = Integer.parseInt(sc.nextLine());
            peopleInVagons[i] = currentNum;
            sum += currentNum;
        }

        for (int peopleInVagon : peopleInVagons) {
            System.out.printf("%d ", peopleInVagon);
        }
        System.out.println();
        System.out.println(sum);
    }
}
