package jiraya.javacore.collection.test;

import jiraya.javacore.collection.domain.Artists;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {

        Set<Artists> artists = new LinkedHashSet<>();
        artists.add(new Artists(01L,"Arca", 7000.000, 1989));
        artists.add(new Artists(02L, "Bjork", 8000.00, 1956));
        artists.add(new Artists( 04L,"Angele",400.00,1996));
        artists.add(new Artists(03L,"Radiohead", 170000.00, 0));

        for (Artists artist: artists){
            System.out.println(artist);
        }
    }
}
