package jiraya.javacore.jdbc.repository;

import jiraya.javacore.jdbc.conn.ConnectionFactory;
import jiraya.javacore.jdbc.domain.Author;
import lombok.extern.log4j.Log4j2;

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
}


