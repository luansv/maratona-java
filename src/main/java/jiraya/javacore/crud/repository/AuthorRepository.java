package jiraya.javacore.crud.repository;

import jiraya.javacore.crud.conn.ConnectionFactory;
import jiraya.javacore.crud.domain.Author;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class AuthorRepository {
    public static List<Author> findByNameAndPreparedStatement(String name) {
        System.out.println("Finding Author by name");
        List<Author> authors = new ArrayList<>();
        String sql = "select * from author where name like '%s';"
                .formatted("%" + name + "%");

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Author author1 = Author.AuthorBuilder
                        .builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                authors.add(author1);
            }

        } catch (SQLException e) {
            log.error("Error while trying to find author", e);
        }

        return authors;
    }

    private static PreparedStatement createPreparedStatementFindByName(Connection connection, String name) throws SQLException {
        String sql = "SELECT * FROM authors where name like ?;";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, String.format("%%%s%%", name));
        return ps;
    }

    public static void delete(int id) {
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = createPreparedStatementDelete(conn, id)) {
            log.info("Deleted Author '{}' in the database", id);
        } catch (SQLException e) {
            log.error("Error while trying to delete producer '{}' ", id, e);
        }
    }

    private static PreparedStatement createPreparedStatementDelete(Connection connection, Integer id) throws SQLException {
        String sql = "DELETE FROM `book_store`.`author` WHERE (`id` = '%d');";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }
}
