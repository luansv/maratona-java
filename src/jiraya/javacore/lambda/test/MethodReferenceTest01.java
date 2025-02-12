package jiraya.javacore.lambda.test;

import jiraya.javacore.lambda.domain.Artist;
import jiraya.javacore.lambda.service.ArtistComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Artist> artistsList = new ArrayList<>(List.of(new Artist("Kelela", 42), new Artist("Arca", 38), new Artist("Alan Fiore", 21)));
        //   Collections.sort(artistsList, (a1, a2) -> a1.getName().compareTo(a2.getName()));
        Collections.sort(artistsList, ArtistComparators::compareByTitle);
        System.out.println(artistsList);

    }
}
