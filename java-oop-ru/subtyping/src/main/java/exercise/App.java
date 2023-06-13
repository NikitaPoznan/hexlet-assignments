package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage kv) {
        Map<String, String> newData = new HashMap<>();
        for (Map.Entry<String, String> entry : kv.toMap().entrySet()) {
            newData.put(entry.getValue(), entry.getKey());
        }
        kv.toMap().clear();
        kv.toMap().putAll(newData);
    }
}
// END
