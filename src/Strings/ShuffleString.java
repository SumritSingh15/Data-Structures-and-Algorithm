package Strings;

public class ShuffleString {
    public static void main(String[] args) {
         String s = "codeleet";
         int [] indices = {4,5,6,7,0,2,1,3};
         String ab = Shuffle(s,indices);
        System.out.println(ab);

    }
    public static String Shuffle(String s,int [] indices){
        char [] ans = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ans[indices[i]] = s.charAt(i);
        }
        return new String(ans);
    }
}
