package leetcode.easy;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String new_s = s.replaceAll("[^a-zA-Z0-9]", "");
        String reversedString = new StringBuilder(new_s).reverse().toString();
        return new_s.toLowerCase().equals(reversedString.toLowerCase());
    }
}
