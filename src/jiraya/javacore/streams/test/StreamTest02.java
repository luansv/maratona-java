package jiraya.javacore.streams.test;

//1. Order LightNovel by title
//2. Retrieve the first 3 light novels with price less than 4

import jiraya.javacore.streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest02 {
    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("Melodrama", 1.99),
            new LightNovel("Folklore", 3.99),
            new LightNovel("Brat", 5.99),
            new LightNovel("Dry gin", 2.99),
            new LightNovel("Black magic", 3.99)
    ));

    public static void main(String[] args) {
        List<String> titles = lightNovelList.stream()
                .sorted(Comparator.comparing(LightNovel::getTitle))
                .filter(ln -> ln.getPrice() < 4)
                .limit(3)
                .map(LightNovel::getTitle)
                .collect(Collectors.toList());

        System.out.println(titles);
    }
}
