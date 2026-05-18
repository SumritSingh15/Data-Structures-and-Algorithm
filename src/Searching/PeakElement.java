package Searching;

public class PeakElement {
    public static void main(String[] args) {
            int [] nums = {1,2,3,1};
            int ans = findPeakElement(nums);
        System.out.println(ans);
    }
    public static int findPeakElement(int[] nums) {
        int low = 0, high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[mid + 1]) {
                // peak is on left side (including mid)
                high = mid;
            } else {
                // peak is on right side
                low = mid + 1;
            }
        }

        return low; // or high, both are same here
    }
}
