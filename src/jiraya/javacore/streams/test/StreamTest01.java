package jiraya.javacore.streams.test;

//1. Order LightNovel by title
//2. Retrieve the first 3 light novels with price less than 4

import jiraya.javacore.streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest01 {
    private static List<LightNovel> list = new ArrayList<>(List.of(
            new LightNovel("Melodrama", 1.99),
            new LightNovel("Folklore", 3.99),
            new LightNovel("Brat", 5.99),
            new LightNovel("Dry gin", 2.99),
            new LightNovel("Black magic", 3.99)
    ));

    public static void main(String[] args) {
        List<String> titles = new ArrayList<>();
        list.sort(Comparator.comparing(LightNovel::getTitle));
        for (LightNovel lightNovel : list) {
            if (lightNovel.getPrice() <= 4) {
                titles.add(lightNovel.getTitle());
                } if (titles.size() >= 3){
                break;
            }
        }
        System.out.println(list);
        System.out.println("----------\n");
        System.out.println(titles);

    }
}
