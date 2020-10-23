package com.company;

import java.util.Scanner;

public class Nikuldes_Charity {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String commands;
        String result = "";


        while(true) {
            commands = scanner.nextLine();

            if (commands.equals("Finish")) {
                break;
            }

            String[] tokens = commands.split("\\s+");

            switch (tokens[0]) {

                case "Replace":

                    String currAsString = tokens[1];
                    char curr = currAsString.charAt(0);


                    String newcharAsString = tokens[2];
                    char newChar = newcharAsString.charAt(0);


                     input = replaceMethod(input, curr, newChar);

                    System.out.println(input);
                    break;

                case "Cut":

                    int startIndex = Integer.parseInt(tokens[1]);
                    int endIndex = Integer.parseInt(tokens[2]);

                    input = cutMethod(input, startIndex, endIndex + 1);

                    if (startIndex >= 0 && endIndex > startIndex && endIndex < input.length()) {
                        System.out.println(input);
                    } else {
                        System.out.println("Invalid indexes!");
                    }

                    break;

                case "Make":

                    String upperOrLower = tokens[1];

                    if (upperOrLower.equals("Upper")) {
                        input = input.toUpperCase();
                    } else if (upperOrLower.equals("Lower")) {
                        input = input.toLowerCase();
                    }

                    System.out.println(input);
                    break;

                case "Check":

                    String checkMessage = tokens[1];
                    boolean isContains = false;

                    if (input.contains(checkMessage)) {
                        isContains = true;
                    }

                    if (isContains) {
                        System.out.printf("Message contains %s%n", checkMessage);
                    } else {
                        System.out.printf("Message doesn't contain %s%n", checkMessage);
                    }

                    break;

                case "Sum":

                    int beginIndex = Integer.parseInt(tokens[1]);
                    int breakIndex = Integer.parseInt(tokens[2]);

                    int res =  getASCIIValue(input, beginIndex, breakIndex);

                    System.out.println(res);
                    break;

            }
        }

    }

    public static String replaceMethod(String input, char curr, char newchar) {
        return input.replace(curr, newchar);
    }

    public static String cutMethod(String input, int startIndex, int endIndex) {
        String result = input.substring(startIndex, endIndex);
        String finalRes = null;

        if (startIndex >= 0 && endIndex > startIndex && endIndex < input.length()) {
            finalRes = input.replace(result, "");
        }

        return finalRes;
    }

    public static int getASCIIValue(String input, int startIndex, int endIndex) {
        String useSubstring = input.substring(startIndex, endIndex + 1);
        int asciiSum = 0;

        for (int i = 0; i < useSubstring.length(); i++) {
            asciiSum += (int)useSubstring.charAt(i);
        }

        return asciiSum;
    }

}
