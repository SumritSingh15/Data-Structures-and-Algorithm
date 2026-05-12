package Searching;

public class SpecialArray {
    public static void main(String[] args) {
        int [] nums = {0,4,3,0,4};
        int ans = specialArray(nums);
        System.out.println(ans);
    }
    public  static int specialArray(int[] nums) {
        int n = nums.length;

        for (int x = 0; x <= n; x++) {

            int count = 0;

            for (int num : nums) {

                if (num >= x) {
                    count++;
                }
            }

            if (count == x) {
                return x;
            }
        }

        return -1;
    }
}
