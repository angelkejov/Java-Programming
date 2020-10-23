package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Boss_Rush {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("\\|(?<bossName>[A-Z]{4,})\\|:#(?<title>[A-Za-z]+ [A-Za-z]+)#");

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                System.out.println();
                String bossName = matcher.group("bossName");
                String title = matcher.group("title");

                System.out.printf("%s, The %s%n", bossName, title);
                System.out.printf(">> Strength: %d%n>> Armour: %d", bossName.length(), title.length());

            } else {
                System.out.println();
                System.out.print("Access denied!");
            }
        }
    }
}
