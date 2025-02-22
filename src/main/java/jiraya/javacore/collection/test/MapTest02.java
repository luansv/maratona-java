package jiraya.javacore.collection.test;

import jiraya.javacore.collection.domain.Artists;
import jiraya.javacore.collection.domain.Consumidor;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {

        Consumidor consumidor = new Consumidor("Lisa");
        Consumidor consumidor1 = new Consumidor("Jonan");

        Artists artists = new Artists(01L, "Arca", 7000.000);
        Artists artists1 =new Artists(02L, "Bjork", 8000.00);
        Artists artists2 =new Artists(04L, "Angele", 400.00);
        Artists artists3 =new Artists(03L, "Radiohead", 170000.00);

        Map<Consumidor, Artists> consumidorArtistsMap = new HashMap<>();
        consumidorArtistsMap.put(consumidor, artists2);
        consumidorArtistsMap.put(consumidor1, artists3);

        for (Map.Entry<Consumidor, Artists> entry : consumidorArtistsMap.entrySet()){
            System.out.println(entry.getKey().getNome()+ ": "+entry.getValue());
        }
        System.out.println(consumidor);
    }
}
