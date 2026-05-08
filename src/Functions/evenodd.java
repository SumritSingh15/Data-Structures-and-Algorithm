package Functions;

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number");
        int a = in.nextInt();
              eveodd(a);
    }
    static void eveodd(int a ){
        if(a%2==0){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }

    }

}
