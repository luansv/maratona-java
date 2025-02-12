package jiraya.javacore.optional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("Helena");
        Optional<String> o2 = Optional.ofNullable(null);
        System.out.println(o1);
        System.out.println(o2);
        System.out.println("----------");

        Optional<String> optionalName = Optional.ofNullable(findName("Helena"));
        String s = optionalName.orElse("Nome not found");
        System.out.println(optionalName);


    }

    public static String findName(String name){
        List<String> listName = List.of("Julia", "Malu", "Alan");
        int i = listName.indexOf(name);
        if (i != 1){
            return listName.get(i);
        }
        return null;
    }
}
