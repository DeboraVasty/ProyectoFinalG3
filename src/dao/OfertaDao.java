package dao;
import interfaces.OfertaInterface;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.OfertasModelo;
public class OfertaDao implements OfertaInterface{
    private ConexionMarvin conex =new ConexionMarvin();
    private PreparedStatement ejecutarSql;
    private String codigoSql;
    private String mensaje;
    private ArrayList<OfertasModelo> lista = new ArrayList();
    ResultSet resultadoSelect;
    private int cantidadRegistros;

    @Override
    public String insertarOferta(OfertasModelo oferta) {
        try{
            conex.abrirConexion();
            codigoSql="insert into ofertas values(?,?,?,?)";
            ejecutarSql=conex.getMiConexion().prepareStatement(codigoSql);
            ejecutarSql.setString(1, oferta.getOferta_id());
            ejecutarSql.setString(2, oferta.getNombre());
            ejecutarSql.setString(3, oferta.getFecha_inicio());
            ejecutarSql.setString(4, oferta.getFecha_Fin());
            cantidadRegistros=ejecutarSql.executeUpdate();
            mensaje=cantidadRegistros+" Oferta agregada con éxito";
        }
        catch(SQLException ex){
            mensaje="error al ingresar oferta"+ex;
            System.out.println(mensaje);
        }
        finally{
            conex.cerrarConexion();
        }
        return mensaje;
    }

    @Override
    public String modificarOferta(OfertasModelo oferta) {
        try{
            conex.abrirConexion();
            codigoSql="update ofertas set nombre=?, fecha_inicio=?, fecha_fin=? where oferta_id=?";
            ejecutarSql=conex.getMiConexion().prepareStatement(codigoSql);
            ejecutarSql.setString(1, oferta.getNombre());
            ejecutarSql.setString(2, oferta.getFecha_inicio());
            ejecutarSql.setString(3, oferta.getFecha_Fin());
            ejecutarSql.setString(4, oferta.getOferta_id());
            cantidadRegistros=ejecutarSql.executeUpdate();
            mensaje=cantidadRegistros+" Oferta modificada con exito";
        }
        catch(SQLException ex){
            mensaje="error al modificar Oferta"+ex;
            System.out.println(mensaje);
        }
        finally{
            conex.cerrarConexion();
        }
        return mensaje;
    }

    @Override
    public String buscarOferta(OfertasModelo oferta) {
        try{
            conex.abrirConexion();
            codigoSql="select * from ofertas where oferta_id=?";
            ejecutarSql=conex.getMiConexion().prepareStatement(codigoSql);
            ejecutarSql.setString(1, oferta.getOferta_id());
            resultadoSelect=ejecutarSql.executeQuery();
            resultadoSelect.next();
            oferta.setOferta_id(resultadoSelect.getString("oferta_id"));
            oferta.setNombre(resultadoSelect.getString("nombre"));
            oferta.setFecha_inicio(resultadoSelect.getString("fecha_inicio"));
            oferta.setFecha_Fin(resultadoSelect.getString("fecha_fin"));
            cantidadRegistros=ejecutarSql.executeUpdate();
            mensaje=cantidadRegistros+" oferta encotrada con exito";
        }
        catch(SQLException ex){
            mensaje="error al encontrar oferta"+ex;
            System.out.println(mensaje);
        }
        finally{
            conex.cerrarConexion();
        }
        return mensaje;
    }

    @Override
    public String eliminarOfertas(OfertasModelo oferta) {
        try{
            conex.abrirConexion();
            codigoSql="delete from ofertas where oferta_id=?";
            ejecutarSql=conex.getMiConexion().prepareStatement(codigoSql);
            ejecutarSql.setString(1, oferta.getOferta_id());
            cantidadRegistros=ejecutarSql.executeUpdate();
            mensaje=cantidadRegistros+" Oferta eliminada con exito";
        }
        catch(SQLException ex){
            mensaje="error al eliminar oferta"+ex;
            System.out.println(mensaje);
        }
        finally{
            conex.cerrarConexion();
        }
        return mensaje;
    }

    @Override
    public ArrayList<OfertasModelo> mostrarOferta() {
        try{
            conex.abrirConexion();
            codigoSql="select * from ofertas";
            ejecutarSql=conex.getMiConexion().prepareStatement(codigoSql);
            resultadoSelect=ejecutarSql.executeQuery();
            while(resultadoSelect.next()){
                OfertasModelo oferta= new OfertasModelo();
                oferta.setOferta_id(resultadoSelect.getString("oferta_id"));
                oferta.setNombre(resultadoSelect.getString("nombre"));
                oferta.setFecha_inicio(resultadoSelect.getString("fecha_inicio"));
                oferta.setFecha_Fin(resultadoSelect.getString("fecha_fin"));
                lista.add(oferta);
            }
        }
        catch(SQLException ex){
            mensaje="error al mostrar oferta"+ex;
            System.out.println(mensaje);
        }
        finally{
            conex.cerrarConexion();
        }
        return lista;
    }
    
}
