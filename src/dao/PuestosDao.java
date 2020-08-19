package dao;
import interfaces.PuestoInterface;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.PuestosModelo;
public class PuestosDao implements PuestoInterface{
    private ConexionMarvin conex =new ConexionMarvin();
    private PreparedStatement ejecutarSql;
    private String codigoSql;
    private String mensaje;
    private ArrayList<PuestosModelo> lista = new ArrayList();
    ResultSet resultadoSelect;
    private int cantidadRegistros;

    @Override
    public String insertarPuesto(PuestosModelo puesto) {
        try{
            conex.abrirConexion();
            codigoSql="insert into puestos values(?,?,?)";
            ejecutarSql=conex.getMiConexion().prepareStatement(codigoSql);
            ejecutarSql.setString(1, puesto.getPuesto_id());
            ejecutarSql.setString(2, puesto.getNombre());
            ejecutarSql.setString(3, puesto.getDireccion());
            cantidadRegistros=ejecutarSql.executeUpdate();
            mensaje=cantidadRegistros+" Puesto agregado con éxito";
        }
        catch(SQLException ex){
            mensaje="error al ingresar puesto"+ex;
            System.out.println(mensaje);
        }
        finally{
            conex.cerrarConexion();
        }
        return mensaje;
    }

    @Override
    public String modificarPuesto(PuestosModelo puesto) {
        try{
            conex.abrirConexion();
            codigoSql="update puestos set nombre=?, direccion=? where puesto_id=?";
            ejecutarSql=conex.getMiConexion().prepareStatement(codigoSql);
            ejecutarSql.setString(1, puesto.getNombre());
            ejecutarSql.setString(2, puesto.getDireccion());
            ejecutarSql.setString(3, puesto.getPuesto_id());
            cantidadRegistros=ejecutarSql.executeUpdate();
            mensaje=cantidadRegistros+" Puesto modificado con exito";
        }
        catch(SQLException ex){
            mensaje="error al modificar puesto"+ex;
            System.out.println(mensaje);
        }
        finally{
            conex.cerrarConexion();
        }
        return mensaje;
    }

    @Override
    public String buscarPuesto(PuestosModelo puesto) {
        try{
            conex.abrirConexion();
            codigoSql="select * from puestos where puesto_id=?";
            ejecutarSql=conex.getMiConexion().prepareStatement(codigoSql);
            ejecutarSql.setString(1, puesto.getPuesto_id());
            resultadoSelect=ejecutarSql.executeQuery();
            resultadoSelect.next();
            puesto.setPuesto_id(resultadoSelect.getString("puesto_id"));
            puesto.setNombre(resultadoSelect.getString("nombre"));
            puesto.setDireccion(resultadoSelect.getString("direccion"));
            cantidadRegistros=ejecutarSql.executeUpdate();
            mensaje=cantidadRegistros+" puesto encotrado con exito";
        }
        catch(SQLException ex){
            mensaje="error al encontrar puesto"+ex;
            System.out.println(mensaje);
        }
        finally{
            conex.cerrarConexion();
        }
        return mensaje;
    }

    @Override
    public String eliminarPuesto(PuestosModelo puesto) {
        try{
            conex.abrirConexion();
            codigoSql="delete from puestos where puesto_id=?";
            ejecutarSql=conex.getMiConexion().prepareStatement(codigoSql);
            ejecutarSql.setString(1, puesto.getPuesto_id());
            cantidadRegistros=ejecutarSql.executeUpdate();
            mensaje=cantidadRegistros+" puesto eliminado con exito";
        }
        catch(SQLException ex){
            mensaje="error al eliminar puesto"+ex;
            System.out.println(mensaje);
        }
        finally{
            conex.cerrarConexion();
        }
        return mensaje;
    }

    @Override
    public ArrayList<PuestosModelo> mostrarPuesto() {
        try{
            conex.abrirConexion();
            codigoSql="select * from tipos_productos";
            ejecutarSql=conex.getMiConexion().prepareStatement(codigoSql);
            resultadoSelect=ejecutarSql.executeQuery();
            while(resultadoSelect.next()){
                PuestosModelo puesto= new PuestosModelo();
                puesto.setPuesto_id(resultadoSelect.getString("puesto_id"));
                puesto.setNombre(resultadoSelect.getString("nombre"));
                puesto.setDireccion(resultadoSelect.getString("direccion"));
                lista.add(puesto);
            }
        }
        catch(SQLException ex){
            mensaje="error al mostrar puesto"+ex;
            System.out.println(mensaje);
        }
        finally{
            conex.cerrarConexion();
        }
        return lista;
    }
    
}
