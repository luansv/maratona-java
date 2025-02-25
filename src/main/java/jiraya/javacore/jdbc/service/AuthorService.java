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

    public static List<Author> listByName(String name){
        return AuthorRepository.findByName(name);
    }

    public static void showAuthorMetaData(){
        AuthorRepository.showAuthorMetaData();
    }

    public static void showDriverMetaData(){
        AuthorRepository.showDriverMetadata();
    }

    public static void showTypeScrollWorking(){
        AuthorRepository.showTypeScrollWorking();
    }

    public static List<Author> findByNameAndUpdateToUpperCase(String name){
        return AuthorRepository.findByNameAndUpdateToUpperCase("name");
    }

    public static List<Author> findByNameAndInsertWhenNotFound (String name){
        return AuthorRepository.findByNameAndInsertWhenNotFound(name);
    }

    public static void findByNameAndDelete(String name){
        AuthorRepository.findByNameAndDelete(name);
    }




}
