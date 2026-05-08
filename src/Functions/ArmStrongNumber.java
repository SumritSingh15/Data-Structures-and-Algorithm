package Functions;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The Number");
        int a = in.nextInt();
        System.out.println(CheckArmstrong(a));


    }
    static boolean CheckArmstrong(int a){
        int origin = a;
        int sum = 0;
         while(a>0){
             int rem = a%10;

           sum = sum + rem*rem*rem;
             a =a/10;
         }

        return sum == origin;
    }


}
