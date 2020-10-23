package com.company;

import java.util.Scanner;

public class reversed_chars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char c = scanner.next().charAt(0);
        char c1 = scanner.next().charAt(0);
        char c2 = scanner.next().charAt(0);

        String s = String.valueOf(c);
        String s1 = String.valueOf(c1);
        String s2 = String.valueOf(c2);

        String result = s + s1 + s2;
        String reversedResult = reverseString(result);

        System.out.println(reversedResult);
    }
    public static String reverseString(String str){
        char ch[]=str.toCharArray();
        String rev="";
        for(int i=ch.length-1;i>=0;i--){
            rev+=ch[i];
        }
        return rev;
    }
}
