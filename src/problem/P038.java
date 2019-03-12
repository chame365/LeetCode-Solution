package problem;

public class P038 {
    public static void main(String[] args) {
        new P038().countAndSay(4);
    }

    public String countAndSay(int n) {
        String result = "1";
        StringBuilder sb = new StringBuilder();
        int count;
        char ch;
        for (int i = 1; i < n; i++) {
            count = 1;
            ch = result.charAt(0);
            for (int j = 1; j < result.length(); j++) {
                if (ch == result.charAt(j)) {
                    count++;
                } else {
                    sb.append(count);
                    sb.append(ch);
                    count = 1;
                    ch = result.charAt(j);
                }
            }
            sb.append(count);
            sb.append(ch);
            result = sb.toString();
            sb.setLength(0);
        }
        return result;
    }
}
