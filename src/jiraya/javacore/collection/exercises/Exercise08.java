package jiraya.javacore.collection.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise07 {
    public static void main(String[] args) {
        //Comparing two ArrayList In Java
        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(0);
        list.add(7);

        List<Integer> list2 = new ArrayList<>();
        list2.add(15);
        list2.add(70);
        list2.add(7);

        if (!list.equals(list2)){
            System.out.println("Not the same: "+list+"\n"+list2);
            return;
        }
        System.out.println("Same: "+list+"\n"+list2);

    }
}
