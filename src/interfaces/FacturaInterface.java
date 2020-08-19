package interfaces;
import java.util.ArrayList;
import modelo.FacturaModelo;
public interface FacturaInterface {
    public String insertarFactura(FacturaModelo factura);
    public String modificarFactura(FacturaModelo factura);
    public String buscarFactura(FacturaModelo factura);
    public String eliminarFactura(FacturaModelo factura);
    public ArrayList<FacturaModelo> mostrarFactura();
}
