package com.company;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Hot_Potato {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] childSplit = input.split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());

        Deque<String> queue = new ArrayDeque<>(Arrays.asList(childSplit));

        int currRound = 1;
        while (queue.size() > 1) {
            String currChild = queue.poll();

            if (currRound % n != 0) {
                queue.offer(currChild);
            } else {
                System.out.println("Removed " + currChild);
            }

            currRound++;
        }

        System.out.println("Last is " + queue.poll());

    }
}
