package jiraya.javacore.generics.test;

import jiraya.javacore.generics.domain.Boat;
import jiraya.javacore.generics.domain.Carro;
import jiraya.javacore.generics.service.BoatRentalService;
import jiraya.javacore.generics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class GenericClassTest03 {
    public static void main(String[] args) {
        List<Carro> carroList = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Mercedes")));
        List<Boat> boatList = new ArrayList<>(List.of(new Boat("Serenity"), new Boat("Zephyr")));

        RentalService<Carro> rentalService = new RentalService<>(carroList);
        Carro carro = rentalService.retrieveAvailableObject();
        System.out.println("Rental car..");
        rentalService.returnRentedObjects(carro);

        //RentalService<Boat> rentalService1 = new RentalService<>(boatList);



    }
}
