package jiraya.javacore.jdbc.repository;

import com.mysql.cj.log.Log;
import jiraya.javacore.jdbc.conn.ConnectionFactory;
import jiraya.javacore.jdbc.domain.Author;
import lombok.extern.log4j.Log4j2;

import java.net.IDN;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@Log4j2
public class AuthorRepository {
    public static void save(Author author) {
        String sql = "INSERT INTO `book_store`.`author` (`name`) VALUES ('%s');".formatted(author.getName());
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Inserted Author '{}' in the database, rows affected '{}' ", author.getName(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to insert producer '{}' ", author.getName(), e);
        }

    }

    public static void delete(int id) {
        String sql = "DELETE FROM `book_store`.`author` WHERE (`id` = '%d');".formatted(id);
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Deleted Author '{}' in the database, rows affected '{}' ", id, rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to delete producer '{}' ", id, e);
        }

    }
}
