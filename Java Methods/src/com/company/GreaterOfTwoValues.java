package com.company;

import java.util.Scanner;

public class GreaterOfTwoValues {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String type = sc.nextLine();
        switch (type) {
            case "int":
                int n1 = Integer.parseInt(sc.nextLine());
                int n2 = Integer.parseInt(sc.nextLine());

                System.out.println(getMaxInt(n1, n2));
                break;

            case "char":
                char ch1 = sc.nextLine().charAt(0);
                char ch2 = sc.nextLine().charAt(0);

                System.out.println(getMaxChar(ch1, ch2));
                break;

            case "string":
                String s1 = sc.nextLine();
                String s2 = sc.nextLine();

                System.out.println(getMaxString(s1, s2));
                break;
        }
    }

    private static int getMaxInt(int n1, int n2) {
        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }

    private static char getMaxChar(char ch1, char ch2) {
        char character1 = ch1;
        char character2 = ch2;
        int ascii = character1;
        int ascii1 = character2;

        if (ascii > ascii1) {
            return character1;
        } else {
            return  character2;
        }
    }

    private static String getMaxString(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return s1;
        } else {
            return s2;
        }
    }
}
