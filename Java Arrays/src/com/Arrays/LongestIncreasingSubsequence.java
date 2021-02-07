package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LongestIncreasingSubsequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] input = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int n = input.length;
        System.out.println(lis(input, n));
    }

    static int max_ref;
    static int _lis(int arr[], int n)
    {
        if (n == 1)
            return 1;

        int res, max_ending_here = 1;

        for (int i = 1; i < n; i++)
        {
            res = _lis(arr, i);
            if (arr[i-1] < arr[n-1] && res + 1 > max_ending_here)
                max_ending_here = res + 1;
        }

        if (max_ref < max_ending_here)
            max_ref = max_ending_here;

        return max_ending_here;
    }

    static int lis(int arr[], int n)
    {
        max_ref = 1;

        _lis( arr, n);

        return max_ref;
    }
}
