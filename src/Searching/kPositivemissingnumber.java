package Searching;

import java.util.Scanner;

public class kPositivemissingnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {2,3,4,7,11};
        int k =5;
        int ans = missingnumber(arr,k);
        System.out.println(ans);
    }
    public static int missingnumber(int[] arr,int k){
                        int start = 0;
                        int end = arr.length-1;
                        while(start<=end){
                            int mid = start + (end-start)/2;
                            int missing = arr[mid] - (mid + 1);
                            if(missing<k){
                                start = mid+1;
                            }else{
                                end = mid-1;
                            }
                        }
                        return start + k;
    }
}
