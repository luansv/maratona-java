package jiraya.javacore.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DoFileAttribute {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("folder/test.txt");
        if (Files.notExists(path))Files.createFile(path);

        Files.setAttribute(path, "dos:hidden", true);
        Files.setAttribute(path, "dos:readonly", true);

    }
}
