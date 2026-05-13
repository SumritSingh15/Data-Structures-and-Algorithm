package Searching;

import java.util.Arrays;
import java.util.HashSet;

public class FairCandySwap {
    public static void main(String[] args) {
        int [] aliceSizes = {1,1};
        int [] bobSizes = {2,2};
int[] ans = Swap(aliceSizes,bobSizes);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] Swap(int []aliceSizes,int[]bobSizes){
        int sumA =0;
        int sumB= 0;
        for(int num : aliceSizes){
            sumA+= num;
        }
        for(int num : bobSizes){
            sumB+= num;
        }
        int diff = (sumB - sumA)/2;

        HashSet <Integer> set= new HashSet<>();
        for(int num : bobSizes){
            set.add(num);
        }
        for(int num : aliceSizes){
           if( set.contains(num+diff)){
               return new int[] {num,num+diff};
           }
        }
        return new int []{};
    }
}
