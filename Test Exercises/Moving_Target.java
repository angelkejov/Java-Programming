package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Moving_Target {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbersInput = new ArrayList<>();
        for (String s : scanner.nextLine()
                .split("\\s+")) {
            Integer integer = Integer.valueOf(s);
            numbersInput.add(integer);
        }

        String commands;

        while (true) {
            commands = scanner.nextLine();
            if (commands.equals("End")) {
                break;
            }

            String[] tokens = commands.split("\\s+");

//            52 74 23 44 96 110
//            Shoot 5 10
//            Shoot 1 80
//            End

            switch (tokens[0]) {
                case "Shoot":

                    int index = Integer.parseInt(tokens[1]);
                    int power = Integer.parseInt(tokens[2]);

                    if (index > numbersInput.size() && index < numbersInput.get(0)) {
                        System.out.println("Invalid placement!");
                    } else {
                        int n = numbersInput.get(index);
                        int newpoint = n - power;

//                        numbersInput.add(newpoint);

                        if (newpoint <= 0) {
                            numbersInput.remove(index);
                        } else {
                            numbersInput.add(newpoint);
                            numbersInput.remove(index);
                        }

                    }

                    break;

                case "Add":
                    int indx = Integer.parseInt(tokens[1]);
                    int value = Integer.parseInt(tokens[2]);

                    if (indx > numbersInput.size() && indx < numbersInput.get(0)) {
                        System.out.println("Invalid placement!");
                    } else {
                        numbersInput.add(indx, value);
                    }
                    break;

                case "Strike":
                    int i = Integer.parseInt(tokens[1]);
                    int radius = Integer.parseInt(tokens[2]);

                    int start = i - radius;
                    int end = i + radius;


                    if((i-radius>=0)&&(i+radius < numbersInput.size()))
                    {
                        for (int j = 1; j <= radius; j++)
                        {
                            numbersInput.remove(i-1);
                            numbersInput.remove(i);
                            i--;
                        }
                        numbersInput.remove(i);
                    }
                    else
                    {
                        System.out.println("Strike missed!");
                    }
                    }
                    break;

        }

        for (Integer integer : numbersInput) {
            System.out.println(integer + "|");
        }

    }
    
}
