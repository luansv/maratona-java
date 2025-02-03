package jiraya.javacore.collection.exercises;

import java.util.HashMap;
import java.util.Map;

public class Exercise10 {
    public static void main(String[] args) {
        //Check if a Key exists in a HashMap

        Map<String, Integer> strings = new HashMap<>();
        strings.put("Julia", 4);
        strings.put("Malu",4);
        strings.put("Helena", 9);

        String key ="Malu";

        boolean contain = strings.containsKey(key);
        System.out.println(contain);

        for (Map.Entry<String, Integer> entry : strings.entrySet()){
            System.out.println(entry.getKey()+ ": "+entry.getValue());
        }

    }
}
