package Functions;

import java.util.Scanner;

public class AgeCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("enter the number");
        int a = in.nextInt();
        checkage(a);
    }
    static void checkage(int a){
        if(a>=18){
            System.out.println("you are eligible for voting");
        }
        else{
            System.out.println("you are not eligible for voting");
        }
    }
}
