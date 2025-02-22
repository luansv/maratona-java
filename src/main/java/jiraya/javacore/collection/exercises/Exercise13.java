package jiraya.javacore.collection.exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class GFG {
    // Generic function to construct a new
    // TreeMap from HashMap
    public static <K, V> Map<K, V> convertToTreeMap(Map<K, V> hashMap) {
        Map<K, V>
                treeMap = hashMap
                // Get the entries from the hashMap
                .entrySet()

                // Convert the map into stream
                .stream()

                // Now collect the returned TreeMap
                .collect(
                        Collectors

                                // Using Collectors, collect the entries
                                // and convert it into TreeMap
                                .toMap(
                                        Map.Entry::getKey,
                                        Map.Entry::getValue,
                                        (oldValue,
                                         newValue)
                                                -> newValue,
                                        TreeMap::new));

        // Return the TreeMap
        return treeMap;
    }
}

public class Exercise13 {
    public static void main(String[] args) {
        //Check if a Key exists in a HashMap

        Map<String, Integer> strings = new HashMap<>();
        strings.put("Julia", 4);
        strings.put("Malu", 4);
        strings.put("Helena", 9);

        for (Map.Entry<String, Integer> entry : strings.entrySet()) {

        }

    }
}
