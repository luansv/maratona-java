package jiraya.javacore.collection.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(0);
        list.add(4);
        list.add(3);

        //index 0, 1, 2, 3
        //value 1, 2, 3, 4

        Collections.sort(list);
        System.out.println(Collections.binarySearch(list,1));
    }
}
