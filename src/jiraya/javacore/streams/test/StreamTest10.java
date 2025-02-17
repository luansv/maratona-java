package jiraya.javacore.streams.test;

import jiraya.javacore.streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest10 {
    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("Melodrama", 1.99),
            new LightNovel("Brat", 5.99),
            new LightNovel("Dry gin", 2.99),
            new LightNovel("Folklore", 3.99),
            new LightNovel("Black magic", 3.99)
    ));

    public static void main(String[] args) {
        System.out.println((lightNovelList.size()));
        lightNovelList.stream().max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);
        lightNovelList.stream().collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))).ifPresent(System.out::println);

        System.out.println(lightNovelList.stream().collect(Collectors.summingDouble(LightNovel::getPrice)));

        DoubleSummaryStatistics collect = lightNovelList.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));

        System.out.println("---------------------");
        System.out.println(lightNovelList.stream().map(LightNovel::getTitle).collect(Collectors.joining(", ")));
    }
}
