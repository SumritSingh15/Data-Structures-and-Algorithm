package ARRAY;

import java.util.Arrays;
import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        Input In Array

//        int [] arr = new int[5];   before (=) that is known as decalartion after (=) that is known as initialization;
//        for (int i = 0; i< arr.length;i++){
//            arr[i] = in.nextInt();
//        }
//        for(int num : arr){
//            System.out.print(num + "");
//        }
//        System.out.print(Arrays.toString(arr));


//        Passing Functions In Array

        int [] nums = {2,3,4,5,6,7};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void change(int [] nums){
        nums[0] = 99;
    }
}
