package Lesson36;
import java.util.*;

public class WordMultiple {
    public static Map<String, Boolean> wordMultiple(String[] words) {
        Map<String, Boolean> result = new HashMap<>();
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        for (String word : words) {
            result.put(word, wordCount.get(word) >= 2);
        }
        return result;
    }

    public static void main(String[] args) {
        String[] input1 = {"a", "b", "a", "c", "b"};
        String[] input2 = {"c", "b", "a"};
        String[] input3 = {"c", "c", "c", "c"};

        System.out.println(wordMultiple(input1));
        System.out.println(wordMultiple(input2));
        System.out.println(wordMultiple(input3));
    }
}
