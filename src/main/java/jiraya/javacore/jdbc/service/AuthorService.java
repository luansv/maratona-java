package jiraya.javacore.jdbc.service;

import jiraya.javacore.jdbc.domain.Author;
import jiraya.javacore.jdbc.repository.AuthorRepository;

import java.util.List;

public class AuthorService {
    public static void save(Author author){
        AuthorRepository.save(author);
    }

    public static void delete(int id){
        requiredId(id);
        AuthorRepository.delete(id);
    }

    public static List<Author> listAll(){
        return AuthorRepository.findAll();
    }

    public static void update(Author author){
        requiredId(author.getId());
        AuthorRepository.update(author);
    }

    private static void requiredId(Integer id){
        if (id == null && id <= 0){
            throw new IllegalArgumentException("Invalid number for id");
        }
    }
}
