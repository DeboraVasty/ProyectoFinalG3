/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.EmpleadosModelo;

/**
 *
 * @author admin
 */
public class PruebaConexionAzure {
    public static void main(String[] args) {
        try {
           EmpleadoDaoAzure dao = new EmpleadoDaoAzure();
         
           ArrayList<EmpleadosModelo>  lista = new ArrayList();
           lista = dao.mostrarEmpleado();
            System.out.println(lista.size());
            for (EmpleadosModelo empleadosModelo : lista) {
                System.out.println(empleadosModelo.getApellido());
            }
           
        } catch (Exception ex) {
            //Logger.getLogger(PruebaConexionAzure.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error en conexion:" + ex);
        }
    }
}
