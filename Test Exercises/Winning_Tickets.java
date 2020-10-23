package com.company;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Winning_Tickets {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern regex = Pattern.compile("\\w*(?<winningSymbols>[$@#^]{6})\\w*");
        Pattern jackpotPattern = Pattern.compile("[@^$#]+");

        List<String> tickets = Arrays
                .stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        Map<String, Integer> winningTickets = new HashMap<>();
        String winningSymbols = "";

        for (String ticket : tickets) {
            Matcher matcher = regex.matcher(ticket);
            Matcher matcher1 = jackpotPattern.matcher(ticket);


            if (matcher.find()) {
                 winningSymbols = matcher.group("winningSymbols");

                char winSymbol = winningSymbols.charAt(0);

                winningTickets.put(ticket, winningSymbols.length());

                if (matcher1.find()) {
                    System.out.printf("ticket '%s' - %d%c%n", ticket, ticket.length(), winSymbol);
                }

            } else {
                System.out.println("invalid ticket");
            }

            winningTickets.put(ticket, ticket.length());


        }

    }
}
