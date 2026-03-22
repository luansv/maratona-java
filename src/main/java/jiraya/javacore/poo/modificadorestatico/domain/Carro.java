package jiraya.javacore.poo.modificadorestatico.domain;

public class Carro {
    private String nome;
    private double velocidadeMax;
    private static double velocidadeLimite = 250; //Agora faz parte da classe em si e não apenas ao objeto.

    public Carro(String nome, double velocidadeMax) {
        this.nome = nome;
        this.velocidadeMax = velocidadeMax;
    }

    public void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("Velocidade máxima: " + velocidadeMax);
        System.out.println("Velocidade limite: " + Carro.velocidadeLimite);
        System.out.println("----------------------");
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(double velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }
}
