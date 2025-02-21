package jiraya.javacore.designpatterns.test;

import jiraya.javacore.designpatterns.domain.AircraftSingletonEager;
import jiraya.javacore.designpatterns.domain.AircraftSingletonEnum;
import jiraya.javacore.designpatterns.domain.AircraftSingletonLazy;

public class AircraftSingletonEnumTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1B");
    }
    private static void bookSeat(String seat) {
        System.out.println(AircraftSingletonEnum.INSTANCE);
        AircraftSingletonEnum instance = AircraftSingletonEnum.INSTANCE;
        System.out.println(instance.bookSeat(seat));
    }

}
