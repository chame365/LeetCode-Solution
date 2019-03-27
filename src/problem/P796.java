package problem;

public class P796 {
    public static void main(String[] args) {
        new P796().rotateString("abcde", "cdeab");
    }

    public boolean rotateString(String A, String B) {

        return A.length() == B.length() && (A + A).contains(B);
    }
}
