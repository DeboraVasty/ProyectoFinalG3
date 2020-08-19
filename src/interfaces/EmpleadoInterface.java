package interfaces;
import java.util.ArrayList;
import modelo.EmpleadosModelo;
public interface EmpleadoInterface {
    public String insertarEmpleado(EmpleadosModelo empleado);
    public String modificarEmpleado(EmpleadosModelo empleado);
    public String buscarEmpleado(EmpleadosModelo empleado);
    public String eliminarEmpleado(EmpleadosModelo empleado);
    public ArrayList<EmpleadosModelo> mostrarEmpleado();
}
