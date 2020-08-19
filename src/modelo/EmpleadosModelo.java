package modelo;
public class EmpleadosModelo {
    private String empleado_id;
    private String nombre;
    private String apellido;
    private int telefono;
    private String direccion;
    private String correo;
    private String puesto_id;
    private String contrasenia;

    public EmpleadosModelo() {
    }

    public EmpleadosModelo(String empleado_id, String nombre, String apellido, int telefono, String direccion, String correo, String puesto_id, String contrasenia) {
        this.empleado_id = empleado_id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.puesto_id = puesto_id;
        this.contrasenia = contrasenia;
    }

    public String getEmpleado_id() {
        return empleado_id;
    }

    public void setEmpleado_id(String empleado_id) {
        this.empleado_id = empleado_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPuesto_id() {
        return puesto_id;
    }

    public void setPuesto_id(String puesto_id) {
        this.puesto_id = puesto_id;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
}
