package interfaces;
import java.util.ArrayList;
import modelo.ProductosModelo;
public interface ProductoInterface {
    public String insertarProducto(ProductosModelo producto);
    public String modificarProducto(ProductosModelo producto);
    public String buscarProducto(ProductosModelo producto);
    public String eliminarProducto(ProductosModelo producto);
    public ArrayList<ProductosModelo> mostrarProducto();
}
