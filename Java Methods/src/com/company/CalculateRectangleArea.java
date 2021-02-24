package com.company;

import java.util.Scanner;

public class CalculateRectangleArea {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = Integer.parseInt(sc.nextLine());
        int height = Integer.parseInt(sc.nextLine());

        System.out.println(areaOfRectangle(width, height));
    }

    private static int areaOfRectangle(int width, int height) {
        return width * height;
    }
}
