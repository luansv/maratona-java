package jiraya.javacore.jdbc.repository;

import jiraya.javacore.jdbc.conn.ConnectionFactory;
import jiraya.javacore.jdbc.domain.Author;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class AuthorRepository {
    public static void save(Author author) {
        String sql = "INSERT INTO `book_store`.`author` (`name`) VALUES ('%s');".formatted(author.getName());
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            System.out.println(rowsAffected);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
