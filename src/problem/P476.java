package problem;

public class P476 {
    public static void main(String[] args) {
        new P476().findComplement(20);
    }

    public int findComplement(int num) {
        int result = 0;
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            int i = num % 2;
            num /= 2;
            sb.append(i ^ 1);
        }
        for (int i = 0; i < sb.length(); i++) {
            int t = 2 << (i-1);
            result += (sb.charAt(i)-'0') * ((t == 0)?1:t);
        }
        return result;
    }
}
