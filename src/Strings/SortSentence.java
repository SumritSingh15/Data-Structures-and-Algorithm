package Strings;

public class SortSentence {
    public static void main(String[] args) {
        String s =  "is2 sentence4 This1 a3";
String ans = Sort(s);
        System.out.println(ans);
    }
    public static String Sort(String s){
        String [] words = s.split(" ");
        String [] ans = new String[words.length];
        for(String word : words){
            int index = word.charAt(word.length()-1)-'0';
            ans[index-1] = word.substring(0,word.length()-1);
        }
        return String.join(" ",ans);
    }
}
