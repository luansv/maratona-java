package jiraya.javacore.jdbc.test;

import jiraya.javacore.jdbc.conn.ConnectionFactory;
import jiraya.javacore.jdbc.domain.Author;
import jiraya.javacore.jdbc.repository.AuthorRepository;

public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Author author = Author.authorBuilder.builder().name("Graciliano Ramos").build();
        AuthorRepository.save(author);
    }
}
