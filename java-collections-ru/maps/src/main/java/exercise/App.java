package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        if (sentence.length() == 0) {
            return new HashMap<>();
        }
        Map<String, Integer> wordsCount = new HashMap<>();

        for (var word : sentence.split(" ")) {
            if (!wordsCount.containsKey(word)) {
                wordsCount.put(word, 1);
            } else {
                var previousValue = wordsCount.get(word);
                wordsCount.put(word, previousValue + 1);

            }
        }
        return wordsCount;
    }

    public static String toString(Map<String, Integer> wordsCount) {
        if (wordsCount.isEmpty()) {
            return "{}";
        }
        StringBuilder request = new StringBuilder();
        request.append("{\n");
        for (Map.Entry<String, Integer> entry : wordsCount.entrySet()) {
            request.append("  ")
                    .append(entry.getKey())
                    .append(": ")
                    .append(entry.getValue())
                    .append("\n");
        }
        request.append("}");
        return request.toString();

    }

}


//END

