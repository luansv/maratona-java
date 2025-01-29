package jiraya.javacore.collection.test;

import jiraya.javacore.collection.domain.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("!ABC1", "Apple");
        Smartphone s2 = new Smartphone("!ABC1", "Apple");

        //it´s false since none of them are located at the same space in memory
        System.out.println(s1.equals(s2));

        //true since the both of them are located at the same space in memory
        s1 = s2;
        System.out.println(s1.equals(s2));

    }
}
