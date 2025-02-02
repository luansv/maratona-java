package jiraya.javacore.collection.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exxercise01 {
    //Compare Elements in a Collection.
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(15);
        list.add(12);
        list.add(25);
        list.add(6);
        list.add(8);

        int min = Collections.min(list);
        int max = Collections.max(list);
        if (min == max){
            System.out.println("Same value: "+max);
        }
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);


    }


}
