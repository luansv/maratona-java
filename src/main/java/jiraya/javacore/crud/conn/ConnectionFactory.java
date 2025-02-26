package jiraya.javacore.crud.conn;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/book_store"; //muda dependendo do banco de dados
        String username = "root";
        String password = "Battle19.";
        return DriverManager.getConnection(url, username, password);
    }
}
