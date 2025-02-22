package jiraya.javacore.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest03 {
    public static void main(String[] args) {
        Path dir = Paths.get("folder1/folder2");
        Path file = Paths.get("folder3/file.txt");
        Path resolve = dir.resolve(file);
        System.out.println(resolve);

        Path absolute = Paths.get("/folder/folder2");
        Path relative = Paths.get("folder3");
        Path files = Paths.get("file.txt");

        System.out.println("1 "+absolute.resolve(relative));
        System.out.println("2 "+absolute.resolve(files));
        System.out.println("3 "+relative.resolve(absolute));
        System.out.println("4 "+relative.resolve(files));

    }
}
