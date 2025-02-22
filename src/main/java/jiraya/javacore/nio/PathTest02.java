package jiraya.javacore.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path directory = Paths.get("directory");
        if (Files.notExists(directory)) {
            Path fileDirectory = Files.createDirectory(directory);
        }

        Path folders = Paths.get("folder1/folder2/folder3");
        Path folders1 = Files.createDirectories(folders);

        Path filePath = Paths.get(folders.toString(), "file.txt");
        if (Files.notExists(filePath)) {
            Path filePathCreated = Files.createFile(filePath);
        }

    }
}
