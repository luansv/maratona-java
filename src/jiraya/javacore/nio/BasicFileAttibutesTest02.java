package jiraya.javacore.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttibutesTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("folder1/abc.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        FileTime fileTime = basicFileAttributes.creationTime();
        FileTime fileTime1 = basicFileAttributes.lastAccessTime();
        FileTime fileTime2 = basicFileAttributes.lastModifiedTime();

        System.out.println(fileTime);
        System.out.println(fileTime1);
        System.out.println(fileTime2);

    }
}
