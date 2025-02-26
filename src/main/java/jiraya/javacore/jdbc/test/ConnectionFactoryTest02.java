package jiraya.javacore.jdbc.test;

import jiraya.javacore.jdbc.domain.Author;
import jiraya.javacore.jdbc.repository.AuthorRepositoryRowSet;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest02 {
    public static void main(String[] args) {
        List<Author> java = AuthorRepositoryRowSet.findByNameJdbcRowSet("Java");
        log.info(java);
    }
}
