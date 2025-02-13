package jiraya.javacore.streams.test;

//1. Order LightNovel by title
//2. Retrieve the first 3 light novels with price less than 4

import jiraya.javacore.streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest08 {
    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("Melodrama", 1.99),
            new LightNovel("Brat", 5.99),
            new LightNovel("Dry gin", 2.99),
            new LightNovel("Folklore", 3.99),
            new LightNovel("Black magic", 3.99)
    ));

    public static void main(String[] args) {
        //sum all the lightNovel with price > 3;
        lightNovelList.stream()
                .map(LightNovel::getPrice)
                .filter(price -> price > 3)
                .reduce(Double::sum)
                .ifPresent(System.out::println);

        double sum = lightNovelList.stream() // Turn Stream<Double> into double
                .mapToDouble(LightNovel::getPrice)
                .filter(price -> price > 3)
                .sum();

    }
}
