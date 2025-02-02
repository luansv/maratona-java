package jiraya.javacore.collection.test;

import jiraya.javacore.collection.domain.Artists;
import jiraya.javacore.collection.domain.Consumidor;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest2 {
    public static void main(String[] args) {
        Queue<Artists> artists = new PriorityQueue<>(new ArtistsStreamsComparator().reversed());
        artists.add(new Artists(01L,"Arca", 7000.000, 1989));
        artists.add(new Artists(02L, "Bjork", 8000.00, 1956));
        artists.add(new Artists( 04L,"Angele",400.00,1996));
        artists.add(new Artists(03L,"Radiohead", 170000.00, 0));
        artists.add(new Artists(10L,"Radiohead", 170000.00, 0));

        while (!artists.isEmpty()){
            System.out.println(artists.poll());
        }

    }
}
