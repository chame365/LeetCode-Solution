package problem;

import java.util.HashMap;
import java.util.Map;

public class P290 {
    public static void main(String[] args) {
        new P290().wordPattern("abba", "dog dog dog dog");
    }

    public boolean wordPattern(String pattern, String str) {
        String[] split = str.split(" ");
        if (pattern.length() != split.length) {
            return false;
        }

        Map<Character, String> map = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            String value = map.get(pattern.charAt(i));
            if (value == null || value.isEmpty()) {
                map.put(pattern.charAt(i), split[i]);
            } else if (!value.equals(split[i])) {
                return false;
            }
        }
        return true;
    }
}
