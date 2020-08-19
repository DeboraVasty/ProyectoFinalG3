package interfaces;
import java.util.ArrayList;
import modelo.ClientesModelo;
public interface ClienteInterface {
    public String insertarCliente(ClientesModelo cliente);
    public String modificarCliente(ClientesModelo cliente);
    public String buscarCliente(ClientesModelo cliente);
    public String eliminarCliente(ClientesModelo cliente);
    public ArrayList<ClientesModelo> mostrarCliente();
}
