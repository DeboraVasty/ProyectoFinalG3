package interfaces;
import java.util.ArrayList;
import modelo.TiposProductosModelo;
public interface TiposProductosInterface {
    public String insertarTipoProducto(TiposProductosModelo tipoProducto);
    public String modificarTipoProducto(TiposProductosModelo tipoProducto);
    public String buscarTipoProducto(TiposProductosModelo tipoProducto);
    public String eliminarTipoProducto(TiposProductosModelo tipoProducto);
    public ArrayList<TiposProductosModelo> mostrarTipoProducto();
}
