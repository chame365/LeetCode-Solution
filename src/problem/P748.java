package problem;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class P748 {

    public static void main(String[] args) {
        String[] words = {"measure", "other", "every", "base", "according", "level", "meeting", "none", "marriage", "rest"};
        new P748().shortestCompletingWord("GrC8950", words);
    }

    public String shortestCompletingWord(String licensePlate, String[] words) {
        String licensePlateLow = licensePlate.replaceAll("[0-9\\s]+", "").toLowerCase();

        Map<Character, Integer> map = new HashMap<>();
        for (char c : licensePlateLow.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        Arrays.sort(words, Comparator.comparingInt(String::length));


        for (String word : words) {
            if (word.length() < licensePlateLow.length()) {
                continue;
            }
            String wordLow = word.replaceAll("[0-9\\s]+", "").toLowerCase();
            Map<Character, Integer> map1 = new HashMap<>();
            for (char c : wordLow.toCharArray()) {
                map1.put(c, map1.getOrDefault(c, 0) + 1);
            }

            boolean flag = true;
            for (char key : map.keySet()) {
                if (!map1.containsKey(key)) {
                    flag = false;
                    break;
                }

                if (map.get(key) > map1.get(key)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return word;
            }
        }
        return null;
    }
}
