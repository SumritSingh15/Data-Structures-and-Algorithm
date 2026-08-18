package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {3,6,2,1,8,7,4,5,3,1};
        int [] ans = sort(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int maxindex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[maxindex]) {
                    maxindex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[maxindex];
            arr[maxindex] = temp;
        }

        return arr;
    }
}
