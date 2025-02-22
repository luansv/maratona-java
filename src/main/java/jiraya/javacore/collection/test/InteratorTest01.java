package jiraya.javacore.collection.test;

import jiraya.javacore.collection.domain.Artists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InteratorTest01 {
    public static void main(String[] args) {
        List<Artists> artists = new ArrayList<>(4);
        artists.add(new Artists(01L,"Arca", 7000.000, 1989));
        artists.add(new Artists(02L, "Bjork", 8000.00, 1956));
        artists.add(new Artists( 04L,"Angele",400.00,1996));
        artists.add(new Artists(03L,"Radiohead", 170000.00, 0));


        //wrong way of removing something of the arraylist
        // for (Artists artist : artists) {
        //    if (artist.getYearBirth() == 0){
        //        artists.remove(artist);
        //     }
        // }
        //*

//        Iterator<Artists> iterator = artists.iterator();
//        while (iterator.hasNext()){
//            Artists artist = iterator.next();
//            if (artist.getYearBirth() == 0){
//                iterator.remove();
//            }
//        }
//        System.out.println(artists);

        artists.removeIf(artist -> artist.getYearBirth() == 0);
        System.out.println(artists);


    }
}
