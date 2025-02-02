package jiraya.javacore.collection.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise02 {
    //Compare Elements in a Collection.
    public static void main(String[] args) {
        //Remove a Specific Element From a Collection

        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(8);
        list.add(84);
        list.add(70);
        list.add(7);

        System.out.println("Original ArrayList: " + list);

        list.remove(0);
        list.remove(2);

        System.out.println("Modified ArrayList: " + list);


    }


}
