package problem;

import java.util.ArrayList;
import java.util.List;

public class P884 {

    public static void main(String[] args) {
        new P884().uncommonFromSentences("this apple is sweet", "this apple is sour");
    }

    public String[] uncommonFromSentences(String A, String B) {
        String[] strings = (A + " " + B).split(" ");

        List<String> list = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            boolean flag = false;
            for (int j = 0; j < strings.length; j++) {
                if (i != j && strings[i].equals(strings[j])) {
                    flag = true;
                }
            }
            if(flag == false){
                list.add(strings[i]);
            }
        }
        String[] result = new String[list.size()];
        return list.toArray(result);
    }
}
