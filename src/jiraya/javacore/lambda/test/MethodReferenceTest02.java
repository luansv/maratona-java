package jiraya.javacore.lambda.test;

import jiraya.javacore.lambda.domain.Artist;
import jiraya.javacore.lambda.service.ArtistComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        ArtistComparators artistComparators = new ArtistComparators();
        List<Artist> artistsList = new ArrayList<>(List.of(new Artist("Kelela", 42), new Artist("Arca", 38), new Artist("Alan Fiore", 21)));
        Collections.sort(artistsList, ArtistComparators::compareByTitle);
        System.out.println(artistsList);

    }
}
