package problem;

public class P917 {
    public static void main(String[] args) {
        new P917().reverseOnlyLetters("?6C40E");
    }

    public String reverseOnlyLetters(String S) {

        StringBuilder sb = new StringBuilder(S);
        int left = 0;
        int right = S.length() - 1;

        while (left < right) {
            while (!Character.isLetter(sb.charAt(left)) || !Character.isLetter(sb.charAt(right))) {
                if (!Character.isLetter(sb.charAt(left))) {
                    left++;
                }
                if (!Character.isLetter(sb.charAt(right))) {
                    right--;
                }
                if (left < 0 || right < 0 || left > right) {
                    break;
                }
            }
            if (left < 0 || right < 0 || left > right) {
                break;
            }
            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);

            left++;
            right--;

        }

        return sb.toString();
    }
}
