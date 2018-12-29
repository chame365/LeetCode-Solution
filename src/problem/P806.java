package problem;

public class P806 {
    public static void main(String[] args) {
        int[] widths = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        String S = "abcdefghijklmnopqrstuvwxyz";
        new P806().numberOfLines(widths, S);
    }

    public int[] numberOfLines(int[] widths, String S) {
        int[] result = new int[2];
        for (int i = 0; i < S.length(); i++) {
            int width = widths[S.charAt(i) - 'a'];
            if (result[1] + width > 100) {
                result[0]++;
                result[1] = width;
                continue;
            }
            result[1] += width;
        }
        if (result[1] > 0) {
            result[0]++;
        }
        return result;
    }
}
