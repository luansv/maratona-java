package jiraya.javacore.streams.test;

import jiraya.javacore.streams.domain.Category;
import jiraya.javacore.streams.domain.LightNovel;
import jiraya.javacore.streams.domain.Promotion;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest14 {
    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("Melodrama", 1.99, Category.DRAMA),
            new LightNovel("Brat", 5.99, Category.DRAMA),
            new LightNovel("Dry gin", 8.99, Category.HORROR),
            new LightNovel("Folklore", 3.99, Category.FANTASY),
            new LightNovel("Black magic", 3.99, Category.HORROR)));

    public static void main(String[] args) {
        Map<Category, DoubleSummaryStatistics> collect1 = lightNovelList.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect1);

        Map<Category, Map<Promotion, List<LightNovel>>> collect2 = lightNovelList.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.groupingBy(lightNovel -> lightNovel.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE)));
        System.out.println(collect2);


        Map<Category, List<Promotion>> collect3 = lightNovelList.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.mapping(StreamTest14::getPromotion, Collectors.toList())));
        System.out.println(collect3);


    }
    private static Promotion getPromotion(LightNovel lightNovel){
        return lightNovel.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
    }

}

