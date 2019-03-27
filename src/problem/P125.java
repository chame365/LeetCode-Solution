package problem;

import java.util.ArrayList;
import java.util.List;

public class P125 {
    public static void main(String[] args) {
        new P125().isPalindrome("\"A man\n" +
                "a plan\n" +
                "a canal: Panama\"");
    }

    public boolean isPalindrome(String s) {
        List<Character> chars = new ArrayList<>();
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                chars.add(ch);
            } else if (Character.isLetter(ch)) {
                chars.add(Character.toLowerCase(ch));
            }
        }

        int left = 0;
        int right = chars.size() - 1;
        while (left < right) {
            if (chars.get(left++) != chars.get(right--)) {
                return false;
            }
        }
        return true;
    }
}
