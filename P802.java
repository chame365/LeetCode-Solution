package problem;

import java.util.HashSet;
import java.util.Set;

public class P802 {
    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig","msg"};
        new P802().uniqueMorseRepresentations(words);
    }

    public int uniqueMorseRepresentations(String[] words) {
        String[] morseCodes = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> wordsSet = new HashSet<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                String code = morseCodes[(int) (word.charAt(i) - 'a')];
                sb.append(code);
            }
            wordsSet.add(sb.toString());
            sb.setLength(0);
        }

        return wordsSet.size();
    }

}
