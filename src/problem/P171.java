package problem;

public class P171 {
    public static void main(String[] args) {
        new P171().titleToNumber("AB");
    }
    public int titleToNumber(String s) {
        int result = 0;

        for (int i = s.length()-1; i >= 0; i--) {
            result += (s.charAt(i)-'A'+1) * power(s.length()-i-1);
        }
        return result;
    }
    public int power(int n){
        int result = 1;
        for (int i = 0; i < n; i++) {
            result*=26;
        }
        return result;
    }


}
