package jiraya.javacore.exception.error;

public class StackOverFlow01 {
    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade() {
        recursividade();
    }
}
