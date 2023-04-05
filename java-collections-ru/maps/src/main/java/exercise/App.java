package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        Map<String, Integer> wordsCount = new HashMap<>();

        for (var word : sentence.split(" ")) {   //требуется пройтись по всему предложению и положить значения в Мап
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
// создаётся пустая строка , которая будет хранить результат , потом дописываться строка. Кладём в строку, обычная строка
//       можно использовать StringBuilding
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


//    Дмитрий Полковников20:36
//            (List<Map<String, String>> p1, Map<String, String> p2)
//    Дмитрий Полковников20:39
//    boolean matchFilter(Map<String, String> book, Map<String, String> filters)