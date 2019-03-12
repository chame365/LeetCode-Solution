package problem;

public class P942 {

    public static void main(String[] args) {
        new P942().diStringMatch("IDID");
    }

    public int[] diStringMatch(String S) {
        int min = 0;
        int max = S.length();
        int[] result = new int[S.length() + 1];

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'I') {
                result[i] = min++;
            } else {
                result[i] = max--;
            }
        }
        result[S.length()] = min;
        return result;
    }
}
