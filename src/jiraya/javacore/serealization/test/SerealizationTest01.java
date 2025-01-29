package jiraya.javacore.serealization.test;

import jiraya.javacore.serealization.domain.Aluno;
import jiraya.javacore.serealization.domain.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerealizationTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L, "Kim", "1239494");
        Turma turma = new Turma("subsda");
        aluno.setTurma(turma);
        serializar(aluno);
        desserializar();
    }

    private static void serializar(Aluno aluno) {
        Path path = Paths.get("folder/aluno.txt");
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(path))) {
            objectOutputStream.writeObject(aluno);
        } catch (IOException e) {

        }
    }

    private static void desserializar() {
        Path path = Paths.get("folder/aluno.txt");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {

        }
    }
}

