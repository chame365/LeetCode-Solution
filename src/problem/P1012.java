package problem;

public class P1012 {
    public static void main(String[] args) {
        new P1012().bitwiseComplement(7);
    }

    public int bitwiseComplement(int N) {
        int result = 0;
        int multiplier = 1;
        if (N == 0) {
            return 1;
        }
        while (N > 0) {
            int temp = N % 2 == 0 ? 1 : 0;
            N /= 2;
            result += temp * multiplier;
            multiplier *= 2;
        }
        return result;
    }
}
