package jiraya.javacore.streams.test;

//1. Order LightNovel by title
//2. Retrieve the first 3 light novels with price less than 4

import jiraya.javacore.streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();
        List<String> singers = List.of("Kelela", "Dua Lipa");
        List<String> actors = List.of("Fernanda Torres", "Tedd");
        List<String> directors = List.of("Walter", "Salles");
        list.add(singers);
        list.add(actors);
        list.add(directors);
        for (List<String> people : list) {
            for (String person : people) {
                System.out.println(person);
            }

        }

        list.stream()
                .flatMap(Collection::stream).forEach(System.out::println);

    }
}
