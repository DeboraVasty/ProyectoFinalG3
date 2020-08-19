package modelo;
public class DetalleFacturaModelo {
    private String correlativo_detalle;
    private String producto_id;
    private String oferta_id;
    private int cantidad;
    private double precio;
    private String correlativo_factura;

    public DetalleFacturaModelo() {
    }

    public DetalleFacturaModelo(String correlativo_detalle, String producto_id, String oferta_id, int cantidad, double precio, String correlativo_factura) {
        this.correlativo_detalle = correlativo_detalle;
        this.producto_id = producto_id;
        this.oferta_id = oferta_id;
        this.cantidad = cantidad;
        this.precio = precio;
        this.correlativo_factura = correlativo_factura;
    }

    public String getCorrelativo_detalle() {
        return correlativo_detalle;
    }

    public void setCorrelativo_detalle(String correlativo_detalle) {
        this.correlativo_detalle = correlativo_detalle;
    }

    public String getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(String producto_id) {
        this.producto_id = producto_id;
    }

    public String getOferta_id() {
        return oferta_id;
    }

    public void setOferta_id(String oferta_id) {
        this.oferta_id = oferta_id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCorrelativo_factura() {
        return correlativo_factura;
    }

    public void setCorrelativo_factura(String correlativo_factura) {
        this.correlativo_factura = correlativo_factura;
    }
   
}
