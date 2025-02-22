package jiraya.javacore.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * This program demonstrates the usage of the "Path" and `Paths` classes from the `java.nio.file` package.
 * It showcases how to use the `relativize` method to compute the relative path between two `Path` objects.
 */

public class RelativeTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/folder1/folder2");
        Path clazz = Paths.get("/folder1/folder2/computer/computer2/hello.java");
        Path normalize = dir.relativize(clazz);
        System.out.println(normalize);

        Path absolute1 = Paths.get("/folder1/folder2");
        Path absolute2 = Paths.get("/user/local");
        Path absolute3 = Paths.get("/folder1/folder2/computer/computer2/hello.java");
        Path relative1 = Paths.get("temp");
        Path relative2 = Paths.get("temp/tempo.2021921");

        System.out.println("1: "+absolute1.relativize(absolute3));
        System.out.println("2: "+absolute3.relativize(absolute1));
        System.out.println("3: "+absolute1.relativize(absolute2));
        System.out.println("4: "+relative1.relativize(relative2));
    }
}
