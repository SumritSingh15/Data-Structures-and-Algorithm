package Sorting;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int [] arr = {3,6,2,1,8,7,4,5,3,1};
        int [] ans = sort(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] sort(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
