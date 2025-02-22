package jiraya.javacore.streams.test;

//1. Order LightNovel by title
//2. Retrieve the first 3 light novels with price less than 4

import jiraya.javacore.streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest06 {
    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("Melodrama", 1.99),
            new LightNovel("Brat", 5.99),
            new LightNovel("Dry gin", 2.99),
            new LightNovel("Folklore", 3.99),
            new LightNovel("Black magic", 3.99)
    ));

    public static void main(String[] args) {
        lightNovelList.stream()
                .filter(ln -> ln.getPrice() > 3 )
                .findAny() // will print any object
                .ifPresent(System.out::println);

        lightNovelList.stream()
                .filter(ln -> ln.getPrice() > 3).max(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);
    }
}
