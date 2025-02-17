package jiraya.javacore.collection.test;

import jiraya.javacore.collection.domain.Artists;
import jiraya.javacore.collection.domain.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneBrandComparator implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getBrand().compareTo(o2.getBrand());
    }
}

class ArtistsStreamsComparator implements Comparator<Artists>{

    @Override
    public int compare(Artists o1, Artists o2) {
        return Double.compare(o1.getStreams(), o2.getStreams());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneBrandComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);
        System.out.println(set);

        NavigableSet<Artists> artists = new TreeSet<>(new ArtistsStreamsComparator());
        artists.add(new Artists(01L,"Arca", 7000.000, 1989));
        artists.add(new Artists(02L, "Bjork", 8000.00, 1956));
        artists.add(new Artists( 04L,"Angele",400.00,1996));
        artists.add(new Artists(03L,"Radiohead", 170000.00, 0));
        artists.add(new Artists(10L,"Radiohead", 170000.00, 0));

        for (Artists artist : artists) {
            System.out.println(artist);
        }

        Artists example = new Artists(02L, "Ariana Grande", 10000.00, 1956);
        System.out.println("-------------");
        System.out.println(artists.lower(example));
        System.out.println(artists.floor(example));
        System.out.println(artists.higher(example));
        System.out.println(artists.ceiling(example));


        System.out.println("Size: "+artists.size());
        System.out.println(artists.pollFirst());
        System.out.println(artists.pollLast());

    }
}
