package Searching;

public class findminimuminsocrtedarray {
    public static void main(String[] args) {
        int [] nums ={3,4,5,1,2};
        int ans  = findMin(nums);
        System.out.println(ans);
    }
    public static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while(start < end){

            int mid = start + (end - start)/2;

            // minimum right side me
            if(nums[mid] > nums[end]){

                start = mid + 1;
            }

            // minimum left side me
            else{

                end = mid;
            }
        }
// bcz start returns the minimum
        return nums[start];
    }
}
