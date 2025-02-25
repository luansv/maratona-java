package jiraya.javacore.jdbc.test;

import jiraya.javacore.jdbc.conn.ConnectionFactory;
import jiraya.javacore.jdbc.domain.Author;
import jiraya.javacore.jdbc.repository.AuthorRepository;
import jiraya.javacore.jdbc.service.AuthorService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Author author = new Author.AuthorBuilder().name("Clarice Lispector").build();
        Author authorToUpdate = new Author.AuthorBuilder().id(1).name("Kafta").build();

        AuthorService.findByNameAndDelete("name");

//        List<Author> whenNotFound = AuthorService.findByNameAndInsertWhenNotFound("Jefesoof Handler");
//        for (Author author1 : whenNotFound) {
//            System.out.println(author1);
//        }

//        List<Author> authors = AuthorService.findByNameAndUpdateToUpperCase("Kafta");
//        for (Author author1 : authors) {
//            System.out.println(author1.getName());
//        }

        //AuthorService.showTypeScrollWorking();
        //AuthorService.showDriverMetaData();
        // AuthorService.showAuthorMetaData();


//        List<Author> authors = AuthorService.listAll();
//        for (Author author1 : authors) {
//            System.out.println(author1);
//        }


//        List<Author> authors = AuthorService.listByName("Kafta");
//        for (Author author1 : authors) {
//            System.out.println(author1);
//        }


        // AuthorService.update(authorToUpdate);
        //List<Author> authors = AuthorService.listAll();
        // log.info(authors);
//        for (Author author1 : authors) {
//            System.out.println(author1);
//        }


        // AuthorService.save(author);


        //        log.info("INFO");
//        log.debug("DEBUG");
//        log.error("error");
//        log.trace("trace");
//        log.warn("warn");
    }
}
