package jiraya.javacore.generics.domain;

public class Boat {
    private String nome;

    public Boat(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Boat{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }
}

