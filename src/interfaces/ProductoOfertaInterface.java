package interfaces;
import java.util.ArrayList;
import modelo.ProductoOfertaModelo;
public interface ProductoOfertaInterface {
    public String insertarProdutoOferta(ProductoOfertaModelo productoOferta);
    public String modificarProductoOferta(ProductoOfertaModelo productoOferta);
    public String buscarProductoOferta(ProductoOfertaModelo productoOferta);
    public String eliminarProductoOferta(ProductoOfertaModelo productoOferta);
    public ArrayList<ProductoOfertaModelo> mostrarProductoOferta();
}
