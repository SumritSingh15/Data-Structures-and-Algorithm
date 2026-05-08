package Functions;

import java.util.Scanner;

public class productoftwonumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter first number:");
        int a = in.nextInt();
        System.out.print("enter second number:");
        int b = in.nextInt();
        int ans = product(a,b);
        System.out.println(ans);
    }
    static int product(int a ,int b){
        int result = a*b;
        return result;
    }

}
