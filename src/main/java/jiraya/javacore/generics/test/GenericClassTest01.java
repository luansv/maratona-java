package jiraya.javacore.generics.test;

import jiraya.javacore.generics.domain.Carro;
import jiraya.javacore.generics.service.CarroRentalService;

public class GenericClassTest01 {
    public static void main(String[] args) {
        CarroRentalService carroRentalService = new CarroRentalService();
        Carro carro = carroRentalService.retrieveAvailableCar();
        System.out.println("Rental car... ");
        carroRentalService.returnRentedCar(carro);

    }
}
