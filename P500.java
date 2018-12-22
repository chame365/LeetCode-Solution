package problem;

import java.util.ArrayList;
import java.util.List;

public class P500 {
    public static void main(String[] args) {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        for (String line : new P500().findWords(words)) {
            System.out.println(line);
        }
    }

    public String[] findWords(String[] words) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (isKeyboardLine(word)) {
                result.add(word);
            }
        }
        String[] a = new String[result.size()];
        return result.toArray(a);
    }

    public boolean isKeyboardLine(String word) {

        String[] keyBoards = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};

        String first = String.valueOf(word.toLowerCase().charAt(0));
        for (String keyBoard : keyBoards) {
            if (keyBoard.contains(first)) {
                if (check(keyBoard, word.toLowerCase())) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public boolean check(String line, String word) {
        for (int i = 0; i < word.length(); i++) {
            if (!line.contains(word.substring(i, i + 1))) {
                return false;
            }
        }
        return true;
    }
}
