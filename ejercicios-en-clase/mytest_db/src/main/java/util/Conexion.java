package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    //JDBC CON SQL SERVER
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=dbtest;encrypt=true;trustServerCertificate=true";
    private static final String USER = "sa";
    private static final String PASSWORD = "1234";

    public static Connection get() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
