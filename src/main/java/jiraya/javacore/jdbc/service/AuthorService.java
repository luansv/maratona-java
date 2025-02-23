package jiraya.javacore.jdbc.service;

import jiraya.javacore.jdbc.domain.Author;
import jiraya.javacore.jdbc.repository.AuthorRepository;

public class AuthorService {
    public static void save(Author author){
        AuthorRepository.save(author);
    }

    public static void delete(int id){
        if (id <= 0){
            throw new IllegalArgumentException("Invalid number for id");
        }
        AuthorRepository.delete(id);
    }
}
