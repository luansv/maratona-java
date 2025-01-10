package jiraya.javacore.exception.exception.test;

import jiraya.javacore.exception.exception.domain.Leitor01;
import jiraya.javacore.exception.exception.domain.Leitor02;

import java.io.*;

public class TryWithResources01 {
    public static void main(String[] args) {

        fileReader();
    }

    public static void fileReader() {
        try (Leitor01 leitor01 = new Leitor01();
             Leitor02 leitor02 = new Leitor02()) {

        } catch (IOException e) {

        }

    }
}