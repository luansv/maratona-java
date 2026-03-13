package jiraya.javacore.poo.classes.test;

import jiraya.javacore.poo.classes.domain.Person;

public class Person01 {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Ana");
        person.setAge(8);
        person.setSexo('F');

        person.imprimir();
    }
}
