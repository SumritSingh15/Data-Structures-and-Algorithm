package Strings;

public class EqualStringarray {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        Boolean ans = arrayStringsAreEqual(word1,word2);
        System.out.println(ans);
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        int i = 0, j = 0; // word array index
        int p1 = 0, p2 = 0; // character index inside current word

        while (i < word1.length && j < word2.length) {

            if (word1[i].charAt(p1) != word2[j].charAt(p2)) {
                return false;
            }

            p1++;
            p2++;

            // Current word1 finish ho gaya
            if (p1 == word1[i].length()) {
                i++;
                p1 = 0;
            }

            // Current word2 finish ho gaya
            if (p2 == word2[j].length()) {
                j++;
                p2 = 0;
            }
        }

        return i == word1.length && j == word2.length;
    }
}
