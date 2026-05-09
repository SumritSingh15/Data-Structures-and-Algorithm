package Searching;

import java.util.Scanner;

public class arrangeCoins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();
        int ans = coins(number);
        System.out.println(ans);
    }
    public static int coins(int number){
        long left = 0;
        long right = number;
        while(left<=right){
            long mid = left + (right-left)/2;
            long coin = mid*(mid+1)/2;
            if(coin == number) return (int) mid;
            else if(coin < number) {left = mid+1;}
            else{
                right = mid-1;
            }
        }
        return (int) right;

    }

}
