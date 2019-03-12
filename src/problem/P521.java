package problem;

public class P521 {
    public static void main(String[] args) {
        new P521().findLUSlength("aba", "cdc");
    }

    public int findLUSlength(String a, String b) {
        if (a.equals(b)) {
            return -1;
        } else {
            return a.length() > b.length() ? a.length() : b.length();
        }
    }
}
