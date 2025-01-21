package jiraya.javacore.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {
            String string;
            while ((string = br.readLine()) != null){
                System.out.println(string);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

