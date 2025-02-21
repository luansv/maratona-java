package jiraya.javacore.designpatterns.test;

import jiraya.javacore.designpatterns.domain.AircraftSingletonEager;
import jiraya.javacore.designpatterns.domain.AircraftSingletonLazy;

public class AircraftSingletonLazyTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat) {
        System.out.println(AircraftSingletonEager.getInstance());
        AircraftSingletonLazy aircraftSingletonLazy = AircraftSingletonLazy.getInstance();
        System.out.println(aircraftSingletonLazy.bookSeat(seat));
    }
}
