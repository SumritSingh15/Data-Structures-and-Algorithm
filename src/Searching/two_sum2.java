package Searching;

import java.util.Arrays;

public class two_sum2 {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        int[] result = twosum(arr, target);
        System.out.println(Arrays.toString(result));
    }

    static int[] twosum(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int sum = arr[start] + arr[end];

            if (sum == target) {
                return new int[]{start + 1, end + 1}; // 1-based index
            } else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }
        return new int[]{-1, -1};
    }
}