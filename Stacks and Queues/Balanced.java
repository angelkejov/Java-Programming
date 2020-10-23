package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Balanced {
    static boolean areParanthesisBalanced(String expr)
    {
        // Using ArrayDeque is faster than using Stack class
        Deque<Character> stack = new ArrayDeque<Character>();

        // Traversing the Expression
        for (int i = 0; i < expr.length(); i++) {
            char x = expr.charAt(i);

            if (x == '(' || x == '[' || x == '{') {
                // Push the element in the stack
                stack.push(x);
                continue;
            }

            // IF current current character is not opening
            // bracket, then it must be closing. So stack
            // cannot be empty at this point.
            if (stack.isEmpty())
                return false;

            switch (x) {
                case ')':
                    stack.pop();
                    if (x == '{' || x == '[')
                        return false;
                    break;

                case '}':
                    stack.pop();
                    if (x == '(' || x == '[')
                        return false;
                    break;

                case ']':
                    stack.pop();
                    if (x == '(' || x == '{')
                        return false;
                    break;
            }
        }

        // Check Empty Stack
        return (stack.isEmpty());
    }

    /*driver program to test above functions*/
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String expr = scanner.nextLine();
        if (areParanthesisBalanced(expr))
            System.out.println("YES ");
        else
            System.out.println("NO");
    }
}
