package problem;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class P020 {
    public static void main(String[] args) {
        new P020().isValid2("()[]}");
    }

    public boolean isValid1(String s) {
        int length;
        do {
            length = s.length();
            s = s.replaceAll("\\{\\}", "")
                    .replaceAll("\\[\\]", "")
                    .replaceAll("\\(\\)", "");
        } while (length != s.length());
        return s.length() == 0;
    }

    public boolean isValid2(String s) {
        Stack stack = new Stack();
        Map<Character, Character> map = new HashMap();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                stack.push(c);
            } else if(stack.empty() || map.get(c) != stack.pop()) {
                return false;
            }
        }

        return stack.empty();
    }
}
