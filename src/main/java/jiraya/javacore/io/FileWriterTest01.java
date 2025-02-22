package jiraya.javacore.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file);) {
            fw.write("Computer Science");
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
