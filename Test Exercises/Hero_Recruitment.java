package com.company;

import java.util.*;

public class Hero_Recruitment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> spellBook = new TreeMap<>();

        String command;
        while (!"End".equals(command = scanner.nextLine())) {
            String[] tokens = command.split("\\s+");
            String heroName = tokens[1];
            switch (tokens[0]) {
                case "Enroll":
                    if (!spellBook.containsKey(heroName)) {
                        spellBook.put(heroName, new ArrayList<>());
                    } else {
                        System.out.printf("%s is already enrolled.%n", heroName);
                    }
                    break;
                case "Learn":
                    String learnSpellName = tokens[2];
                    if (!spellBook.containsKey(heroName)) {
                        System.out.printf("%s doesn't exist.%n", heroName);
                    } else {
                        if (spellBook.get(heroName).contains(learnSpellName)) {
                            System.out.printf("%s has already learnt %s.%n", heroName, learnSpellName);
                        } else {
                            spellBook.get(heroName).add(learnSpellName);
                        }
                    }
                    break;
                case "Unlearn":
                    String unlearnSpellName = tokens[2];
                    if (!spellBook.containsKey(heroName)) {
                        System.out.printf("%s doesn't exist.%n", heroName);
                    } else {
                        if (!spellBook.get(heroName).contains(unlearnSpellName)) {
                            System.out.printf("%s doesn't know %s.%n", heroName, unlearnSpellName);
                        } else {
                            spellBook.get(heroName).remove(unlearnSpellName); //!!!!!!!!
                        }
                    }
                    break;
            }
        }
        System.out.println("Heroes:");
        spellBook.entrySet()
                .stream()
                .sorted((a, b) -> b.getValue().size() - a.getValue().size())
                .forEach(entry -> {
                    System.out.printf("== %s: ", entry.getKey());
                    System.out.printf(String.join(", ", entry.getValue()));
                    System.out.println();
                });
    }
}
