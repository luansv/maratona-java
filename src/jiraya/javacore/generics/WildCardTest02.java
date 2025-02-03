package jiraya.javacore.generics;

import java.util.List;

public class WildCardTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorroList = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatoList = List.of(new Gato(), new Gato());
        printConsulta(cachorroList);
        printConsulta(gatoList);

    }

    private static void printConsulta(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }

    }

    private static void printConsultaAnimal(List<? super Animal> animais) {
    }

}
