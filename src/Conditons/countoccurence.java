package Conditons;

import java.util.Scanner;

public class countoccurence {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int rem;
        int count = 0;
        while(n>0){
            rem = n%10;
            if(rem == 9){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);


    }
}
