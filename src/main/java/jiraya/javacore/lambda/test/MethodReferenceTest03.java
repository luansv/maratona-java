package jiraya.javacore.lambda.test;

import jiraya.javacore.lambda.domain.Artist;
import jiraya.javacore.lambda.service.ArtistComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public class MethodReferenceTest03 {
    public static void main(String[] args) {
        Supplier<ArtistComparators> artistComparators = ArtistComparators:: new;
        List<Artist> artistsList = new ArrayList<>(List.of(new Artist("Kelela", 42), new Artist("Arca", 38), new Artist("Alan Fiore", 21)));

    }
}
