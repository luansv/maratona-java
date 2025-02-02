package jiraya.javacore.collection.exercises;

import java.util.ArrayList;
import java.util.List;

public class Exercise04 {
    public static void main(String[] args) {
        //Get a Size of Collection
        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(70);
        list.add(7);

        System.out.println(list.size());
        System.out.println(list);
    }
}
