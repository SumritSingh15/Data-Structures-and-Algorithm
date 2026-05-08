package Functions;

import java.util.Scanner;

public class maxnumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First number:");
        int a = in.nextInt();
        System.out.print("Enter Second number:");
        int b = in.nextInt();
        System.out.print("Enter Third number:");
        int c = in.nextInt();
        int ans = maximum(a,b,c);
        System.out.println(ans);
    }
    static int maximum(int a,int b,int c){
        int max = 0;
        if(a> max){
            max = a;
        }if(b> max){
            max = b;
        }if(c> max){
            max = c;
        }
        return max;
    }
}
