package dao;
import interfaces.FacturaInterface;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.FacturaModelo;
public class FacturaDao implements FacturaInterface{
    private ConexionMarvin conex =new ConexionMarvin();
    private PreparedStatement ejecutarSql;
    private String codigoSql;
    private String mensaje;
    private ArrayList<FacturaModelo> lista = new ArrayList();
    ResultSet resultadoSelect;
    private int cantidadRegistros;

    @Override
    public String insertarFactura(FacturaModelo factura) {
        try{
            conex.abrirConexion();
            codigoSql="insert into factura values(?,?,?,?,?,?,?,?,?,?)";
            ejecutarSql=conex.getMiConexion().prepareStatement(codigoSql);
            ejecutarSql.setString(1, factura.getCorrelativo_factura());
            ejecutarSql.setInt(2, factura.getNo_factura());
            ejecutarSql.setInt(3, factura.getSerie());
            ejecutarSql.setString(4, factura.getFecha());
            ejecutarSql.setInt(5, factura.getNit());
            ejecutarSql.setString(6, factura.getNombre());
            ejecutarSql.setString(7, factura.getDireccion());
            ejecutarSql.setDouble(8, factura.getSubtotal());
            ejecutarSql.setDouble(8, factura.getDescuento());
            ejecutarSql.setString(9, factura.getCliente_id());
            cantidadRegistros=ejecutarSql.executeUpdate();
            mensaje=cantidadRegistros+" factura agregada con éxito";
        }
        catch(SQLException ex){
            mensaje="error al ingresar factura"+ex;
            System.out.println(mensaje);
        }
        finally{
            conex.cerrarConexion();
        }
        return mensaje;
    }

    @Override
    public String modificarFactura(FacturaModelo factura) {
        try{
            conex.abrirConexion();
            codigoSql="update factura set no_factura=?, serie=?, fecha=?, nit=?, nombre=?, direccion=?, subtotal=?, descuento=?, cliente_id=? where correlativo_factura=?";
            ejecutarSql=conex.getMiConexion().prepareStatement(codigoSql);
            ejecutarSql.setInt(1, factura.getNo_factura());
            ejecutarSql.setInt(2, factura.getSerie());
            ejecutarSql.setString(3, factura.getFecha());
            ejecutarSql.setInt(4, factura.getNit());
            ejecutarSql.setString(5, factura.getNombre());
            ejecutarSql.setString(6, factura.getDireccion());
            ejecutarSql.setDouble(7, factura.getSubtotal());
            ejecutarSql.setDouble(8, factura.getDescuento());
            ejecutarSql.setString(9, factura.getCliente_id());
            ejecutarSql.setString(10, factura.getCorrelativo_factura());
            cantidadRegistros=ejecutarSql.executeUpdate();
            mensaje=cantidadRegistros+" factura modificada con exito";
        }
        catch(SQLException ex){
            mensaje="error al modificar factura"+ex;
            System.out.println(mensaje);
        }
        finally{
            conex.cerrarConexion();
        }
        return mensaje;
    }

    @Override
    public String buscarFactura(FacturaModelo factura) {
        try{
            conex.abrirConexion();
            codigoSql="select * from factura where correlativo_factura=?";
            ejecutarSql=conex.getMiConexion().prepareStatement(codigoSql);
            ejecutarSql.setString(1, factura.getCorrelativo_factura());
            resultadoSelect=ejecutarSql.executeQuery();
            resultadoSelect.next();
            factura.setCorrelativo_factura(resultadoSelect.getString("correlativo_factura"));
            factura.setNo_factura(resultadoSelect.getInt("no_factura"));
            factura.setSerie(resultadoSelect.getInt("serie"));
            factura.setFecha(resultadoSelect.getString("fecha"));
            factura.setNit(resultadoSelect.getInt("nit"));
            factura.setNombre(resultadoSelect.getString("nombre"));
            factura.setDireccion(resultadoSelect.getString("direccion"));
            factura.setSubtotal(resultadoSelect.getDouble("subtotal"));
            factura.setDescuento(resultadoSelect.getDouble("descuento"));
            factura.setCliente_id(resultadoSelect.getString("cliente_id"));
            cantidadRegistros=ejecutarSql.executeUpdate();
            mensaje=cantidadRegistros+" factura encotrada con exito";
        }
        catch(SQLException ex){
            mensaje="error al encontrar factura"+ex;
            System.out.println(mensaje);
        }
        finally{
            conex.cerrarConexion();
        }
        return mensaje;
    }

    @Override
    public String eliminarFactura(FacturaModelo factura) {
        try{
            conex.abrirConexion();
            codigoSql="delete from factura where correlativo_factura=?";
            ejecutarSql=conex.getMiConexion().prepareStatement(codigoSql);
            ejecutarSql.setString(1, factura.getCorrelativo_factura());
            cantidadRegistros=ejecutarSql.executeUpdate();
            mensaje=cantidadRegistros+" factura eliminada con exito";
        }
        catch(SQLException ex){
            mensaje="error al eliminar factura"+ex;
            System.out.println(mensaje);
        }
        finally{
            conex.cerrarConexion();
        }
         return mensaje;
    }

    @Override
    public ArrayList<FacturaModelo> mostrarFactura() {
        try{
            conex.abrirConexion();
            codigoSql="select * from factura";
            ejecutarSql=conex.getMiConexion().prepareStatement(codigoSql);
            resultadoSelect=ejecutarSql.executeQuery();
            while(resultadoSelect.next()){
                FacturaModelo factura= new FacturaModelo();
                factura.setCorrelativo_factura(resultadoSelect.getString("correlativo_factura"));
                factura.setNo_factura(resultadoSelect.getInt("no_factura"));
                factura.setSerie(resultadoSelect.getInt("serie"));
                factura.setFecha(resultadoSelect.getString("fecha"));
                factura.setNit(resultadoSelect.getInt("nit"));
                factura.setNombre(resultadoSelect.getString("nombre"));
                factura.setDireccion(resultadoSelect.getString("direccion"));
                factura.setSubtotal(resultadoSelect.getDouble("subtotal"));
                factura.setDescuento(resultadoSelect.getDouble("descuento"));
                factura.setCliente_id(resultadoSelect.getString("cliente_id"));
                lista.add(factura);
            }
        }
        catch(SQLException ex){
            mensaje="error al mostrar factura"+ex;
            System.out.println(mensaje);
        }
        finally{
            conex.cerrarConexion();
        }
        return lista;
    }
    
}
