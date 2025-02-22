package jiraya.javacore.collection.test;

import jiraya.javacore.collection.domain.Artists;
import jiraya.javacore.collection.domain.Consumidor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {

        Consumidor consumidor1 = new Consumidor("Lisa");
        Consumidor consumidor2 = new Consumidor("Jonan");

        Artists artists0 = new Artists(01L, "Arca", 7000.000);
        Artists artists1 =new Artists(02L, "Bjork", 8000.00);
        Artists artists2 =new Artists(04L, "Angele", 400.00);
        Artists artists3 =new Artists(03L, "Radiohead", 170000.00);

        List<Artists> artistsConsumidorList1 = List.of(artists1,artists3,artists0);
        List<Artists> artistsConsumidorList2 = List.of(artists2,artists1);
        Map<Consumidor, List<Artists>> consumidorArtistsMap = new HashMap<>();
        consumidorArtistsMap.put(consumidor1, artistsConsumidorList1);
        consumidorArtistsMap.put(consumidor2, artistsConsumidorList2);

        for(Map.Entry<Consumidor, List<Artists>> entry: consumidorArtistsMap.entrySet()){
            System.out.println("----"+entry.getKey().getNome());
            for (Artists artists: entry.getValue()){
                System.out.println("-------------"+artists.getName());
            }
        }

    }
}
