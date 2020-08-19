package dao;
import interfaces.ProductoOfertaInterface;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.ProductoOfertaModelo;
public class ProductoOfertaDao implements ProductoOfertaInterface{
    private ConexionMarvin conex =new ConexionMarvin();
    private PreparedStatement ejecutarSql;
    private String codigoSql;
    private String mensaje;
    private ArrayList<ProductoOfertaModelo> lista = new ArrayList();
    ResultSet resultadoSelect;
    private int cantidadRegistros;

    @Override
    public String insertarProdutoOferta(ProductoOfertaModelo productoOferta) {
        try{
            conex.abrirConexion();
            codigoSql="insert into detalle_factura values(?,?,?,?,?,?)";
            ejecutarSql=conex.getMiConexion().prepareStatement(codigoSql);
            ejecutarSql.setString(1, productoOferta.getCorrelativo());
            ejecutarSql.setString(2, productoOferta.getProducto_id());
            ejecutarSql.setString(3, productoOferta.getOferta_id());
            ejecutarSql.setDouble(4, productoOferta.getDescuento());
            ejecutarSql.setString(5, productoOferta.getEmpleado_id());
            ejecutarSql.setString(6, productoOferta.getFecha_ingreso());
            cantidadRegistros=ejecutarSql.executeUpdate();
            mensaje=cantidadRegistros+" Oferta producto agregado con éxito";
        }
        catch(SQLException ex){
            mensaje="error al ingresar producto oferta"+ex;
            System.out.println(mensaje);
        }
        finally{
            conex.cerrarConexion();
        }
        return mensaje;
    }

    @Override
    public String modificarProductoOferta(ProductoOfertaModelo productoOferta) {
        try{
            conex.abrirConexion();
            codigoSql="update producto_oferta set producto_id=?, oferta_id=?, descuento=?, empleado_id=?, fecha_ingreso=? where correlativo=?";
            ejecutarSql=conex.getMiConexion().prepareStatement(codigoSql);
            ejecutarSql.setString(1, productoOferta.getProducto_id());
            ejecutarSql.setString(2, productoOferta.getOferta_id());
            ejecutarSql.setDouble(3, productoOferta.getDescuento());
            ejecutarSql.setString(4, productoOferta.getEmpleado_id());
            ejecutarSql.setString(5, productoOferta.getFecha_ingreso());
            ejecutarSql.setString(6, productoOferta.getCorrelativo());
            cantidadRegistros=ejecutarSql.executeUpdate();
            mensaje=cantidadRegistros+" Oferta producto modificado con exito";
        }
        catch(SQLException ex){
            mensaje="error al modificar oferta producto"+ex;
            System.out.println(mensaje);
        }
        finally{
            conex.cerrarConexion();
        }
        return mensaje;
    }

    @Override
    public String buscarProductoOferta(ProductoOfertaModelo productoOferta) {
        try{
            conex.abrirConexion();
            codigoSql="select * from producto_oferta where correlativo=?";
            ejecutarSql=conex.getMiConexion().prepareStatement(codigoSql);
            ejecutarSql.setString(1, productoOferta.getCorrelativo());
            resultadoSelect=ejecutarSql.executeQuery();
            resultadoSelect.next();
            productoOferta.setCorrelativo(resultadoSelect.getString("correlactivo"));
            productoOferta.setProducto_id(resultadoSelect.getString("producto_id"));
            productoOferta.setOferta_id(resultadoSelect.getString("oferta_id"));
            productoOferta.setDescuento(resultadoSelect.getDouble("descuento"));
            productoOferta.setEmpleado_id(resultadoSelect.getString("empleado_id"));
            productoOferta.setFecha_ingreso(resultadoSelect.getString("fecha_ingreso"));
            cantidadRegistros=ejecutarSql.executeUpdate();
            mensaje=cantidadRegistros+" producto oferta encotrado con exito";
        }
        catch(SQLException ex){
            mensaje="error al encontrar producto oferta"+ex;
            System.out.println(mensaje);
        }
        finally{
            conex.cerrarConexion();
        }
        return mensaje;
    }

    @Override
    public String eliminarProductoOferta(ProductoOfertaModelo productoOferta) {
        try{
            conex.abrirConexion();
            codigoSql="delete from producto_oferta where correlativo=?";
            ejecutarSql=conex.getMiConexion().prepareStatement(codigoSql);
            ejecutarSql.setString(1, productoOferta.getCorrelativo());
            cantidadRegistros=ejecutarSql.executeUpdate();
            mensaje=cantidadRegistros+" Producto oferta eliminado con exito";
        }
        catch(SQLException ex){
            mensaje="error al eliminar producto oferta"+ex;
            System.out.println(mensaje);
        }
        finally{
            conex.cerrarConexion();
        }
        return mensaje;
    }

    @Override
    public ArrayList<ProductoOfertaModelo> mostrarProductoOferta() {
        try{
            conex.abrirConexion();
            codigoSql="select * from producto_oferta";
            ejecutarSql=conex.getMiConexion().prepareStatement(codigoSql);
            resultadoSelect=ejecutarSql.executeQuery();
            while(resultadoSelect.next()){
                ProductoOfertaModelo productoOferta= new ProductoOfertaModelo();
                productoOferta.setCorrelativo(resultadoSelect.getString("correlativo"));
                productoOferta.setProducto_id(resultadoSelect.getString("producto_id"));
                productoOferta.setOferta_id(resultadoSelect.getString("oferta_id"));
                productoOferta.setDescuento(resultadoSelect.getDouble("descuento"));
                productoOferta.setEmpleado_id(resultadoSelect.getString("empleado_id"));
                productoOferta.setFecha_ingreso(resultadoSelect.getString("fecha_ingreso"));
                lista.add(productoOferta);
            }
        }
        catch(SQLException ex){
            mensaje="error al mostrar producto oferta"+ex;
            System.out.println(mensaje);
        }
        finally{
            conex.cerrarConexion();
        }
        return lista;
    }
    
}
