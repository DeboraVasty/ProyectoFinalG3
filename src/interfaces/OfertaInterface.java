package interfaces;
import java.util.ArrayList;
import modelo.OfertasModelo;
public interface OfertaInterface {
    public String insertarOferta(OfertasModelo oferta);
    public String modificarOferta(OfertasModelo oferta);
    public String buscarOferta(OfertasModelo oferta);
    public String eliminarOfertas(OfertasModelo oferta);
    public ArrayList<OfertasModelo> mostrarOferta();
}
