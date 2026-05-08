package ARRAY;

public class MaximumValue {
    public static void main(String[] args) {
        int[] arr = {3,6,86,12,34};
        int biggest = arr[0];
    int ans =  max(arr,biggest);
        System.out.println(ans);
    }
    static int max(int[] arr,int biggest){

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]> biggest){
                biggest = arr[i];
            }

        }
        return biggest;
    }
}
