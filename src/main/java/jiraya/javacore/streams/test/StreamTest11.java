package jiraya.javacore.streams.test;

import jiraya.javacore.streams.domain.Category;
import jiraya.javacore.streams.domain.LightNovel;
import jiraya.javacore.streams.domain.Promotion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamTest11 {
    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("Melodrama", 1.99, Category.DRAMA),
            new LightNovel("Brat", 5.99, Category.DRAMA),
            new LightNovel("Dry gin", 2.99, Category.HORROR),
            new LightNovel("Folklore", 3.99, Category.FANTASY),
            new LightNovel("Black magic", 3.99, Category.HORROR) ));

    public static void main(String[] args) {
        Map<Category, List<LightNovel>> categoryListMap = new HashMap<>();
        List<LightNovel> fantasy = new ArrayList<>();
        List<LightNovel> drama = new ArrayList<>();
        List<LightNovel> horror = new ArrayList<>();
        for (LightNovel lightNovel : lightNovelList) {
            switch (lightNovel.getCategory()){
                case DRAMA: drama.add(lightNovel); break;
                case FANTASY: fantasy.add(lightNovel); break;
                case HORROR: horror.add(lightNovel); break;
            }
        }
        categoryListMap.put(Category.DRAMA, drama);
        categoryListMap.put(Category.FANTASY, fantasy);
        categoryListMap.put(Category.HORROR, horror);
        System.out.println(categoryListMap);



        lightNovelList.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
    }

    private static Promotion getPromotion(LightNovel lightNovel){
        return lightNovel.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
    }
}

