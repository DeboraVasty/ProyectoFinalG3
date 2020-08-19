package dao;

import java.sql.SQLException;

public class Conexion {
    public static void main(String[] args) {
        try {
            ConexionMarvin conexion = new ConexionMarvin();
            conexion.abrirConexion();
        } catch (SQLException ex) {
            System.out.println("error en conexion"+ex);//Logger.getLogger(PruebasMarvin.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
}
