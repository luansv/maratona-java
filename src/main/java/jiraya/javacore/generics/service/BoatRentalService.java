package jiraya.javacore.generics.service;

import jiraya.javacore.generics.domain.Boat;

import java.util.ArrayList;
import java.util.List;

public class BoatRentalService {
    private List<Boat> boatList = new ArrayList<>(List.of(new Boat("Serenity"), new Boat("Zephyr")));

    public Boat retrieveAvailableBoat(){
        System.out.println("Searching for available boat...");
        Boat boat = boatList.remove(0);
        System.out.println("Renting boats: "+boat);
        System.out.println("Available boats for renting: "+boatList);
        return boat;
    }

    public void returnRentedBoat(Boat boat){
        System.out.println("Returning rental boat "+boat);
        boatList.add(boat);
        System.out.println("Available boats for renting: ");
        System.out.println(boatList);
    }
}
