package Functions;

import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Name :");
        String name = in.next();
        String message = greet(name);
        System.out.println(message);



    }

    static String greet(String name){
        String message = "hello" + " " + name;
        return message;


    }
}
