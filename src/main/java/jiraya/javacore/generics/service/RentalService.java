package jiraya.javacore.generics.service;

import jiraya.javacore.generics.domain.Carro;

import java.util.ArrayList;
import java.util.List;

public class RentalService<T> {
    private List<T> availableObjects;

    public RentalService(List<T> availableObjects) {
        this.availableObjects = availableObjects;
    }

    public T retrieveAvailableObject() {
        System.out.println("Searching for available object...");
        T t = availableObjects.remove(0);
        System.out.println("Renting car: " + t);
        System.out.println("Available objects for renting: " + availableObjects);
        return t;
    }

    public void returnRentedObjects(T t) {
        System.out.println("Returning rental object: " + t);
        availableObjects.add(t);
        System.out.println("Available objects for renting: ");
        System.out.println(availableObjects);
    }
}
