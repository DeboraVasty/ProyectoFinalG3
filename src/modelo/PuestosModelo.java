package modelo;
public class PuestosModelo {
    private String puesto_id;
    private String nombre;
    private String direccion;

    public PuestosModelo() {
    }

    public PuestosModelo(String puesto_id, String nombre, String direccion) {
        this.puesto_id = puesto_id;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getPuesto_id() {
        return puesto_id;
    }

    public void setPuesto_id(String puesto_id) {
        this.puesto_id = puesto_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
