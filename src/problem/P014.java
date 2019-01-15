package problem;

public class P014 {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        new P014().longestCommonPrefix(strs);
    }

    public String longestCommonPrefix(String[] strs) {
        String targetStr = "";
        StringBuilder result = new StringBuilder();
        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < minLength) {
                minLength = strs[i].length();
            }
        }

        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() == minLength) {
                targetStr = strs[i];
                break;
            }
        }

        for (int i = 0; i < targetStr.length(); i++) {
            int count = 0;
            for (String str : strs) {
                if (targetStr.charAt(i) == str.charAt(i)) {
                    count++;
                }
            }
            if (count == strs.length) {
                result.append(targetStr.charAt(i));
            } else {
                break;
            }
        }
        return result.toString();
    }
}
