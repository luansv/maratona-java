package jiraya.javacore.jdbc.test;

import jiraya.javacore.jdbc.conn.ConnectionFactory;
import jiraya.javacore.jdbc.domain.Author;
import jiraya.javacore.jdbc.repository.AuthorRepository;
import jiraya.javacore.jdbc.service.AuthorService;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Author author = new Author.AuthorBuilder().name("Clarice Lispector").build();
       // AuthorService.save(author);
        AuthorService.delete(0);


        //        log.info("INFO");
//        log.debug("DEBUG");
//        log.error("error");
//        log.trace("trace");
//        log.warn("warn");
    }
}
