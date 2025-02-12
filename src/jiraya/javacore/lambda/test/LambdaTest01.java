package jiraya.javacore.lambda.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> names = List.of("Emy", "John", "Emily", "Luke");
        forEach(names, (String s) -> System.out.println(s));
    }
    private static <T> void forEach(List<T> list, Consumer<T> consumer){
        for (T e: list){
            consumer.accept(e);
        }
    }
}
