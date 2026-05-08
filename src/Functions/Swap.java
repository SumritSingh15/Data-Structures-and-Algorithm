package Functions;


import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("enter first number:");
int a = in.nextInt();
        System.out.print("enter second number:");
int b = in.nextInt();
       Swap(a,b);
        System.out.println(a +" "+ b);
        }

        static void Swap(int a ,int b){
            int temp = a;
            a = b;
            b = temp;
        }
}
