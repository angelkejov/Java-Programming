package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Emoji_Detector {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("([*:]{2})(?<name>[A-Za-z]{3,})\\1");

        String input = scanner.nextLine();

        List<String> emojis = new ArrayList<>();
        List<Integer> digits = new ArrayList<>();
        List<String> notCoolt = new ArrayList<>();
        int count = 0;

        Matcher matcher = pattern.matcher(input);


        for (int i = 0; i < input.length(); i++) {
            char check = input.charAt(i);
            if (Character.isDigit(check)) {
                int digit = Integer.parseInt(String.valueOf(check));
                digits.add(digit);
            }
        }
        long sum = 1;
        for (Integer integer : digits) {
            sum *= integer;
        }

        int asciiSum = 0;
        while(matcher.find()) {
            String name = matcher.group("name");

            emojis.add(name);
                for (String emoji : emojis) {
                    for (int i = 1; i < emoji.length(); i++) {
                        asciiSum += (int) emoji.charAt(i);
                    }

                    if (asciiSum < sum) {
                        notCoolt.add(name);
                    } else {
                        count++;
                    }
            }

            if (count == 0) System.out.println("");
        }

        System.out.println("Cool threshold: " + sum);

        System.out.printf("%d emojis found in the text.%nThe cool ones are:%n", count);
            for (String emoji : emojis) {
                System.out.println(emoji);
            }

    }

}
