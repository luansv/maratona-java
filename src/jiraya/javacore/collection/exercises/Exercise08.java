package jiraya.javacore.collection.exercises;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Exercise08 {
    public static void main(String[] args) {
        //Iterate LinkedList

        LinkedList<String> strings = new LinkedList<>();
        strings.add("Julia");
        strings.add("Malu");
        strings.add("Helena");


        interateUsingInterator(strings);
    }

    public static void interateUsingInterator(LinkedList<String> strings) {

        Iterator iterator = strings.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
    }

}
