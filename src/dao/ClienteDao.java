package dao;
import interfaces.ClienteInterface;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.ClientesModelo;
public class ClienteDao implements ClienteInterface{
    private ConexionMarvin conex =new ConexionMarvin();
    private PreparedStatement ejecutarSql;
    private String codigoSql;
    private String mensaje;
    private ArrayList<ClientesModelo> lista = new ArrayList();
    ResultSet resultadoSelect;
    private int cantidadRegistros;
    @Override
    public String insertarCliente(ClientesModelo cliente) {
        try{
            conex.abrirConexion();
            codigoSql="insert into cliente values(?,?,?,?,?,?)";
            ejecutarSql=conex.getMiConexion().prepareStatement(codigoSql);
            ejecutarSql.setString(1, cliente.getCliente_id());
            ejecutarSql.setString(2, cliente.getNombre());
            ejecutarSql.setString(3, cliente.getApellido());
            ejecutarSql.setInt(4, cliente.getTelefono());
            ejecutarSql.setString(5, cliente.getDireccion());
            ejecutarSql.setString(6, cliente.getCorreo_electronico());
            cantidadRegistros=ejecutarSql.executeUpdate();
            mensaje=cantidadRegistros+" Registro agregado con éxito";
        }
        catch(SQLException ex){
            mensaje="error al ingresar cliente"+ex;
            System.out.println(mensaje);
        }
        finally{
            conex.cerrarConexion();
        }
        return mensaje;
    }

    @Override
    public String modificarCliente(ClientesModelo cliente) {
        try{
            conex.abrirConexion();
            codigoSql="update cliente set nombre=?, apellido=?, telefono=?, direccion=?, correo_electronico=? where cliente_id=?";
            ejecutarSql=conex.getMiConexion().prepareStatement(codigoSql);
            ejecutarSql.setString(1, cliente.getNombre());
            ejecutarSql.setString(2, cliente.getApellido());
            ejecutarSql.setInt(3, cliente.getTelefono());
            ejecutarSql.setString(4, cliente.getDireccion());
            ejecutarSql.setString(5, cliente.getCorreo_electronico());
            ejecutarSql.setString(6, cliente.getCliente_id());
            cantidadRegistros=ejecutarSql.executeUpdate();
            mensaje=cantidadRegistros+" Cliente modificado con exito";
        }
        catch(SQLException ex){
            mensaje="error al modificar cliente"+ex;
            System.out.println(mensaje);
        }
        finally{
            conex.cerrarConexion();
        }
        return mensaje;
    }

    @Override
    public String buscarCliente(ClientesModelo cliente) {
        try{
            conex.abrirConexion();
            codigoSql="select * from clientes where cliente_id=?";
            ejecutarSql=conex.getMiConexion().prepareStatement(codigoSql);
            ejecutarSql.setString(1, cliente.getCliente_id());
            resultadoSelect=ejecutarSql.executeQuery();
            resultadoSelect.next();
            cliente.setCliente_id(resultadoSelect.getString("cliente_id"));
            cliente.setNombre(resultadoSelect.getString("nombre"));
            cliente.setApellido(resultadoSelect.getString("apellido"));
            cliente.setTelefono(resultadoSelect.getInt("telefono"));
            cliente.setDireccion(resultadoSelect.getString("direccion"));
            cliente.setCorreo_electronico(resultadoSelect.getString("correo_electronico"));
            cantidadRegistros=ejecutarSql.executeUpdate();
            mensaje=cantidadRegistros+" Cliente encotrado con exito";
        }
        catch(SQLException ex){
            mensaje="error al encontrar cliente"+ex;
            System.out.println(mensaje);
        }
        finally{
            conex.cerrarConexion();
        }
        return mensaje;
    }

    @Override
    public String eliminarCliente(ClientesModelo cliente) {
        try{
            conex.abrirConexion();
            codigoSql="delete from cliente where cliente_id=?";
            ejecutarSql=conex.getMiConexion().prepareStatement(codigoSql);
            ejecutarSql.setString(1, cliente.getCliente_id());
            cantidadRegistros=ejecutarSql.executeUpdate();
            mensaje=cantidadRegistros+" Cliente eliminado con exito";
        }
        catch(SQLException ex){
            mensaje="error al eliminar cliente"+ex;
            System.out.println(mensaje);
        }
        finally{
            conex.cerrarConexion();
        }
        return mensaje;
    }

    @Override
    public ArrayList<ClientesModelo> mostrarCliente() {
        try{
            conex.abrirConexion();
            codigoSql="select * from cliente";
            ejecutarSql=conex.getMiConexion().prepareStatement(codigoSql);
            resultadoSelect=ejecutarSql.executeQuery();
            while(resultadoSelect.next()){
                ClientesModelo cliente= new ClientesModelo();
                cliente.setCliente_id(resultadoSelect.getString("cliente_id"));
                cliente.setNombre(resultadoSelect.getString("nombre"));
                cliente.setApellido(resultadoSelect.getString("apellido"));
                cliente.setTelefono(resultadoSelect.getInt("telefono"));
                cliente.setDireccion(resultadoSelect.getString("direccion"));
                cliente.setCorreo_electronico(resultadoSelect.getString("correo_electronico"));
                lista.add(cliente);
            }
        }
        catch(SQLException ex){
            mensaje="error al mostrar cliente"+ex;
            System.out.println(mensaje);
        }
        finally{
            conex.cerrarConexion();
        }
        return lista;
    }
    
}
