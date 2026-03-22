package jiraya.javacore.poo.modificadorestatico.test;

import jiraya.javacore.poo.modificadorestatico.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("BMW", 280);
        Carro carro2 = new Carro("Mercedez", 275);
        Carro carro3 = new Carro("Audi", 290);

        carro1.setVelocidadeLimite(180);
        /*
        Agora TODOS os carros irão ter essa velocidade limite,
        e não apenas carro1, já que na classe "Carro" VelocidaeLimite é static.
         */

        carro1.imprimir();
        carro2.imprimir();
        carro3.imprimir();
    }
}
