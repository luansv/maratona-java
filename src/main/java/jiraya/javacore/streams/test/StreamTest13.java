package jirgaya.javacore.streams.test;

import jiraya.javacore.streams.domain.Category;
import jiraya.javacore.streams.domain.LightNovel;
import jiraya.javacore.streams.domain.Promotion;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest13 {
    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("Melodrama", 1.99, Category.DRAMA),
            new LightNovel("Brat", 5.99, Category.DRAMA),
            new LightNovel("Dry gin", 8.99, Category.HORROR),
            new LightNovel("Folklore", 3.99, Category.FANTASY),
            new LightNovel("Black magic", 3.99, Category.HORROR)));

    public static void main(String[] args) {
        Map<Category, Long> collect = lightNovelList.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.counting()));
       // System.out.println(collect);

        //category max
        Map<Category, Optional<LightNovel>> collect1 = lightNovelList.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect1);

    }
}

