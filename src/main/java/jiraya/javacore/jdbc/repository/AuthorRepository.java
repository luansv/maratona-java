package jiraya.javacore.jdbc.repository;

import com.mysql.cj.log.Log;
import jiraya.javacore.jdbc.conn.ConnectionFactory;
import jiraya.javacore.jdbc.domain.Author;
import lombok.extern.log4j.Log4j2;

import java.net.IDN;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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

    public static List<Author> findAll() {
        log.info("Finding all Authors");
        return findByName("");
    }

    public static List<Author> findByName(String name) {
        List<Author> authors = new ArrayList<>();

        log.info("Finding all Authors");
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

    public static void showAuthorMetaData() {
        System.out.println("Showing Author Metadata");
        String sql = "select * from author";

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            ResultSetMetaData rsMetaData = rs.getMetaData();
            int columnCount = rsMetaData.getColumnCount();
            log.info("Columns count '{}' ", columnCount);
            System.out.println("Columns count: " + columnCount);

            for (int i = 1; i < columnCount; i++) {
                log.info("Table name '{}'", rsMetaData.getTableName(i));
                System.out.println("Table name: " + rsMetaData.getTableName(i));
                System.out.println("Table type: " + rsMetaData.getColumnType(i));
                System.out.println("Table size: " + rsMetaData.getColumnDisplaySize(i));
                System.out.println("Table size: " + rsMetaData.getColumnClassName(i));
            }


        } catch (SQLException e) {
            log.error("Error while trying to find author", e);
        }
    }

    public static void showDriverMetadata() {
        System.out.println("Showing Author Metadata");
        try (Connection conn = ConnectionFactory.getConnection()) {
            DatabaseMetaData metaData = conn.getMetaData();
            if (metaData.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
                System.out.println("Supports TYPE_FORWARD_ONLY");
                if (metaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY)) {
                    System.out.println("And supports CONCUR_READ_ONLY");
                }
            }
            if (metaData.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
                System.out.println("Supports TYPE_SCROLL_INSENSITIVE");
                if (metaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)) {
                    System.out.println("And supports CONCUR_READ_ONLY");
                }
            }
            if (metaData.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
                System.out.println("Supports TYPE_SCROLL_SENSITIVE");
                if (metaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY)) {
                    System.out.println("And supports CONCUR_READ_ONLY");
                }
            }
        } catch (SQLException e) {
            log.error("Error while trying to find author", e);
        }
    }

    public static void showTypeScrollWorking() {
        String sql = "select * from author;";

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("First row: " + rs.first());
            System.out.println("Row number: " + rs.getRow());
            System.out.println(Author.AuthorBuilder.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            System.out.println("------------------------");
            System.out.println("Last row: " + rs.last());
            System.out.println("Row number: " + rs.getRow());
            System.out.println(Author.AuthorBuilder.builder().id(rs.getInt("id")).name(rs.getString("name")).build());
            System.out.println("Is last? " + rs.isLast());

            System.out.println("------------------------");
            System.out.println("Row absolute: " + rs.absolute(2));
            System.out.println("Row number: " + rs.getRow());
            System.out.println(Author.AuthorBuilder.builder().id(rs.getInt("id")).name(rs.getString("name")).build());
            System.out.println("Is last? " + rs.isLast());


        } catch (
                SQLException e) {
            log.error("Error while trying to find author", e);
        }
    }

    public static List<Author> findByNameAndUpdateToUpperCase(String name) {
        List<Author> authors = new ArrayList<>();
        String sql = "select * from author where name like '%s';"
                .formatted("%" + name + "%");

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                rs.updateString("name", rs.getString("name").toUpperCase());
                rs.updateRow();
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

    public static List<Author> findByNameAndPreparedStatement(String name) {
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


    public static List<Author> findByNameAndInsertWhenNotFound(String name) {
        List<Author> authors = new ArrayList<>();
        String sql = "select * from author where name like '%s';"
                .formatted("%" + name + "%");

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {
            if (rs.next()) return authors;
            extracted(name, rs);
            authors.add(getProducer(rs));
        } catch (
                SQLException e) {
            log.error("Error while trying to find author", e);
        }

        return authors;
    }

    public static void findByNameAndDelete(String name) {
        List<Author> authors = new ArrayList<>();
        String sql = "select * from author where name like '%s';"
                .formatted("%" + name + "%");

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()){
                System.out.println("Deleting "+rs.getString("name"));
                rs.deleteRow();
            }
        } catch (
                SQLException e) {
            log.error("Error while trying to find author", e);
        }
    }

    private static Author getProducer(ResultSet rs) throws SQLException {
        rs.beforeFirst();
        rs.next();
        return Author.AuthorBuilder.builder().id(rs.getInt("id")).name(rs.getString("name")).build();
    }

    private static void extracted(String name, ResultSet rs) throws SQLException {
        rs.moveToInsertRow();
        rs.updateString("name", name);
        rs.insertRow();
    }
}


