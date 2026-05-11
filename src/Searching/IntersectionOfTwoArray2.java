package Searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class IntersectionOfTwoArray2 {
    public static void main(String[] args) {
        int [] nums1 = {1,2,2,1};
        int [] nums2 = {2,2};
        int[] ans = intersect(nums1,nums2);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm = new HashMap();
        for(int i= 0;i<nums1.length;i++){
            if(hm.containsKey(nums1[i])){
                hm.put(nums1[i],hm.get(nums1[i])+1);
            }else{
                hm.put(nums1[i],1);
            }
        }
        // HashMap<Integer,Integer> hm1 = new HashMap();
        ArrayList<Integer> ansList = new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            if(hm.containsKey(nums2[i])){
                ansList.add(nums2[i]);
                if(hm.get(nums2[i])==1) hm.remove(nums2[i]);
                else hm.put(nums2[i],hm.get(nums2[i])-1);
            }
        }
        // Collections.sort(ansList);
        int[] ans = new int[ansList.size()];
        for(int i=0; i<ansList.size();i++){
            ans[i] = ansList.get(i);
        }
        return ans;
    }
}
