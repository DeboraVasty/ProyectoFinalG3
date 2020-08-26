package controlador;
import dao.PuestosDao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.PuestosModelo;
import vista.JIntFrmListadoPuestos;
import vista.JIntFrmInsertarPuesto;
import vista.JIntlFrmEliminarPuesto;
import vista.JIntFrmModificarPuesto;
public class PuestosControlador implements ActionListener{
    JIntFrmInsertarPuesto insertarPuesto = new JIntFrmInsertarPuesto();
    JIntFrmListadoPuestos listadoPuesto = new JIntFrmListadoPuestos();
    JIntlFrmEliminarPuesto eliminarPuesto = new JIntlFrmEliminarPuesto();
    JIntFrmModificarPuesto modificarPuesto = new JIntFrmModificarPuesto();
    PuestosDao puestoDao = new PuestosDao();
    PuestosModelo puesto = new PuestosModelo();
    String mensaje;

    public PuestosControlador(JIntFrmInsertarPuesto insertarPuesto) {
        this.insertarPuesto=insertarPuesto;
        this.insertarPuesto.jBtnInsertarPuesto.addActionListener(this);
    }

    public PuestosControlador(JIntFrmListadoPuestos listadoPuesto) {
        this.listadoPuesto=listadoPuesto;
        cargarTabla();
    }

    public PuestosControlador(JIntlFrmEliminarPuesto eliminarPuesto) {
        this.eliminarPuesto=eliminarPuesto;
        this.eliminarPuesto.jBtnEliminarPuesto.addActionListener(this);
        cargarTabla();
    }

    public PuestosControlador(JIntFrmModificarPuesto modificarPuesto) {
        this.modificarPuesto=modificarPuesto;
        this.modificarPuesto.jBtnModificarPuesto.addActionListener(this);
    }
    public void cargarTabla(){
        ArrayList<PuestosModelo> lista = new ArrayList();
        lista=puestoDao.mostrarPuesto();
        DefaultTableModel modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("puesto_id");
        modeloTabla.addColumn("nombre");
        modeloTabla.addColumn("direccion");
        Object[] columna= new Object[3];
        for (PuestosModelo puesto:lista) {
            columna[0]=puesto.getPuesto_id();
            columna[1]=puesto.getNombre();
            columna[2]=puesto.getDireccion();
            modeloTabla.addRow(columna);
        }
        listadoPuesto.jTblListadoPuesto.setModel(modeloTabla);
        eliminarPuesto.jTblListadoPuesto.setModel(modeloTabla);
    }
    private void borrarControladores(){
        this.insertarPuesto.jTxtPuestoID.setText("");
        this.insertarPuesto.jTxtNombre.setText("");
        this.insertarPuesto.jTxtDireccion.setText("");
        this.insertarPuesto.jTxtPuestoID.requestFocus();
    }
    private void borrarControladores2(){
        this.modificarPuesto.jTxtNombre.setText("");
        this.modificarPuesto.jTxtDireccion.setText("");
        this.modificarPuesto.jTxtPuestoID.setText("");
        this.modificarPuesto.jTxtPuestoID.requestFocus();
    }
    
    private void borrarControladores3(){
        this.eliminarPuesto.jTxtPuestoID.setText("");
        this.eliminarPuesto.jTxtPuestoID.requestFocus();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.insertarPuesto.jBtnInsertarPuesto){
            puesto.setPuesto_id(this.insertarPuesto.jTxtPuestoID.getText());
            puesto.setNombre(this.insertarPuesto.jTxtNombre.getText());
            puesto.setDireccion(this.insertarPuesto.jTxtDireccion.getText());
            mensaje=puestoDao.insertarPuesto(puesto);
            JOptionPane.showConfirmDialog(insertarPuesto, mensaje);
            borrarControladores();
        }
        if(e.getSource()==this.modificarPuesto.jBtnModificarPuesto){
            puesto.setNombre(this.modificarPuesto.jTxtNombre.getText());
            puesto.setDireccion(this.modificarPuesto.jTxtDireccion.getText());
            puesto.setPuesto_id(this.modificarPuesto.jTxtPuestoID.getText());
            mensaje=puestoDao.modificarPuesto(puesto);
            JOptionPane.showConfirmDialog(modificarPuesto, mensaje);
            borrarControladores2();
        }
        if(e.getSource()==this.eliminarPuesto.jBtnEliminarPuesto){
            puesto.setPuesto_id(this.eliminarPuesto.jTxtPuestoID.getText());
            mensaje=puestoDao.eliminarPuesto(puesto);
            JOptionPane.showConfirmDialog(eliminarPuesto, mensaje);
            borrarControladores3();
        }
    }
    
}
