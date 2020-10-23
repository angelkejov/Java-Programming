package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;

public class Simple_Text_Editor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = "";
        int numInputLines = scanner.nextInt();
        int countToErase;
        int indexToReturn;
        byte lastOperationType ;
        for (int i = 0; i < numInputLines; i++) {
            String[] command = scanner.nextLine().split(" ");
            switch (command[0]) {
                case "1":
                    text.concat(command[1]);
                    System.out.println(text);
                    break;
                case "2":
                    countToErase = Integer.parseInt(command[1]);
                    text = text.substring(0,text.length() - countToErase);
                    System.out.println(text);
                    break;
            }
        }
    }
}
