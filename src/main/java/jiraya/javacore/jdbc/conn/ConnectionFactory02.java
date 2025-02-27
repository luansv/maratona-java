package jiraya.javacore.jdbc.conn;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory02 {
    // JDBC (Java Database Connectivity)
// Biblioteca criada para padronizar a conexão com diferentes tipos de bancos de dados.

// Principais classes/interfaces da API JDBC (pacote java.sql):
// - Connection: Representa a conexão com o banco de dados.
// - Statement: Usado para executar comandos SQL.
// - ResultSet: Armazena os resultados de consultas SQL.
// - DriverManager: Gerencia os drivers de conexão com o banco de dados.

// Uso do Maven:
// Se o banco de dados exige um driver específico (como MySQL), é necessário adicionar um conector correspondente.
// Esse conector se torna uma dependência do projeto. Sem ele, o código não consegue se conectar ao banco.

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/book_store"; //muda dependendo do banco de dados
        String username = "root";
        String password = "root";
        return DriverManager.getConnection(url, username, password);
    }

    public static JdbcRowSet getJdbcRowSet() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/book_store"; //muda dependendo do banco de dados
        String username = "root";
        String password = "root";
        JdbcRowSet jdbcRowSet = RowSetProvider.newFactory().createJdbcRowSet();
        getJdbcRowSet().setUrl(url);
        getJdbcRowSet().setUsername(username);
        getJdbcRowSet().setPassword(password);
        return jdbcRowSet;
    }

    public static JdbcRowSet getCachedRowSet() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/book_store"; //muda dependendo do banco de dados
        String username = "root";
        String password = "root";
        CachedRowSet cachedRowSet = RowSetProvider.newFactory().createCachedRowSet();
        getJdbcRowSet().setUrl(url);
        getJdbcRowSet().setUsername(username);
        getJdbcRowSet().setPassword(password);
        return getCachedRowSet();
    }
}
