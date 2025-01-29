package jiraya.javacore.collection.test;

import jiraya.javacore.collection.domain.Artists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> artists = new ArrayList<>(4);
        artists.add("Arca");
        artists.add("Bjork");
        artists.add("Angele");
        artists.add("Radiohead");

        Collections.sort(artists);

        List<Double> streams = new ArrayList<>();
        streams.add(1000.00);
        streams.add(54500.00);
        streams.add(98900.00);
        streams.add(8900.00);

        Collections.sort(streams);

        for(String artist: artists){
            System.out.println(artist);
        }

        System.out.println(streams);

        new Artists(null,null, null);
    }
}
