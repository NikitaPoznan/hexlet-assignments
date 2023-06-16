package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage kv) {
        Map<String, String> newData = new HashMap<>();
        var changeMap = kv.toMap();

        for (String key : changeMap.keySet()) {
            kv.unset(key);
        }
        for (Entry<String, String> entry : changeMap.entrySet()) {
            kv.set(entry.getValue(), entry.getKey());
        }
    }
}
// END
