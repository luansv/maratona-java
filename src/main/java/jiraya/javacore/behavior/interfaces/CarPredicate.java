package jiraya.javacore.behavior.interfaces;

import jiraya.javacore.behavior.domain.Car;

@FunctionalInterface
public interface CarPredicate {
    boolean test(Car car);
}
