package Strings;

public class GoalParser {
    public static void main(String[] args) {
        String s = "G()()(al)";
        String ab = Parser(s);
        System.out.println(ab);

    }
    public static String Parser(String s){
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='G'){
                ans.append(s.charAt(i));

            } else if (s.charAt(i) == '(' && s.charAt(i+1) == ')') {
                ans.append("o");
                i++;
            }else {
                ans.append("al");
                i+=3;
            }
        }
        return ans.toString();
    }
}
