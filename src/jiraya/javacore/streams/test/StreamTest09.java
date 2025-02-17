package jiraya.javacore.streams.test;

//1. Order LightNovel by title
//2. Retrieve the first 3 light novels with price less than 4

import jiraya.javacore.streams.domain.LightNovel;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest09 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 50).filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));
        System.out.println("---------------------------------");
        IntStream.range(1, 50).filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));

        Stream.of("");


        System.out.println("-----------------");
        int num[] = {1, 2, 3, 4, 8, 7, 4, 0, 10};
        Arrays.stream(num)
                .average()
                .ifPresent(System.out::println);

        System.out.println("----------------------");
        try(Stream<String> lines = Files.lines(Paths.get("file.txt"))){
            lines.filter(l -> l.contains("Computer"))
                    .forEach(l -> System.out.println());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    }
