package com.Arrays;

import java.util.Scanner;

public class PascalTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        printPascal(n);
    }

    public static void printPascal(int n)
    {
        for(int line = 1; line <= n; line++)
        {

            int C=1;
            for(int i = 1; i <= line; i++)
            {
                System.out.print(C+" ");
                C = C * (line - i) / i;
            }
            System.out.println();
        }
    }
}
