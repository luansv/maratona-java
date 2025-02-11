package jiraya.javacore.behavior.test;

import jiraya.javacore.behavior.domain.Car;
import jiraya.javacore.behavior.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BehaviorTest02 {
    private static List<Car> carList = List.of(new Car("Green", 2024), new Car("Black", 2022));

    public static void main(String[] args) {

        List<Car> greenCars = filter(carList, car -> car.getColor().equals("Green"));
        List<Car> carYear = filter(carList, car -> car.getYear() < 2023);
        System.out.println("Color: " + greenCars);
        System.out.println("Year: " + carYear);
    }

    private static List<Car> filter(List<Car> carList, CarPredicate carPredicate) {
        List<Car> filterCar = new ArrayList<>();
        for (Car car : carList) {
            if (carPredicate.test(car)) {
                filterCar.add(car);
            }
        }
        return filterCar;
    }

    private static <T> List<T> filter2(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        for (T e : list) {
            if (predicate.test(e)) {
                filteredList.add(e);
            }
        }
        return filteredList;
    }
}
