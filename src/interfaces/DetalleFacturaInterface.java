package interfaces;
import java.util.ArrayList;
import modelo.DetalleFacturaModelo;
public interface DetalleFacturaInterface {
    public String insertarDetalleFactura(DetalleFacturaModelo detalleFactura);
    public String modificarDetalleFactura(DetalleFacturaModelo detalleFactura);
    public String buscarDetalleFactura(DetalleFacturaModelo detalleFactura);
    public String eliminarDetalleFactura(DetalleFacturaModelo detalleFactura);
    public ArrayList<DetalleFacturaModelo> mostrarDetalleFactura();
}
