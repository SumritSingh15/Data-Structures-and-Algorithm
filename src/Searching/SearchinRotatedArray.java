package Searching;

public class SearchinRotatedArray {

    public static void main(String[] args) {

        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;

        int ans = search(nums, target);

        System.out.println("Target found at index: " + ans);
    }

    public static int search(int[] nums, int target) {

        int pivot = findPivot(nums);

        // if array is not rotated
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // if pivot itself is target
        if (nums[pivot] == target) {
            return pivot;
        }

        // search in left half
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        // search in right half
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    // Find highest element index
    public static int findPivot(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // case 1
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }

            // case 2
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            // left side sorted
            if (nums[start] <= nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    // Normal Binary Search
    public static int binarySearch(int[] nums, int target, int start, int end) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}