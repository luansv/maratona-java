package jiraya.javacore.collection.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("keyboad", "keyboard");
        map.put("mouze", "mouse");
        System.out.println(map);

        for (String key: map.keySet()){
            System.out.println(key + ": "+map.get(key));
        }

        for (String key: map.values()){
            System.out.println(key + ": "+map.values());
        }

        for (String key: map.keySet()){
            System.out.println(key + ": "+map.get(key));
        }
    }
}
