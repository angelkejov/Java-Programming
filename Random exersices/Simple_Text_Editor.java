package com.company;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.*;

public class Simple_Text_Editor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String input;
        Deque queue = new ArrayDeque();
        for (int i = 0; i < n; i++) {
            input = scanner.nextLine();
            String[] tokens = input.split("\\s+");

            switch (tokens[0]) {
                case "1":
                    String textToAppend = tokens[1];
                    queue.add(textToAppend);
                    System.out.println(queue);
                    break;

                case "2":
                    int countToErase = Integer.parseInt(tokens[1]);
//                    queue = queue.(0,input.length() - countToErase);
            }
        }
        for (Object o : queue) {
            System.out.print(o);
        }
    }
}
