package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int numberOfRotations = Integer.parseInt(sc.nextLine());

        String output;
    }

    public static void leftRotate(int arr[], int d, int n)
    {
        // create temp array of size d
        int temp[] = new int[d];

        // copy first d element in array temp
        for (int i = 0; i < d; i++)
            temp[i] = arr[i];

        // move the rest element to index
        // zero to N-d
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        // copy the temp array element
        // in origninal array
        for (int i = 0; i < d; i++) {
            arr[i + n - d] = temp[i];
        }
    }

    void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
