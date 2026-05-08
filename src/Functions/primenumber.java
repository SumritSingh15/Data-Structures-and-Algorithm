package Functions;

import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number:");
        int a = in.nextInt();
         CheckPrime(a);



    }
    static void CheckPrime(int a){
        if(a%2==0){
            System.out.println(a + " "+ "Is Not A Prime Number");
        }
        else{
            System.out.println( a + " "+ "Is A Prime Number");
        }

    }
}
