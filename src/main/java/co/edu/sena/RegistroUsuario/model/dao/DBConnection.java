package co.edu.sena.RegistroUsuario.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@SuppressWarnings("ALL")
public class DBConnection {

    public static final String USERNAME = "root";
    public static final String PASSWORD = "1234";
    public static final String CONN_STRING = "jdbc:mysql://localhost:3306/ejemplo";

    public static Connection getConnectionToDataBase() {

        //Class.forName("com.mysql.jdbc.Driver");

        Connection conn = null;

        try {

            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);

        } catch (SQLException e) {
            System.out.println("Problemas al establecer la conexión");
            e.printStackTrace();
        }

        if (conn != null){
            System.out.println("Conexión realizada!");
        }


        return conn;
    }

}//fin de clase Main
