package jiraya.javacore.poo.construtores.test;

import jiraya.javacore.poo.construtores.domain.Book;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("O hobbit", 235, 1987, "Fantasia");
        book.printBook();
    }
}
