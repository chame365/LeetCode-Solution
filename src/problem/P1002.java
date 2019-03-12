package problem;

import java.util.ArrayList;
import java.util.List;

public class P1002 {
    public static void main(String[] args) {
        new P1002().commonChars(new String[]{"bella", "label", "roller"});
    }

    public List<String> commonChars(String[] A) {
        List<String> result = new ArrayList<>();
        List<StringBuilder> list = new ArrayList<>();
        for (String a : A) {
            list.add(new StringBuilder(a));
        }

        for (char c : list.get(0).toString().toCharArray()) {
            boolean isResult = true;
            for (int i = 1; i < list.size(); i++) {
                int index = list.get(i).indexOf(String.valueOf(c));
                if (index == -1) {
                    isResult = false;
                } else {
                    list.get(i).deleteCharAt(index);
                }
            }
            if (isResult) {
                result.add(String.valueOf(c));
            }
        }
        return result;
    }
}
