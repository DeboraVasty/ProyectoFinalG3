package modelo;
public class ProductoOfertaModelo {
    private String correlativo;
    private String producto_id;
    private String oferta_id;
    private double descuento;
    private String empleado_id;
    private String fecha_ingreso;

    public ProductoOfertaModelo() {
    }

    public ProductoOfertaModelo(String correlativo, String producto_id, String oferta_id, double descuento, String empleado_id, String fecha_ingreso) {
        this.correlativo = correlativo;
        this.producto_id = producto_id;
        this.oferta_id = oferta_id;
        this.descuento = descuento;
        this.empleado_id = empleado_id;
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(String correlativo) {
        this.correlativo = correlativo;
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

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public String getEmpleado_id() {
        return empleado_id;
    }

    public void setEmpleado_id(String empleado_id) {
        this.empleado_id = empleado_id;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }
    
}
