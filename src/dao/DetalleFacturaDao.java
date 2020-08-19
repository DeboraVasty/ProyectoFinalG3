package dao;
import interfaces.DetalleFacturaInterface;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.DetalleFacturaModelo;
public class DetalleFacturaDao implements DetalleFacturaInterface{
    private ConexionMarvin conex =new ConexionMarvin();
    private PreparedStatement ejecutarSql;
    private String codigoSql;
    private String mensaje;
    private ArrayList<DetalleFacturaModelo> lista = new ArrayList();
    ResultSet resultadoSelect;
    private int cantidadRegistros;

    @Override
    public String insertarDetalleFactura(DetalleFacturaModelo detalleFactura) {
        try{
            conex.abrirConexion();
            codigoSql="insert into detalle_factura values(?,?,?,?,?,?)";
            ejecutarSql=conex.getMiConexion().prepareStatement(codigoSql);
            ejecutarSql.setString(1, detalleFactura.getCorrelativo_detalle());
            ejecutarSql.setString(2, detalleFactura.getProducto_id());
            ejecutarSql.setString(3, detalleFactura.getOferta_id());
            ejecutarSql.setInt(4, detalleFactura.getCantidad());
            ejecutarSql.setDouble(5, detalleFactura.getPrecio());
            ejecutarSql.setString(6, detalleFactura.getCorrelativo_factura());
            cantidadRegistros=ejecutarSql.executeUpdate();
            mensaje=cantidadRegistros+" detalle factura agregado con éxito";
        }
        catch(SQLException ex){
            mensaje="error al ingresar el detalle factura"+ex;
            System.out.println(mensaje);
        }
        finally{
            conex.cerrarConexion();
        }
        return mensaje;
    }

    @Override
    public String modificarDetalleFactura(DetalleFacturaModelo detalleFactura) {
        try{
            conex.abrirConexion();
            codigoSql="update detalle_factura set producto_id=?, oferta_id=?, cantidad=?, precio=?, correlativo_factura=? where correlativo_detalle=?";
            ejecutarSql=conex.getMiConexion().prepareStatement(codigoSql);
            ejecutarSql.setString(1, detalleFactura.getProducto_id());
            ejecutarSql.setString(2, detalleFactura.getOferta_id());
            ejecutarSql.setInt(3, detalleFactura.getCantidad());
            ejecutarSql.setDouble(4, detalleFactura.getPrecio());
            ejecutarSql.setString(5, detalleFactura.getCorrelativo_factura());
            ejecutarSql.setString(6, detalleFactura.getCorrelativo_detalle());
            cantidadRegistros=ejecutarSql.executeUpdate();
            mensaje=cantidadRegistros+" Detalle Factura modificado con exito";
        }
        catch(SQLException ex){
            mensaje="error al modificar el detalle factura"+ex;
            System.out.println(mensaje);
        }
        finally{
            conex.cerrarConexion();
        }
        return mensaje;
    }

    @Override
    public String buscarDetalleFactura(DetalleFacturaModelo detalleFactura) {
         try{
            conex.abrirConexion();
            codigoSql="select * from clientes where correlativo_detalle=?";
            ejecutarSql=conex.getMiConexion().prepareStatement(codigoSql);
            ejecutarSql.setString(1, detalleFactura.getCorrelativo_detalle());
            resultadoSelect=ejecutarSql.executeQuery();
            resultadoSelect.next();
            detalleFactura.setCorrelativo_detalle(resultadoSelect.getString("correlactivo_detalle"));
            detalleFactura.setProducto_id(resultadoSelect.getString("producto_id"));
            detalleFactura.setOferta_id(resultadoSelect.getString("oferta_id"));
            detalleFactura.setCantidad(resultadoSelect.getInt("cantidad"));
            detalleFactura.setPrecio(resultadoSelect.getDouble("precio"));
            detalleFactura.setCorrelativo_factura(resultadoSelect.getString("correlativo_factura"));
            cantidadRegistros=ejecutarSql.executeUpdate();
            mensaje=cantidadRegistros+" Detalle Factura encotrado con exito";
        }
        catch(SQLException ex){
            mensaje="error al encontrar detalle factura"+ex;
            System.out.println(mensaje);
        }
        finally{
            conex.cerrarConexion();
        }
        return mensaje;
    }

    @Override
    public String eliminarDetalleFactura(DetalleFacturaModelo detalleFactura) {
        try{
            conex.abrirConexion();
            codigoSql="delete from detalle_factura where correlativo_detalle=?";
            ejecutarSql=conex.getMiConexion().prepareStatement(codigoSql);
            ejecutarSql.setString(1, detalleFactura.getCorrelativo_detalle());
            cantidadRegistros=ejecutarSql.executeUpdate();
            mensaje=cantidadRegistros+" Detalle factura eliminado con exito";
        }
        catch(SQLException ex){
            mensaje="error al eliminar detalle factura"+ex;
            System.out.println(mensaje);
        }
        finally{
            conex.cerrarConexion();
        }
        return mensaje;
    }

    @Override
    public ArrayList<DetalleFacturaModelo> mostrarDetalleFactura() {
        try{
            conex.abrirConexion();
            codigoSql="select * from detalle_factura";
            ejecutarSql=conex.getMiConexion().prepareStatement(codigoSql);
            resultadoSelect=ejecutarSql.executeQuery();
            while(resultadoSelect.next()){
                DetalleFacturaModelo detalleFactura= new DetalleFacturaModelo();
                detalleFactura.setCorrelativo_detalle(resultadoSelect.getString("correlativo_detalle"));
                detalleFactura.setProducto_id(resultadoSelect.getString("producto_id"));
                detalleFactura.setOferta_id(resultadoSelect.getString("oferta_id"));
                detalleFactura.setCantidad(resultadoSelect.getInt("cantidad"));
                detalleFactura.setPrecio(resultadoSelect.getDouble("precio"));
                detalleFactura.setCorrelativo_factura(resultadoSelect.getString("correlativo_factura"));
                lista.add(detalleFactura);
            }
        }
        catch(SQLException ex){
            mensaje="error al mostrar detalle factura"+ex;
            System.out.println(mensaje);
        }
        finally{
            conex.cerrarConexion();
        }
        return lista;
    }
    
}
