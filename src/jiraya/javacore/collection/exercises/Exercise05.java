package jiraya.javacore.collection.exercises;

import java.util.ArrayList;
import java.util.List;

public class Exercise05 {
    public static void main(String[] args) {
        //Replace an element from ArrayList

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("C");
        list.add("B");

        list.set(1,"F");
        System.out.println(list);


    }
}
