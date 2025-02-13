package jiraya.javacore.streams.test;

//1. Order LightNovel by title
//2. Retrieve the first 3 light novels with price less than 4

import jiraya.javacore.streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest07 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 6, 4, 7, 10);

        System.out.println(integers.stream().reduce(2, (x, y) -> x + y));
        System.out.println(integers.stream().reduce(0, Integer::sum));

        System.out.println("------Multiplication------");
        System.out.println(integers.stream().reduce(2, (x, y) -> x * y));

        System.out.println("------Max------");
        integers.stream().reduce((x,y) -> x > y ? x : y).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(0, Integer::max));

    }
}
