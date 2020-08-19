package modelo;
public class OfertasModelo {
    private String oferta_id;
    private String nombre;
    private String fecha_inicio;
    private String fecha_Fin;

    public OfertasModelo() {
    }

    public OfertasModelo(String oferta_id, String nombre, String fecha_inicio, String fecha_Fin) {
        this.oferta_id = oferta_id;
        this.nombre = nombre;
        this.fecha_inicio = fecha_inicio;
        this.fecha_Fin = fecha_Fin;
    }

    public String getOferta_id() {
        return oferta_id;
    }

    public void setOferta_id(String oferta_id) {
        this.oferta_id = oferta_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_Fin() {
        return fecha_Fin;
    }

    public void setFecha_Fin(String fecha_Fin) {
        this.fecha_Fin = fecha_Fin;
    }
    
}
