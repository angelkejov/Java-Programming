package com.company;

import java.util.Scanner;

public class RepeatString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int times = Integer.parseInt(sc.nextLine());
        System.out.println(repeatStringNTimes(s, times));
    }

    private static String repeatStringNTimes(String s, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result = result.concat(s);
        }

        return result;
    }
}
