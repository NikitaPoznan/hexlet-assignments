package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
import java.util.Map;

public class InMemoryKV implements KeyValueStorage {
    private Map<String, String> store;

    public InMemoryKV(Map<String, String> initialStore) {
        this.store = initialStore;
    }

    @Override
    public void set(String key, String value) {

    }

    @Override
    public void unset(String key) {

    }

    @Override
    public String get(String key, String defaultValue) {
        return null;
    }

    @Override
    public Map<String, String> toMap() {
        return null;
    }
}
// END
