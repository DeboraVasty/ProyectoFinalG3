package dao;
import interfaces.EmpleadoInterface;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.EmpleadosModelo;

public class EmpleadoDaoAzure implements EmpleadoInterface{
    
    private ConexionAzure conex =new ConexionAzure();
  
    private PreparedStatement ejecutarSql;
    private String codigoSql;
    private String mensaje;
    private ArrayList<EmpleadosModelo> lista = new ArrayList();
    ResultSet resultadoSelect;
    private int cantidadRegistros;

    @Override
    public String insertarEmpleado(EmpleadosModelo empleado) {
        try{
            conex.abrirConexion();
            codigoSql="insert into empleados values(?,?,?,?,?,?,?,?)";
            ejecutarSql=conex.getMiConexion().prepareStatement(codigoSql);
            ejecutarSql.setString(1, empleado.getEmpleado_id());
            ejecutarSql.setString(2, empleado.getNombre());
            ejecutarSql.setString(3, empleado.getApellido());
            ejecutarSql.setInt(4, empleado.getTelefono());
            ejecutarSql.setString(5, empleado.getDireccion());
            ejecutarSql.setString(6, empleado.getCorreo());
            ejecutarSql.setString(7, empleado.getPuesto_id());
            ejecutarSql.setString(8, empleado.getContrasenia());
            cantidadRegistros=ejecutarSql.executeUpdate();
            mensaje=cantidadRegistros+" Empleado agregado con éxito";
        }
        catch(SQLException ex){
            mensaje="error al ingresar empleado"+ex;
            System.out.println(mensaje);
        }
        finally{
            conex.cerrarConexion();
        }
        return mensaje;
    }

    @Override
    public String modificarEmpleado(EmpleadosModelo empleado) {
        try{
            conex.abrirConexion();
            codigoSql="update empleados set nombre=?, apellido=?, telefono=?, direccion=?, correo=?, puesto_id=?, contrasenia=? where empleado_id=?";
            ejecutarSql=conex.getMiConexion().prepareStatement(codigoSql);
            ejecutarSql.setString(1, empleado.getNombre());
            ejecutarSql.setString(2, empleado.getApellido());
            ejecutarSql.setInt(3, empleado.getTelefono());
            ejecutarSql.setString(4, empleado.getDireccion());
            ejecutarSql.setString(5, empleado.getCorreo());
            ejecutarSql.setString(6, empleado.getPuesto_id());
            ejecutarSql.setString(7, empleado.getContrasenia());
            ejecutarSql.setString(8, empleado.getEmpleado_id());
            cantidadRegistros=ejecutarSql.executeUpdate();
            mensaje=cantidadRegistros+" Empleado modificado con exito";
        }
        catch(SQLException ex){
            mensaje="error al modificar empleado"+ex;
            System.out.println(mensaje);
        }
        finally{
            conex.cerrarConexion();
        }
        return mensaje;
    }

    @Override
    public String buscarEmpleado(EmpleadosModelo empleado) {
        try{
            conex.abrirConexion();
            codigoSql="select * from empleados where empleado_id=?";
            ejecutarSql=conex.getMiConexion().prepareStatement(codigoSql);
            ejecutarSql.setString(1, empleado.getEmpleado_id());
            resultadoSelect=ejecutarSql.executeQuery();
            resultadoSelect.next();
            empleado.setEmpleado_id(resultadoSelect.getString("empleado_id"));
            empleado.setNombre(resultadoSelect.getString("nombre"));
            empleado.setApellido(resultadoSelect.getString("apellido"));
            empleado.setTelefono(resultadoSelect.getInt("telefono"));
            empleado.setDireccion(resultadoSelect.getString("direccion"));
            empleado.setCorreo(resultadoSelect.getString("correo"));
            empleado.setPuesto_id(resultadoSelect.getString("puesto_id"));
            empleado.setContrasenia(resultadoSelect.getString("contrasenia"));
            cantidadRegistros=ejecutarSql.executeUpdate();
            mensaje=cantidadRegistros+" Empleado encotrado con exito";
        }
        catch(SQLException ex){
            mensaje="error al encontrar empleado"+ex;
            System.out.println(mensaje);
        }
        finally{
            conex.cerrarConexion();
        }
        return mensaje;
    }

    @Override
    public String eliminarEmpleado(EmpleadosModelo empleado) {
        try{
            conex.abrirConexion();
            codigoSql="delete from empleados where cliente_id=?";
            ejecutarSql=conex.getMiConexion().prepareStatement(codigoSql);
            ejecutarSql.setString(1, empleado.getEmpleado_id());
            cantidadRegistros=ejecutarSql.executeUpdate();
            mensaje=cantidadRegistros+" Empleado eliminado con exito";
        }
        catch(SQLException ex){
            mensaje="error al eliminar empleado"+ex;
            System.out.println(mensaje);
        }
        finally{
            conex.cerrarConexion();
        }
        return mensaje;
    }

    @Override
    public ArrayList<EmpleadosModelo> mostrarEmpleado() {
        try{
            conex.abrirConexion();
            codigoSql="select * from empleados";
            ejecutarSql=conex.getMiConexion().prepareStatement(codigoSql);
            resultadoSelect=ejecutarSql.executeQuery();
            int contar = 0;
            while(resultadoSelect.next()){
                EmpleadosModelo empleado= new EmpleadosModelo();
                empleado.setEmpleado_id(resultadoSelect.getString("empleado_id"));
                empleado.setNombre(resultadoSelect.getString("nombre"));
                empleado.setApellido(resultadoSelect.getString("apellido"));
                empleado.setTelefono(resultadoSelect.getInt("telefono"));
                empleado.setDireccion(resultadoSelect.getString("direccion"));
                empleado.setCorreo(resultadoSelect.getString("correo"));
                empleado.setPuesto_id(resultadoSelect.getString("puesto_id"));
                empleado.setContrasenia(resultadoSelect.getString("contrasenia"));
                lista.add(empleado);
                contar++;
                System.out.println(contar);
                System.out.println("apellido:  "  + empleado.getApellido());
                System.out.println("nombre: " + empleado.getNombre());
            }
        }
        catch(SQLException ex){
            mensaje="error al mostrar empleado"+ex;
            System.out.println(mensaje);
        }
        finally{
            conex.cerrarConexion();
        }
        return lista;
    }
    
}
