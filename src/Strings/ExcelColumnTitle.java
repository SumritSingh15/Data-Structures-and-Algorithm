package Strings;

public class ExcelColumnTitle {
    public static void main(String[] args) {
int columnNumber = 82;
String ans = convertToTitle(columnNumber);
        System.out.println(ans);
    }
    public static String convertToTitle(int columnNumber) {
        StringBuilder ans = new StringBuilder();

        while(columnNumber>0){
            columnNumber--;
            char ch = (char) ('A' +(columnNumber % 26));
            ans.append(ch);
            columnNumber/=26;
        }
        return ans.reverse().toString();
    }
}
