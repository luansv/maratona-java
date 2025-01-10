package jiraya.javacore.exception.exception.domain;

import java.io.Closeable;
import java.io.IOException;

public class Leitor01 implements Closeable {


    @Override
    public void close() throws IOException {
        System.out.println("Leitor 1");
    }
}
