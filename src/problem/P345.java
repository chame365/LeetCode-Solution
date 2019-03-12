package problem;

public class P345 {
    public static void main(String[] args) {
        new P345().reverseVowels("leetcode");
    }

    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length() - 1;
        StringBuilder sb = new StringBuilder(s);
        for (; left < right; left++) {
            if (isVowel(sb.charAt(left))) {
                right = findNextVowel(right, sb);
                char temp = sb.charAt(left);
                sb.setCharAt(left, sb.charAt(right));
                sb.setCharAt(right, temp);
                right--;
            }
        }
        return sb.toString();
    }


    private int findNextVowel(int right, StringBuilder sb) {
        for (; right >= 0; right--) {
            if (isVowel(sb.charAt(right))) {
                return right;
            }
        }
        return right;
    }

    private boolean isVowel(char c) {
        switch (c) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;

        }
    }
}
