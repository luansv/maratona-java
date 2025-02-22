package jiraya.javacore.streams.test;

import jiraya.javacore.streams.domain.Category;
import jiraya.javacore.streams.domain.LightNovel;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest15 {
    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("Melodrama", 1.99),
            new LightNovel("Folklore", 3.99),
            new LightNovel("Brat", 5.99),
            new LightNovel("Dry gin", 2.99),
            new LightNovel("Black magic", 3.99)
    ));

    public static void main(String[] args) {
        Map<Category, Optional<LightNovel>> collect = lightNovelList.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect);
    }
}
