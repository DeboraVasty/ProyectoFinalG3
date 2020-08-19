package dao;
import interfaces.TiposProductosInterface;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.TiposProductosModelo;
public class TipoProductoDao implements TiposProductosInterface{
    private ConexionMarvin conex =new ConexionMarvin();
    private PreparedStatement ejecutarSql;
    private String codigoSql;
    private String mensaje;
    private ArrayList<TiposProductosModelo> lista = new ArrayList();
    ResultSet resultadoSelect;
    private int cantidadRegistros;

    @Override
    public String insertarTipoProducto(TiposProductosModelo tipoProducto) {
        try{
            conex.abrirConexion();
            codigoSql="insert into tipos_productos values(?,?,?)";
            ejecutarSql=conex.getMiConexion().prepareStatement(codigoSql);
            ejecutarSql.setString(1, tipoProducto.getTipo_producto_id());
            ejecutarSql.setString(2, tipoProducto.getNombre());
            ejecutarSql.setString(3, tipoProducto.getDescripcion());
            cantidadRegistros=ejecutarSql.executeUpdate();
            mensaje=cantidadRegistros+" Tipo Producto agregado con éxito";
        }
        catch(SQLException ex){
            mensaje="error al ingresar tipo producto"+ex;
            System.out.println(mensaje);
        }
        finally{
            conex.cerrarConexion();
        }
        return mensaje;
    }

    @Override
    public String modificarTipoProducto(TiposProductosModelo tipoProducto) {
        try{
            conex.abrirConexion();
            codigoSql="update tipo_producto set nombre=?, descripcion=? where tipo_producto_id=?";
            ejecutarSql=conex.getMiConexion().prepareStatement(codigoSql);
            ejecutarSql.setString(1, tipoProducto.getNombre());
            ejecutarSql.setString(2, tipoProducto.getDescripcion());
            ejecutarSql.setString(3, tipoProducto.getTipo_producto_id());
            cantidadRegistros=ejecutarSql.executeUpdate();
            mensaje=cantidadRegistros+" Tipo producto modificado con exito";
        }
        catch(SQLException ex){
            mensaje="error al modificar tipo producto"+ex;
            System.out.println(mensaje);
        }
        finally{
            conex.cerrarConexion();
        }
        return mensaje;
    }

    @Override
    public String buscarTipoProducto(TiposProductosModelo tipoProducto) {
        try{
            conex.abrirConexion();
            codigoSql="select * from tipos_productos where tipo_producto_id=?";
            ejecutarSql=conex.getMiConexion().prepareStatement(codigoSql);
            ejecutarSql.setString(1, tipoProducto.getTipo_producto_id());
            resultadoSelect=ejecutarSql.executeQuery();
            resultadoSelect.next();
            tipoProducto.setTipo_producto_id(resultadoSelect.getString("tipo_producto_id"));
            tipoProducto.setNombre(resultadoSelect.getString("nombre"));
            tipoProducto.setDescripcion(resultadoSelect.getString("descripcion"));
            cantidadRegistros=ejecutarSql.executeUpdate();
            mensaje=cantidadRegistros+" Tipo producto encotrado con exito";
        }
        catch(SQLException ex){
            mensaje="error al encontrar tipo producto"+ex;
            System.out.println(mensaje);
        }
        finally{
            conex.cerrarConexion();
        }
        return mensaje;
    }

    @Override
    public String eliminarTipoProducto(TiposProductosModelo tipoProducto) {
        try{
            conex.abrirConexion();
            codigoSql="delete from tipos_productos where tipo_producto_id=?";
            ejecutarSql=conex.getMiConexion().prepareStatement(codigoSql);
            ejecutarSql.setString(1, tipoProducto.getTipo_producto_id());
            cantidadRegistros=ejecutarSql.executeUpdate();
            mensaje=cantidadRegistros+" Tipo producto eliminado con exito";
        }
        catch(SQLException ex){
            mensaje="error al eliminar tipo producto"+ex;
            System.out.println(mensaje);
        }
        finally{
            conex.cerrarConexion();
        }
        return mensaje;
    }

    @Override
    public ArrayList<TiposProductosModelo> mostrarTipoProducto() {
        try{
            conex.abrirConexion();
            codigoSql="select * from tipos_productos";
            ejecutarSql=conex.getMiConexion().prepareStatement(codigoSql);
            resultadoSelect=ejecutarSql.executeQuery();
            while(resultadoSelect.next()){
                TiposProductosModelo tipoProducto= new TiposProductosModelo();
                tipoProducto.setTipo_producto_id(resultadoSelect.getString("tipo_producto_id"));
                tipoProducto.setNombre(resultadoSelect.getString("nombre"));
                tipoProducto.setDescripcion(resultadoSelect.getString("descripcion"));
                lista.add(tipoProducto);
            }
        }
        catch(SQLException ex){
            mensaje="error al mostrar tipo producto"+ex;
            System.out.println(mensaje);
        }
        finally{
            conex.cerrarConexion();
        }
        return lista;
    }
    
}
