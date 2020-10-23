package com.company;

import java.util.Scanner;

public class chars_to_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char c = sc.next().charAt(0);
        char c1 = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);

        String s = String.valueOf(c);
        String s1 = String.valueOf(c1);
        String s2 = String.valueOf(c2);

        System.out.println(s + s1 + s2);
    }
}