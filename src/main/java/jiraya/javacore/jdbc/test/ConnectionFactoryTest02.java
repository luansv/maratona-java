package jiraya.javacore.jdbc.test;

import jiraya.javacore.jdbc.domain.Author;
import jiraya.javacore.jdbc.repository.AuthorRepositoryRowSet;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest02 {
    public static void main(String[] args) {
        Author authorToUpdate = new Author.AuthorBuilder().id(1).name("Kafta").build();
        AuthorRepositoryRowSet.updateJdbcRowSet(authorToUpdate);
        System.out.println("----------------");
        List<Author> authors = AuthorRepositoryRowSet.findByNameJdbcRowSet("");
        for (Author author : authors) {
            System.out.println(author);
        }

    }
}
