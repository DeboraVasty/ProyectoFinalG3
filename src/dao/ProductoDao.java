package dao;
import interfaces.ProductoInterface;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.ProductosModelo;
public class ProductoDao implements ProductoInterface{
    private ConexionMarvin conex = new ConexionMarvin();
    private PreparedStatement ejecutarSql;
    private String codigoSql;
    private String mensaje;
    ResultSet resultadoSelect;
    private int cantidadRegistros;
    private ArrayList<ProductosModelo> lista = new ArrayList();
    @Override
    public String insertarProducto(ProductosModelo producto) {
        try{
            conex.abrirConexion();
            codigoSql="insert into producto values(?,?,?,?,?)";
            ejecutarSql=conex.getMiConexion().prepareStatement(codigoSql);
            ejecutarSql.setString(1, producto.getProducto_id());
            ejecutarSql.setString(2, producto.getNombre());
            ejecutarSql.setDouble(3, producto.getPrecio_venta());
            ejecutarSql.setInt(4, producto.getCantidad());
            ejecutarSql.setString(5, producto.getTipo_producto_id());
            cantidadRegistros=ejecutarSql.executeUpdate();
            mensaje=cantidadRegistros+" Producto agregado con éxito";
        }catch(SQLException ex){
            mensaje="error al ingresar producto"+ex;
            System.out.println(mensaje);
        }finally{
            conex.cerrarConexion();
        }
        return mensaje;
    }

    @Override
    public String modificarProducto(ProductosModelo producto) {
        try{
            conex.abrirConexion();
            codigoSql="update producto set nombre=?, precio_venta=?, cantidad=?, tipo_producto=? where producto_id=?";
            ejecutarSql=conex.getMiConexion().prepareStatement(codigoSql);
            ejecutarSql.setString(1, producto.getNombre());
            ejecutarSql.setDouble(2, producto.getPrecio_venta());
            ejecutarSql.setInt(3, producto.getCantidad());
            ejecutarSql.setString(4, producto.getTipo_producto_id());
            ejecutarSql.setString(5, producto.getProducto_id());
            cantidadRegistros=ejecutarSql.executeUpdate();
            mensaje=cantidadRegistros+" Producto modificado con exito";
        }catch(SQLException ex){
            mensaje="error al modificar producto"+ex;
            System.out.println(mensaje);
        }finally{
            conex.cerrarConexion();
        }
        return mensaje;
    }

    @Override
    public String buscarProducto(ProductosModelo producto) {
        try{
            conex.abrirConexion();
            codigoSql="select * from producto where producto_id=?";
            ejecutarSql=conex.getMiConexion().prepareStatement(codigoSql);
            ejecutarSql.setString(1, producto.getProducto_id());
            resultadoSelect=ejecutarSql.executeQuery();
            resultadoSelect.next();
            producto.setProducto_id(resultadoSelect.getString("producto_id"));
            producto.setNombre(resultadoSelect.getString("nombre"));
            producto.setPrecio_venta(resultadoSelect.getDouble("precio_venta"));
            producto.setCantidad(resultadoSelect.getInt("cantidad"));
            producto.setTipo_producto_id(resultadoSelect.getString("tipo_producto_id"));
            cantidadRegistros=ejecutarSql.executeUpdate();
            mensaje=cantidadRegistros+" producto encotrado con exito";
        }catch(SQLException ex){
            mensaje="error al buscar producto"+ex;
            System.out.println(mensaje);
        }finally{
            conex.cerrarConexion();
        }
        return mensaje;
    }

    @Override
    public String eliminarProducto(ProductosModelo producto) {
        try{
            conex.abrirConexion();
            codigoSql="delete from producto where producto_id=?";
            ejecutarSql=conex.getMiConexion().prepareStatement(codigoSql);
            ejecutarSql.setString(1, producto.getProducto_id());
            cantidadRegistros=ejecutarSql.executeUpdate();
            mensaje=cantidadRegistros+" Producto eliminado con exito";
        }catch(SQLException ex){
            mensaje="error al eliminar producto"+ex;
            System.out.println(mensaje);
        }finally{
            conex.cerrarConexion();
        }
        return mensaje;
    }

    @Override
    public ArrayList<ProductosModelo> mostrarProducto() {
        try{
            conex.abrirConexion();
            codigoSql="select * from cliente";
            ejecutarSql=conex.getMiConexion().prepareStatement(codigoSql);
            resultadoSelect=ejecutarSql.executeQuery();
            while(resultadoSelect.next()){
                ProductosModelo producto= new ProductosModelo();
                producto.setProducto_id(resultadoSelect.getString("producto_id"));
                producto.setNombre(resultadoSelect.getString("nombre"));
                producto.setPrecio_venta(resultadoSelect.getDouble("precio_venta"));
                producto.setCantidad(resultadoSelect.getInt("cantidad"));
                producto.setTipo_producto_id(resultadoSelect.getString("tipo_producto_id"));
                lista.add(producto);
            }
        }
        catch(SQLException ex){
            mensaje="error al mostrar producto"+ex;
            System.out.println(mensaje);
        }
        finally{
            conex.cerrarConexion();
        }
        return lista;
    }
    
    
}
