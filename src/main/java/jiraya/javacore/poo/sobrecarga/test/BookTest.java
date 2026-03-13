package jiraya.javacore.poo.sobrecarga.test;

import jiraya.javacore.poo.sobrecarga.domain.Book;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book();

        System.out.println("--------Construtor----------");


        book.init("Torto Arado", 204, 2017, "Drama");
        book.printBook();

        System.out.println("--------Set/Get-----------");

        book.setName("The remaning days");
        book.setPages(235);
        book.setYear(2003);
        book.setGenre("Fantasia");
        book.printBook();
    }
}
