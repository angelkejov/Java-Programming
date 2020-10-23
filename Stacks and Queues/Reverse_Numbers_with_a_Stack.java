package com.company;

import java.util.*;


public class Reverse_Numbers_with_a_Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < input.length; i++) {
            stack.push(Integer.parseInt(input[i]));
        }

        Collections.reverse(stack);

        for (Integer integer : stack) {
            System.out.print(integer + " ");
        }
    }
}
