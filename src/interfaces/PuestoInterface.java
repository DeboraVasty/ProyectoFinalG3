package interfaces;
import java.util.ArrayList;
import modelo.PuestosModelo;
public interface PuestoInterface {
    public String insertarPuesto(PuestosModelo puesto);
    public String modificarPuesto(PuestosModelo puesto);
    public String buscarPuesto(PuestosModelo puesto);
    public String eliminarPuesto(PuestosModelo puesto);
    public ArrayList<PuestosModelo> mostrarPuesto();
}
