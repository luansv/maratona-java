package jiraya.javacore.designpatterns.domain;

import java.util.HashSet;
import java.util.Set;

public class AircraftSingletonLazy {
    private static AircraftSingletonLazy INSTANCE = new AircraftSingletonLazy("360-365");
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    private AircraftSingletonLazy(String name) {
        this.name = name;
    }

    public static AircraftSingletonLazy getInstance() {
        if (INSTANCE == null) {
            synchronized (AircraftSingletonLazy.class) {
                if (INSTANCE == null) {
                    INSTANCE = new AircraftSingletonLazy("360-365");

                }
            }
        }
        return INSTANCE;
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }
}


