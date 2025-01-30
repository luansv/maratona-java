package jiraya.javacore.collection.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIntoArrayTest01 {
    public static void main(String[] args) {
        List<Integer> numb = new ArrayList<>();
        numb.add(1);
        numb.add(2);
        numb.add(3);
        Integer[] array = numb.toArray(new Integer[0]);
        System.out.println(Arrays.toString(array));

        Integer[] arrayNumb = new Integer[3];
        arrayNumb[0] = 1;
        arrayNumb[1] = 2;
        arrayNumb[2] = 3;

        List<Integer> arrayToList = Arrays.asList(arrayNumb);
        System.out.println(Arrays.toString(arrayNumb));
        System.out.println(arrayToList);

        System.out.println("---------------");
        //best way to do it
        List<Integer> numbList = new ArrayList<>(Arrays.asList(arrayNumb));
        numbList.add(15);
        numbList.add(30);
        System.out.println(numbList);

        System.out.println(Arrays.asList(1, 2, 3, 4));
        System.out.println(Arrays.asList("1", "2", "3", "4"));
    }
}
