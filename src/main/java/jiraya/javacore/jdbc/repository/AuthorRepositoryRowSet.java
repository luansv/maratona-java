package jiraya.javacore.jdbc.repository;

import jiraya.javacore.jdbc.conn.ConnectionFactory;
import jiraya.javacore.jdbc.domain.Author;
import jiraya.javacore.jdbc.listener.CustomRowSetListener;
import lombok.extern.log4j.Log4j2;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class AuthorRepositoryRowSet {
    public static List<Author> findByNameJdbcRowSet(String name){
        String sql = "select * from authors where name like ?;";
        List<Author> authors = new ArrayList<>();
        try(JdbcRowSet jdbcRowSet = ConnectionFactory.getJdbcRowSet()) {
            jdbcRowSet.addRowSetListener(new CustomRowSetListener());
            jdbcRowSet.setCommand(sql);
            jdbcRowSet.setString(1, String.format("%%%s%%", name));
            jdbcRowSet.execute();
            while (jdbcRowSet.next()){
                Author author = Author.AuthorBuilder.builder()
                        .id(jdbcRowSet.getInt("id"))
                        .name(jdbcRowSet.getString("name"))
                        .build();
                authors.add(author);
            }
        }catch (SQLException e){
            throw new IllegalArgumentException();
        }
        return authors;
}

//    public static void updateJdbcRowSet(Author author){
//        String sql = "UPDATE `book_store`.`author` SET `name` = '%s' WHERE (`id` = '%d');";
//        try(JdbcRowSet jdbcRowSet = ConnectionFactory.getJdbcRowSet()) {
//            jdbcRowSet.setCommand(sql);
//            jdbcRowSet.setString(1, author.getName());
//            jdbcRowSet.setInt(2, author.getId());
//            jdbcRowSet.execute();
//
//        }catch (SQLException e){
//            throw new IllegalArgumentException();
//        }
//    }

    public static void updateJdbcRowSet(Author author){
        String sql = "SELECT * FROM authors where ('id' = ?);";
        try(JdbcRowSet jdbcRowSet = ConnectionFactory.getJdbcRowSet()) {
            jdbcRowSet.addRowSetListener(new CustomRowSetListener());
            jdbcRowSet.setCommand(sql);
            jdbcRowSet.setInt(1, author.getId());
            jdbcRowSet.execute();
            if (!jdbcRowSet.next()) return;
            jdbcRowSet.updateString("name", author.getName());
            jdbcRowSet.updateRow();
        }catch (SQLException e){
            throw new IllegalArgumentException();
        }
    }

    public static void updateCachedRowSet(Author author){
        String sql = "SELECT * FROM authors where ('id' = ?);";
        try(CachedRowSet getCachedRowSet = (CachedRowSet) ConnectionFactory.getCachedRowSet()) {
            getCachedRowSet.addRowSetListener(new CustomRowSetListener());
            getCachedRowSet.setCommand(sql);
            getCachedRowSet.setInt(1, author.getId());
            getCachedRowSet.execute();
            if (!getCachedRowSet.next()) return;
            getCachedRowSet.updateString("name", author.getName());
            getCachedRowSet.updateRow();
        }catch (SQLException e){
            throw new IllegalArgumentException();
        }
    }

    public static void update(Author author) {
        String sql = "UPDATE `book_store`.`author` SET `name` = '%s' WHERE (`id` = '%d');"
                .formatted(author.getName(), author.getId());
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Update Author '{}', rows affected '{}' ", author.getId(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to update producer '{}' ", author.getId(), e);
        }
    }


}


