package modelo;
public class TiposProductosModelo {
  private String tipo_producto_id;
  private String nombre;
  private String descripcion;

    public TiposProductosModelo() {
    }

    public TiposProductosModelo(String tipo_producto_id, String nombre, String descripcion) {
        this.tipo_producto_id = tipo_producto_id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getTipo_producto_id() {
        return tipo_producto_id;
    }

    public void setTipo_producto_id(String tipo_producto_id) {
        this.tipo_producto_id = tipo_producto_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
  
}
