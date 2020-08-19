package modelo;
public class FacturaModelo {
    private String correlativo_factura;
    private int no_factura;
    private int serie;
    private String fecha;
    private int nit;
    private String nombre;
    private String direccion;
    private double subtotal;
    private double descuento;
    private String cliente_id;

    public FacturaModelo() {
    }

    public FacturaModelo(String correlativo_factura, int no_factura, int serie, String fecha, int nit, String nombre, String direccion, double subtotal, double descuento, String cliente_id) {
        this.correlativo_factura = correlativo_factura;
        this.no_factura = no_factura;
        this.serie = serie;
        this.fecha = fecha;
        this.nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
        this.subtotal = subtotal;
        this.descuento = descuento;
        this.cliente_id = cliente_id;
    }

    public String getCorrelativo_factura() {
        return correlativo_factura;
    }

    public void setCorrelativo_factura(String correlativo_factura) {
        this.correlativo_factura = correlativo_factura;
    }

    public int getNo_factura() {
        return no_factura;
    }

    public void setNo_factura(int no_factura) {
        this.no_factura = no_factura;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
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

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public String getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(String cliente_id) {
        this.cliente_id = cliente_id;
    }
    
}
