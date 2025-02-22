package jiraya.javacore.designpatterns.test;

import jiraya.javacore.designpatterns.domain.Person;

public class PersonTest01 {
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder()
                .firstName("Luan")
                .lastName("Silva")
                .username("luansilvf")
                .email("luan123@gmail.com")
                .build();

        System.out.println(person);
    }
}
