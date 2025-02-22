package jiraya.javacore.collection.exercises;

import java.util.HashMap;
import java.util.Map;

public class Exercise11 {
    public static void main(String[] args) {
        //Find the Occurrence of Words in a String using HashMap

        String str = "Alice is a girl and Bob is a boy";

        Map<String, Integer> map = new HashMap<>();

        // Splitting the words of string
        // and storing them in the array
        String[] words = str.split(" ");
        for (String word : words) {
            // Asking whether the HashMap contains the
            // key or not. Will return null if not.
            Integer integer = map.get(word);
            if (integer == null){
                map.put(word, 1);
            }
            else {
                // Incrementing the value if the word
                // is already present in the HashMap.
                map.put(word, integer + 1);
            }

            System.out.println(map);
        }

    }
}
