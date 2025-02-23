package jiraya.javacore.jdbc.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
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
        String password = "Battle19.";
        return DriverManager.getConnection(url, username, password);
    }
}
