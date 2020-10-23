package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Printer_Queue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fileNames;
        Deque<String> queue = new ArrayDeque<>();

        while (true) {
            fileNames = scanner.nextLine();
            queue.offer(fileNames);

            if (fileNames.equals("print")) {
                break;
            }

            if (fileNames.equals("cancel")) {
                System.out.println("Canceled " + queue.pollFirst());
            } else if (queue.isEmpty()) {
                System.out.println("Printer is on standby");
            }
        }
    }

}
