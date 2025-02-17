package jiraya.javacore.collection.test;

import jiraya.javacore.collection.domain.Artists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Artists> artists = new ArrayList<>(4);
        artists.add(new Artists(01L, "Arca", 7000.000));
        artists.add(new Artists(02L, "Bjork", 8000.00));
        artists.add(new Artists(04L, "Angele", 400.00));
        artists.add(new Artists(03L, "Radiohead", 170000.00));

        Collections.sort(artists);
        System.out.println("----------------");
        for (Artists artists1 : artists) {
            System.out.println(artists1);
        }

        Artists artistsToSearch = new Artists(03L, "Radiohead", 170000.00);
        System.out.println(Collections.binarySearch(artists, artistsToSearch));

    }
}
