package modelo;
public class ProductosModelo {
   private String producto_id;
   private String nombre;
   private double precio_venta;
   private int cantidad;
   private String tipo_producto_id;

    public ProductosModelo() {
    }
    
    public ProductosModelo(String producto_id, String nombre, double precio_venta, int cantidad, String tipo_producto_id) {
        this.producto_id = producto_id;
        this.nombre = nombre;
        this.precio_venta = precio_venta;
        this.cantidad = cantidad;
        this.tipo_producto_id = tipo_producto_id;
    }

    public String getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(String producto_id) {
        this.producto_id = producto_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipo_producto_id() {
        return tipo_producto_id;
    }

    public void setTipo_producto_id(String tipo_producto_id) {
        this.tipo_producto_id = tipo_producto_id;
    }
   
}
