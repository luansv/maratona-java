package jiraya.javacore.jdbc.service;

import jiraya.javacore.jdbc.domain.Author;
import jiraya.javacore.jdbc.repository.AuthorRepositoryRowSet;

import java.util.List;

public class AuthorServiceRowSet {
    public static List<Author> findByNameJdbcRowSet(String name) {
        return AuthorRepositoryRowSet.findByNameJdbcRowSet(name);
    }
}
