package com.company;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Message_Translator {

//    The command is surrounded by '!', start with a uppercase letter, followed only by lowercase letters.
//    The command Is mininum 3 characters long
//    There is a colon after the command.
//    There is message consisting of alphabetical letters between '[' and ']'.
//    It has to be minimum 8 characters long.


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        Map<String, List<Integer>> encryptMessage = new LinkedHashMap<>();

        String regex = "\\!([A-Z][a-z]{2,})\\!\\:\\[([a-zA-z]{8,})\\]";
        // "\!([A-Z][a-z]{2,})\!\:\[([a-zA-z]{8,})\]"

        Pattern pattern = Pattern.compile(regex);

        for (int i = 1; i <= number; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {
                String command = matcher.group(1);
                String message = (matcher.group(2));


                StringBuilder sb = new StringBuilder();
                char[] letters = message.toCharArray();
                for (char ch : letters) {
                    sb.append((int) ch);
                }

                encryptMessage.put(command, new ArrayList<>());
                if (encryptMessage.containsKey(command)) {
                    encryptMessage.get(sb.toString());

                    //encryptMessage.put(command, sb.toString());


                }
                input = scanner.nextLine();
            }
            System.out.println("The message is invalid");


        }
        for (Map.Entry<String, List<Integer>> stringListEntry : encryptMessage.entrySet()) {
            System.out.printf("%s: ", stringListEntry.getKey());
        }
    }
}
