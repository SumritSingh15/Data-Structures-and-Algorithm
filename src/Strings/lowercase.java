package Strings;

public class lowercase {
    public static void main(String[] args) {
        String s = "Hello";
        String ans = toLowerCase(s);
        System.out.println(ans);
    }
    public static String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< s.length();i++){
            char ch = s.charAt(i);
            if(ch >= 'A'&& ch <='Z'){
                ch = (char) (ch+32);
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}
