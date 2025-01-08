package jiraya.javacore.exception.test;

import java.io.File;
import java.io.IOException;

public class Exception01 {
    public static void main(String[] args) {
         newFile();
    }

    private static void newFile() {
        File file = new File("arquivo\\test.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
            //NUNCA DEIXAR EM BRANCO
        }
    }
}
