/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author admin
 */
public class ConexionAzure {

    private Connection miConexion;
    private static final String URL = "jdbc:mysql://mysqlproyectoprueba.mysql.database.azure.com/db_grupo3";
    private static final String USER = "adminpp@mysqlproyectoprueba";
    private static final String PASSWORD = "admin@123";

    public Connection getMiConexion() {
        return miConexion;
    }

    public void setMiConexion(Connection miConexion) {
        this.miConexion = miConexion;
    }

    public void abrirConexion() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            miConexion = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("conexion realizada con exito");

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error en conexion" + ex);
        }
    }

    public void cerrarConexion() {
        try {
            if (miConexion != null) {
                if (miConexion.isClosed() == false) {
                    miConexion.close();
                    System.out.println("Conexion cerrada");
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error al cerrar: " + ex);
        }
    }
}
