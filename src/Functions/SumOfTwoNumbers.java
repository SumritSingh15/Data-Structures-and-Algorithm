package Functions;

import java.util.Scanner;


public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter first number :");
        int alpha = in.nextInt();
        System.out.print("enter second number :");
        int beeta = in.nextInt();
         int answer = sumoftwo(alpha,beeta);
        System.out.println(answer);
     
    }
static int sumoftwo(int a,int b){
      int c = a+b;
        return c;

}
}
