package Switch;

import java.util.Scanner;

public class switchcases {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        switch (fruit) {
            case "orange":
                System.out.println("orange");
                break;
            case "mango":
                System.out.println("mango");
                break;
            case "apple":
                System.out.println("apple");
                break;
            case "banana":
                System.out.println("banana");
                break;
            default:
                System.out.println("invalid fruit");
                break;
        }
    }
}
