package jiraya.javacore.streams.test;

//1. Order LightNovel by title
//2. Retrieve the first 3 light novels with price less than 4

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest05 {
    public static void main(String[] args) {
        List<String> words = List.of("Anne", "Julia", "Malu");
        words.stream()
                .map(w -> w.split(""))
                        .flatMap(Arrays::stream)
                                .collect(Collectors.toList());
        System.out.println(words);

    }
}
