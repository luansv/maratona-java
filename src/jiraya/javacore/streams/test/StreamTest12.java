package jiraya.javacore.streams.test;

import jiraya.javacore.streams.domain.Category;
import jiraya.javacore.streams.domain.LightNovel;
import jiraya.javacore.streams.domain.Promotion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest12 {
    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("Melodrama", 1.99, Category.DRAMA),
            new LightNovel("Brat", 5.99, Category.DRAMA),
            new LightNovel("Dry gin", 8.99, Category.HORROR),
            new LightNovel("Folklore", 3.99, Category.FANTASY),
            new LightNovel("Black magic", 3.99, Category.HORROR)));

    public static void main(String[] args) {
        Map<Promotion, List<LightNovel>> collect = lightNovelList.stream()
                .collect(Collectors.groupingBy(lightNovel -> lightNovel.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE));
        //System.out.println(collect);

        //Map<Category>,  Map<Promotion, List<LightNovel>>>
        Map<Category, Map<Promotion, List<LightNovel>>> collect1 = lightNovelList.stream().collect(Collectors.groupingBy(LightNovel::getCategory,
                Collectors.groupingBy(lightNovel -> lightNovel.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE
                )));

        System.out.println(collect1);
    }
}

