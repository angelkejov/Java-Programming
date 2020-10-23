package com.company;

import java.util.Scanner;

public class Warriors_Quest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String command;

        while (!"For Azeroth".equals(command = scanner.nextLine())) {
            String[] tokens = command.split("\\s+");

            if ("GladiatorStance".equals(tokens[0])) {
                input = input.toUpperCase();
                System.out.println(input);
            } else if ("DefensiveStance".equals(tokens[0])) {
                input = input.toLowerCase();
                System.out.println(input);
            } else if ("Dispel".equals(tokens[0])) {
                int index = Integer.parseInt(tokens[1]);
                if (index >= 0 && index < input.length()) {
                    String letterToReplace = input.charAt(index) + "";
                    String replacementLetter = tokens[2].charAt(0) + "";
                    input = input.replace(letterToReplace, replacementLetter);
                    System.out.println("Success!");
                } else {
                    System.out.println("Dispel too weak.");
                }
            } else if ("Target".equals(tokens[0]) && "Change".equals(tokens[1])) {
                String firstSubstring = tokens[2];
                String secondSubstring = tokens[3];
                if (input.contains(firstSubstring)) {
                    input = input.replace(firstSubstring, secondSubstring);
                    System.out.println(input);
                } else {
                    break;
                }
            } else if ("Target".equals(tokens[0]) && "Remove".equals(tokens[1])) {
                StringBuilder builder = new StringBuilder(input);
                String target = tokens[2];

                if (input.contains(target)) {
                    int startIndex = input.indexOf(target);
                    int stopIndex = startIndex + target.length();

                    builder.delete(startIndex, stopIndex);
                    input = "" + builder;

                    System.out.println(input);
                } else {
                    break;
                }
            } else {
                System.out.println("Command doesn't exist!");
            }
        }
    }
}
