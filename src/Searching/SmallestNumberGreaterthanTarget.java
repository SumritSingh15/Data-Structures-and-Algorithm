package Searching;

public class SmallestNumberGreaterthanTarget {
    public static void main(String[] args) {
             char[] arr = {'c','f','j'};
             char target = 'a';
             char ans = NextGreatestletter(arr,target);
        System.out.println(ans);
    }
    public static char NextGreatestletter(char []arr,char target){
        int start = 0;
        int end = arr.length-1;
        while(start<= end){
            int mid = start + (end- start)/2;
            if(arr[mid]< target){
                start = mid+1;
            } else {
                end = mid-1;
            }


        }
        return arr[start % arr.length];
    }
}
