package jiraya.javacore.generics.service;

import jiraya.javacore.generics.domain.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentalService {
    private List<Carro> carroList = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Mercedes")));

    public Carro retrieveAvailableCar(){
        System.out.println("Searching for available car...");
        Carro carro = carroList.remove(0);
        System.out.println("Renting car: "+carro);
        System.out.println("Available cars for renting: "+carroList);
        return carro;
    }

    public void returnRentedCar(Carro carro){
        System.out.println("Returning rental car "+carro);
        carroList.add(carro);
        System.out.println("Available cars for renting: ");
        System.out.println(carroList);
    }
}
