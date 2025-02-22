package jiraya.javacore.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path path1 = Paths.get("C:\\Users\\luans\\IdeaProjects\\maratona-java\\file.txt");
        System.out.println(path1.getFileName());
    }
}
