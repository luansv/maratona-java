package jiraya.javacore.generics.test;

import jiraya.javacore.generics.domain.Boat;
import jiraya.javacore.generics.domain.Carro;
import jiraya.javacore.generics.service.BoatRentalService;
import jiraya.javacore.generics.service.CarroRentalService;

public class GenericClassTest02 {
    public static void main(String[] args) {
        BoatRentalService boatRentalService = new BoatRentalService();
        Boat boat = boatRentalService.retrieveAvailableBoat();
        System.out.println("Rental boat... ");
        boatRentalService.returnRentedBoat(boat);
    }
}
