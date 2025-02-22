package jiraya.javacore.serealization.domain;

public class Turma {
    private String turma;

    public Turma(String nome) {
        this.turma = nome;
    }

    public String getNome() {
        return turma;
    }

    public void setNome(String nome) {
        this.turma = nome;
    }
}
