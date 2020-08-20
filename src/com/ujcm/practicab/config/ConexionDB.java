package com.ujcm.practicab.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionDB {

    public static Connection con;
    public static final String URL = "jdbc:mysql://localhost:3306/bd_practicab";
    public static final String USER = "root";
    public static final String PASS = "";
    private static final Logger LOGGER = Logger.getGlobal();

    public static Connection Acceso() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException e) {
            LOGGER.log(Level.INFO, "Error de Conexion:{0}", e);
        } finally {
            if (con == null) {
                con.close();
            }
        }
        return con;
    }
}
