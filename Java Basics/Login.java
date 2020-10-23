package com.company;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String reversed = reverseString(username);
        String input = "";
        int counter = 0;

        while (true) {
            input = scanner.nextLine();

            if (input.equals(reversed)) {
                System.out.println("Welcome!");
                break;
            } else {
                System.out.println("Error. Try again!");
                counter++;
            }

            if (counter == 3) {
                System.out.println(username + " is blocked!");
                break;
            }
        }


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
