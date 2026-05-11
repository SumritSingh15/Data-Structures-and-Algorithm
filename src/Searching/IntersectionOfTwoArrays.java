package Searching;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 2, 4, 5};
// is question me maine socha tha ki  arraylist bnaunga or do for loop ka use krke iterate krunga or check lagaunga but uske bajay hum HashSet ka use kra kyuki vo direct value pe jump krta hai or time complexity kam krta hai
        int[] ans = intersection(arr1, arr2);

        System.out.println(Arrays.toString(ans));
    }
    public static int[] intersection(int[] arr1, int[] arr2) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();

        // first array elements
        for (int num : arr1) {
            set1.add(num);
        }

        // common elements
        for (int num : arr2) {
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }

        // HashSet -> int[]
        int[] result = new int[intersection.size()];

        int index = 0;

        for (int num : intersection) {
            result[index] = num;
            index++;
        }

        return result;
    }
}
