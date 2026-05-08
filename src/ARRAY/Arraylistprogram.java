package ARRAY;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylistprogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        ArrayList<Integer> list = new ArrayList<Integer>(10);
//        list.add(45);
//        list.add(35);
//        list.add(78);
//        list.add(57);
//        System.out.println(list);

        // there are few in-built functions that we can use
//        .add,.remove,.contains,.set etc...


//        MultiDimensionArrayList

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
    }
}
