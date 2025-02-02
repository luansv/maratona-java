package jiraya.javacore.collection.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise06 {
    public static void main(String[] args) {
        //Convert Array to ArrayList.

        String[] strings = {"a", "b", "c"};
        List<String> list = new ArrayList<>(Arrays.asList(strings));
        list.add("d");
        System.out.println(list);



    }
}
