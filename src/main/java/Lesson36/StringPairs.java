package Lesson36;
import java.util.*;

public class StringPairs {
    public static Map<String, String> pairs(String[] strings) {
        Map<String, String> result = new HashMap<>();

        for (String str : strings) {
            if (!str.isEmpty()) {
                char firstChar = str.charAt(0);
                char lastChar = str.charAt(str.length() - 1);
                result.put(String.valueOf(firstChar), String.valueOf(lastChar));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] input1 = {"code", "bug"};
        String[] input2 = {"man", "moon", "main"};
        String[] input3 = {"man", "moon", "good", "night"};

        System.out.println(pairs(input1)); 
        System.out.println(pairs(input2)); 
        System.out.println(pairs(input3)); 
    }
}
