package singleton;

import java.util.HashMap;
import java.util.Map;

public class SingletonManager {
    private static Map<String, Object> objectMap = new HashMap<>();

    private SingletonManager() {
    }

    /**
     * 注入单例
     *
     * @param key
     * @param instance
     */
    public static void registerService(String key, Object instance) {
        if (!objectMap.containsKey(key)) {
            objectMap.put(key, instance);
        }
    }

    /**
     * 获取单例
     *
     * @param key
     * @return
     */
    public static Object getService(String key) {
        return objectMap.get(key);
    }

}
