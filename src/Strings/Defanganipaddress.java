package Strings;

public class Defanganipaddress {
    public static void main(String[] args) {
        String address = "1.1.1.1";

        String result = ip(address);
        System.out.println(result);
    }

    public static String ip(String address) {
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                ans.append("[.]");
            } else {
                ans.append(address.charAt(i));
            }
        }

        return ans.toString();
    }
}