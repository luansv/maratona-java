package jiraya.javacore.lambda.service;

import jiraya.javacore.lambda.domain.Artist;

public class ArtistComparators {
    public static int compareByTitle(Artist a1, Artist a2){
        return a1.getName().compareTo(a2.getName());
    }

    public int compareByTitleNonStatic(Artist a1, Artist a2){
        return a1.getName().compareTo(a2.getName());
    }

}
