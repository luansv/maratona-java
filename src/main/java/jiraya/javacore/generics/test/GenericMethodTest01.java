package jiraya.javacore.generics.test;

import jiraya.javacore.generics.domain.Boat;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodTest01 {
    public static void main(String[] args) {
        List<Boat> list = createArrayWithObject(new Boat("Serenity"));
        System.out.println(list);

    }

    public static <T> List<T> createArrayWithObject(T t) {
        return (List.of(t));
    }


}

