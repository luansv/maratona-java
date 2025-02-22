package jiraya.javacore.behavior.test;

import jiraya.javacore.behavior.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class BehaviorTest01 {
    private static List<Car> carList = List.of(new Car("Red", 2024), new Car("Black", 2022));

    public static void main(String[] args) {
        System.out.println(filterGreenCar(carList));
        System.out.println(filterByColor(carList,"Red"));
        System.out.println();
        System.out.println(filterByYear(carList,2023));

    }

    private static List<Car> filterGreenCar(List<Car> carList) {
        List<Car> greenCars = new ArrayList<>();
        for (Car car : carList) {
            if (car.getColor().equals("Blue")) {
                greenCars.add(car);
            }
        }
        return greenCars;
    }

    private static List<Car> filterByColor(List<Car> carList, String color) {
        List<Car> greenCars = new ArrayList<>();
        for (Car car : carList) {
            if (car.getColor().equals(color)) {
                greenCars.add(car);
            }
        }
        return greenCars;
    }

    private static List<Car> filterByYear(List<Car> carList, int year) {
        List<Car> carsYear = new ArrayList<>();
        for (Car car : carList) {
            if (car.getYear() <= year) {
                carsYear.add(car);
            }
        }
        return carsYear;
    }
}
