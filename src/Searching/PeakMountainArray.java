package Searching;

public class PeakMountainArray {
    public static void main(String[] args) {
                int [] arr = {0,2,1,0};
                int ans = peakindex(arr);
        System.out.println(ans);
    }
    public static int peakindex(int [] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return start;
    }
}
