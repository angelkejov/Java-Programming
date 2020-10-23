package com.company;

import java.util.Scanner;

public class Activation_Key {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rawKey = scanner.nextLine();
        String commands;

        System.out.println(rawKey);
        while (true) {
            commands = scanner.nextLine();

            if (commands.equals("Generate")) {
                break;
            }

            String[] tokens = commands.split(">>>");
            switch (tokens[0]) {
                case "Contains":
                    boolean isContains = false;
                    String substring = tokens[1];

                    if (rawKey.contains(substring)) {
                        isContains = true;
                    }

                    if (isContains) {
                        System.out.printf("%s contains %s", rawKey, substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;

                case "Flip":
                    String upperLower = tokens[1];
                    int startIndex = Integer.parseInt(tokens[2]);
                    int endIndex = Integer.parseInt(tokens[3]);
                    String toChanges = rawKey.substring(startIndex, endIndex);
                    if (upperLower.equals("Upper")) {
                        toChanges=toChanges.toUpperCase();
                        StringBuilder sb = new StringBuilder();
                        sb.append(rawKey);
                        sb.replace(startIndex, endIndex, (toChanges));
                        rawKey = sb.toString();
                    } else {
                        toChanges=toChanges.toLowerCase();
                        StringBuilder sb = new StringBuilder();
                        sb.append(rawKey);
                        sb.replace(startIndex, endIndex, (toChanges));
                        rawKey = sb.toString();

                    }
                    System.out.println(rawKey);
                    break;

                case "Slice":

                    int start = Integer.parseInt(tokens[1]);
                    int end = Integer.parseInt(tokens[2]);

                    String stringToReplace = rawKey.substring(start, end);

                    rawKey = rawKey.replace(stringToReplace, "");
                    break;
            }

        }

        System.out.printf("Your activation key is: %s", rawKey);
    }
}
