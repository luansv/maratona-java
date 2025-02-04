package jiraya.javacore.innerclasses;

import jiraya.javacore.generics.domain.Boat;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class boatComparator implements Comparator<Boat> {

    @Override
    public int compare(Boat o1, Boat o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}

public class AnonymousClassesTest02 {
    public static void main(String[] args) {
        List<Boat> boatList = new ArrayList<>((List.of(new Boat("ABC"), new Boat("DFG"))));
        boatList.sort(new Comparator<Boat>() {
            @Override
            public int compare(Boat o1, Boat o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });
        System.out.println(boatList);
    }
}


