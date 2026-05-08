package Searching;

import java.util.Scanner;

public class Guess_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number");
        int pick = input.nextInt();
        int ans = Guessnumber(pick);
        System.out.println(ans);
    }

    static int Guessnumber( int num){
        int start = 0;
        int end = num;
        while(start<= end){
            int mid = start + (end-start)/2;
            if(mid == num){
                return mid;
            }else if(mid < num){
                start = mid +1;
            }else{
                end = mid -1;
            }
        }
        return -1;
    }
}
