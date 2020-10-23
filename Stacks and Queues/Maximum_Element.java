package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;


public class Maximum_Element {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCommands = Integer.parseInt(scanner.nextLine());
        TrackMaxInStack stack = new TrackMaxInStack();
        String input;

        for (int i = 0; i < numberOfCommands; i++) {
            input = scanner.nextLine();
            String[] tokens = input.split("\\s+");

            switch (tokens[0]) {
                case "1":
                    int numberToPushInStack = Integer.parseInt(tokens[1]);
                    stack.insert(numberToPushInStack);
                    break;

                case "2":
                    stack.remove();
                    break;

                case "3":
                    System.out.println(stack.getMax());
                    break;
            }
        }
    }

    public static class TrackMaxInStack {

        Stack<Integer> main = new Stack<>();
        Stack<Integer> track = new Stack<>();

        public void insert(int x) {
            if (main.isEmpty()) {
                main.add(x);
                track.add(x);
            } else {

                int a = track.peek();
                track.add(Math.max(a, x));
                main.add(x);
            }
        }

        public int remove() {
            if (!main.isEmpty()) {
                track.pop();
                return main.pop();
            }
            return 0;
        }

        public int getMax() {
            return track.peek();
        }
    }

}
