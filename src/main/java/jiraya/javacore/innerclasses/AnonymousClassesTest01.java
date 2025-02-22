package jiraya.javacore.innerclasses;


class Animal {
    public void walk() {
        System.out.println("Waling");
    }
}

public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            //anonymous class
            @Override
            public void walk() {
                System.out.println("Walking and barking!");
            }
        };
        animal.walk();

    }
}


