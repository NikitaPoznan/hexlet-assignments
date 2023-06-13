package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage kv) {
        Map<String, String> newData = new HashMap<>();
        for (String key : kv.toMap().keySet()) {
            String value = kv.get(key, "");
            newData.put(value, key);
        }
        kv.toMap().clear();
        Map<String, String> newData = new HashMap<>();
        for (String key : kv.toMap().keySet()) {
            String value = kv.get(key, "");
            newData.put(value, key);
        }
        kv.toMap().clear();
        kv.toMap().putAll(newData);
    }
}
// END
