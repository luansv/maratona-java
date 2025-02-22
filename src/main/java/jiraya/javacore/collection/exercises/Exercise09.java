package jiraya.javacore.collection.exercises;

import jiraya.javacore.collection.domain.Artists;
import jiraya.javacore.collection.domain.Consumidor;

import java.util.*;

public class Exercise09 {
    public static void main(String[] args) {
        //Iterate HashMap

        Map<String, Integer> strings = new HashMap<>();
        strings.put("Julia", 4);
        strings.put("Malu",4);
        strings.put("Helena", 9);

        for (Map.Entry<String, Integer> entry : strings.entrySet()){
            System.out.println(entry.getKey()+ ": "+entry.getValue());
        }

    }
}
