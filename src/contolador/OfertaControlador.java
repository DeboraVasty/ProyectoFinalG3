package contolador;
import dao.OfertaDao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.OfertasModelo;
import vista.JIntFrmModificarOferta;
import vista.JIntFrmEliminarOferta;
import vista.JIntFrmInsertarOferta;
import vista.JIntFrmListadoOfertas;
public class OfertaControlador implements ActionListener{
    JIntFrmInsertarOferta insertarOferta = new JIntFrmInsertarOferta();
    JIntFrmEliminarOferta eliminarOferta = new JIntFrmEliminarOferta();
    JIntFrmListadoOfertas listadoOferta = new JIntFrmListadoOfertas();
    JIntFrmModificarOferta modificarOferta = new JIntFrmModificarOferta();
    OfertaDao ofertaDao = new OfertaDao();
    OfertasModelo ofertaModelo = new OfertasModelo();
    String mensaje;

    public OfertaControlador(JIntFrmInsertarOferta insertarOferta, JIntFrmEliminarOferta eliminarOferta, JIntFrmListadoOfertas listadoOferta, JIntFrmModificarOferta modificarOferta) {
        this.insertarOferta=insertarOferta;
        this.eliminarOferta=eliminarOferta;
        this.listadoOferta=listadoOferta;
        this.modificarOferta=modificarOferta;
        this.insertarOferta.jBtnInsertarOfertas.addActionListener(this);
        this.eliminarOferta.jBtnEliminarOfertas.addActionListener(this);
        this.modificarOferta.jBtnModificarOferta.addActionListener(this);
        cargarTabla();
    }
    
    public void cargarTabla(){
        ArrayList<OfertasModelo> lista = new ArrayList();
        lista=ofertaDao.mostrarOferta();
        DefaultTableModel modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("oferta_id");
        modeloTabla.addColumn("nombre");
        modeloTabla.addColumn("fecha_inicio");
        modeloTabla.addColumn("fecha_fin");
        Object[] columna= new Object[4];
        for (OfertasModelo oferta:lista) {
            columna[0]=oferta.getOferta_id();
            columna[1]=oferta.getNombre();
            columna[2]=oferta.getFecha_inicio();
            columna[3]=oferta.getFecha_Fin();
            modeloTabla.addRow(columna);
        }
        
        eliminarOferta.jTblListadoOfertas.setModel(modeloTabla);
    }
    
    private void borrarControladores(){
        this.insertarOferta.jTxtCodigo.setText("");
        this.insertarOferta.jTxtNombre.setText("");
        this.insertarOferta.jTxtFechaInicio.setText("");
        this.insertarOferta.jTxtFechaFinal.setText("");
        this.insertarOferta.jTxtCodigo.requestFocus();
    }
    private void borrarControladores2(){
        this.modificarOferta.jTxtCodigo.setText("");
        this.modificarOferta.jTxtNombre.setText("");
        this.modificarOferta.jTxtFechaInicio.setText("");
        this.modificarOferta.jTxtFechaFinal.setText("");
        this.modificarOferta.jTxtCodigo.requestFocus();
    }
    
    private void borrarControladores3(){
        this.eliminarOferta.jTxtCodigo.setText("");
        this.eliminarOferta.jTxtCodigo.requestFocus();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.insertarOferta.jBtnInsertarOfertas){
            ofertaModelo.setOferta_id(this.insertarOferta.jTxtCodigo.getText());
            ofertaModelo.setNombre(this.insertarOferta.jTxtNombre.getText());
            ofertaModelo.setFecha_inicio(this.insertarOferta.jTxtFechaInicio.getText());
            ofertaModelo.setFecha_Fin(this.insertarOferta.jTxtFechaFinal.getText());
            mensaje=ofertaDao.insertarOferta(ofertaModelo);
            JOptionPane.showConfirmDialog(insertarOferta, mensaje);
            borrarControladores();
        }
        if(e.getSource()==this.modificarOferta.jBtnModificarOferta){
            ofertaModelo.setNombre(this.modificarOferta.jTxtNombre.getText());
            ofertaModelo.setFecha_inicio(this.modificarOferta.jTxtFechaInicio.getText());
            ofertaModelo.setFecha_Fin(this.modificarOferta.jTxtFechaFinal.getText());
            ofertaModelo.setOferta_id(this.modificarOferta.jTxtCodigo.getText());
            mensaje=ofertaDao.modificarOferta(ofertaModelo);
            JOptionPane.showConfirmDialog(modificarOferta, mensaje);
            borrarControladores2();
        }
        if(e.getSource()==this.eliminarOferta.jBtnEliminarOfertas){
            ofertaModelo.setOferta_id(this.eliminarOferta.jTxtCodigo.getText());
            mensaje=ofertaDao.eliminarOfertas(ofertaModelo);
            JOptionPane.showConfirmDialog(eliminarOferta, mensaje);
            borrarControladores3();
        }
    }
    
    
}
