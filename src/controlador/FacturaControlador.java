package controlador;
import dao.FacturaDao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.FacturaModelo;
import vista.JIntFrmEliminarFactura;
import vista.JIntFrmInsertarFactura;
import vista.JIntFrmListadoFactura;
import vista.JIntFrmModificarFactura;
public class FacturaControlador implements ActionListener{
    JIntFrmInsertarFactura insertarFactura = new JIntFrmInsertarFactura();
    JIntFrmListadoFactura listadoFactura = new JIntFrmListadoFactura();
    JIntFrmEliminarFactura eliminarFactura = new JIntFrmEliminarFactura();
    JIntFrmModificarFactura modificarFactura = new JIntFrmModificarFactura();
    FacturaDao facturaDao =  new FacturaDao();
    FacturaModelo facturaModelo =  new FacturaModelo();
    String mensaje;

    public FacturaControlador(JIntFrmInsertarFactura insertarFactura) {
        this.insertarFactura=insertarFactura;
        this.insertarFactura.jBtnInsertarFactura.addActionListener(this);
    }

    public FacturaControlador(JIntFrmListadoFactura listadoFactura) {
        this.listadoFactura=listadoFactura;
        cargarTabla();
    }

    public FacturaControlador(JIntFrmEliminarFactura eliminarFactura) {
        this.eliminarFactura=eliminarFactura;
        this.eliminarFactura.jBtnEliminarFactura.addActionListener(this);
        cargarTabla();
    }

    public FacturaControlador(JIntFrmModificarFactura modificarFactura) {
        this.modificarFactura=modificarFactura;
        this.modificarFactura.jBtModificarFactura.addActionListener(this);
    }
    
    public void cargarTabla(){
        ArrayList<FacturaModelo> lista = new ArrayList();
        lista=facturaDao.mostrarFactura();
        DefaultTableModel modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("correlativo_factura");
        modeloTabla.addColumn("no_factura");
        modeloTabla.addColumn("serie");
        modeloTabla.addColumn("fecha");
        modeloTabla.addColumn("nit");
        modeloTabla.addColumn("nombre");
        modeloTabla.addColumn("direccion");
        modeloTabla.addColumn("subtotal");
        modeloTabla.addColumn("descuento");
        modeloTabla.addColumn("cliente_id");
        Object[] columna= new Object[10];
        for (FacturaModelo factura:lista) {
            columna[0]=factura.getCorrelativo_factura();
            columna[1]=factura.getNo_factura();
            columna[2]=factura.getSerie();
            columna[3]=factura.getFecha();
            columna[4]=factura.getNit();
            columna[5]=factura.getNombre();
            columna[6]=factura.getDireccion();
            columna[7]=factura.getSubtotal();
            columna[8]=factura.getDescuento();
            columna[9]=factura.getCliente_id();
            modeloTabla.addRow(columna);
        }
        listadoFactura.jTblListadoFacturas.setModel(modeloTabla);
        eliminarFactura.jTblListadoFacturas.setModel(modeloTabla);
    }
    
     private void borrarControladores(){
        this.insertarFactura.jTxtCorrelativoFactura.setText("");
        this.insertarFactura.jTxtNoFactura.setText("");
        this.insertarFactura.jTxtSerie.setText("");
        this.insertarFactura.jTxtFecha.setText("");
        this.insertarFactura.jTxtNit.setText("");
        this.insertarFactura.jTxtNombre.setText("");
        this.insertarFactura.jTxtDireccion.setText("");
        this.insertarFactura.jTxtSubtotal.setText("");
        this.insertarFactura.jTxtDescuento.setText("");
        this.insertarFactura.jTxtClienteID.setText("");
        this.insertarFactura.jTxtCorrelativoFactura.requestFocus();
    }
    private void borrarControladores2(){
        this.modificarFactura.jTxtNoFactura.setText("");
        this.modificarFactura.jTxtSerie.setText("");
        this.modificarFactura.jTxtFecha.setText("");
        this.modificarFactura.jTxtNit.setText("");
        this.modificarFactura.jTxtNombre.setText("");
        this.modificarFactura.jTxtDireccion.setText("");
        this.modificarFactura.jTxtSubtotal.setText("");
        this.modificarFactura.jTxtDescuento.setText("");
        this.modificarFactura.jTxtClienteID.setText("");
        this.modificarFactura.jTxtCorrelativoFactura.setText("");
        this.modificarFactura.jTxtCorrelativoFactura.requestFocus();
    }
    
    private void borrarControladores3(){
        this.eliminarFactura.jTxtCorrelativoFactura.setText("");
        this.eliminarFactura.jTxtCorrelativoFactura.requestFocus();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.insertarFactura.jBtnInsertarFactura){
            facturaModelo.setCorrelativo_factura(this.insertarFactura.jTxtCorrelativoFactura.getText());
            facturaModelo.setNo_factura(Integer.parseInt(this.insertarFactura.jTxtNoFactura.getText()));
            facturaModelo.setSerie(Integer.parseInt(this.insertarFactura.jTxtSerie.getText()));
            facturaModelo.setFecha(this.insertarFactura.jTxtFecha.getText());
            facturaModelo.setNit(Integer.parseInt(this.insertarFactura.jTxtNit.getText()));
            facturaModelo.setNombre(this.insertarFactura.jTxtNombre.getText());
            facturaModelo.setDireccion(this.insertarFactura.jTxtDireccion.getText());
            facturaModelo.setSubtotal(Double.parseDouble(this.insertarFactura.jTxtSubtotal.getText()));
            facturaModelo.setDescuento(Double.parseDouble(this.insertarFactura.jTxtDescuento.getText()));
            facturaModelo.setCliente_id(this.insertarFactura.jTxtClienteID.getText());
            mensaje=facturaDao.insertarFactura(facturaModelo);
            JOptionPane.showConfirmDialog(insertarFactura, mensaje);
            borrarControladores();
        }
        if(e.getSource()==this.modificarFactura.jBtModificarFactura){
            facturaModelo.setNo_factura(Integer.parseInt(this.modificarFactura.jTxtNoFactura.getText()));
            facturaModelo.setSerie(Integer.parseInt(this.modificarFactura.jTxtSerie.getText()));
            facturaModelo.setFecha(this.modificarFactura.jTxtFecha.getText());
            facturaModelo.setNit(Integer.parseInt(this.modificarFactura.jTxtNit.getText()));
            facturaModelo.setNombre(this.insertarFactura.jTxtNombre.getText());
            facturaModelo.setDireccion(this.modificarFactura.jTxtDireccion.getText());
            facturaModelo.setSubtotal(Double.parseDouble(this.modificarFactura.jTxtSubtotal.getText()));
            facturaModelo.setDescuento(Double.parseDouble(this.modificarFactura.jTxtDescuento.getText()));
            facturaModelo.setCliente_id(this.modificarFactura.jTxtClienteID.getText());
            facturaModelo.setCorrelativo_factura(this.modificarFactura.jTxtCorrelativoFactura.getText());
            mensaje=facturaDao.modificarFactura(facturaModelo);
            JOptionPane.showConfirmDialog(modificarFactura, mensaje);
            borrarControladores2();
        }
        if(e.getSource()==this.eliminarFactura.jBtnEliminarFactura){
            facturaModelo.setCorrelativo_factura(this.eliminarFactura.jTxtCorrelativoFactura.getText());
            mensaje=facturaDao.eliminarFactura(facturaModelo);
            JOptionPane.showConfirmDialog(eliminarFactura, mensaje);
            borrarControladores3();
        }
    }
    
}
