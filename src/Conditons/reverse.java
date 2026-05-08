package Conditons;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
          int n = in.nextInt();
          int rem;
          int a =0;
          while(n>0){
              rem = n%10;
             a = a * 10 + rem;
              n = n/10;
          }
        System.out.println(a);
    }
}
