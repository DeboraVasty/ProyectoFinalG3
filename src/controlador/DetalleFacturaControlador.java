package controlador;
import dao.DetalleFacturaDao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.DetalleFacturaModelo;
import vista.JIntlFrmListadoDetalleFactura;
import vista.JIntFrmEliminarDetalleFactura;
import vista.JIntFrmInsertarDetalleFactura;
import vista.JIntFrmModificarDetalleFactura;
public class DetalleFacturaControlador implements ActionListener{
    JIntFrmInsertarDetalleFactura insertarDetalle = new JIntFrmInsertarDetalleFactura();
    JIntlFrmListadoDetalleFactura listadoDetalle = new JIntlFrmListadoDetalleFactura();
    JIntFrmEliminarDetalleFactura eliminarDetalle =  new JIntFrmEliminarDetalleFactura();
    JIntFrmModificarDetalleFactura modificarDetalle = new JIntFrmModificarDetalleFactura();
    DetalleFacturaDao detalleDao = new DetalleFacturaDao();
    DetalleFacturaModelo detalleModelo = new DetalleFacturaModelo();
    String mensaje;

    public DetalleFacturaControlador(JIntFrmInsertarDetalleFactura insertarDetalle) {
        this.insertarDetalle=insertarDetalle;
        this.insertarDetalle.jBtnInsertarDetalleFactura.addActionListener(this);
    }

    public DetalleFacturaControlador(JIntlFrmListadoDetalleFactura listadoDetalle) {
        this.listadoDetalle=listadoDetalle;
        cargarTabla();
    }

    public DetalleFacturaControlador(JIntFrmEliminarDetalleFactura eliminarDetalle) {
        this.eliminarDetalle=eliminarDetalle;
        this.eliminarDetalle.jBtnEliminarDetalleFactura.addActionListener(this);
        cargarTabla();
    }

    public DetalleFacturaControlador(JIntFrmModificarDetalleFactura modificarDetalle) {
        this.modificarDetalle=modificarDetalle;
        this.modificarDetalle.jBtModificarDetalleFactura.addActionListener(this);
    }
    public void cargarTabla(){
        ArrayList<DetalleFacturaModelo> lista = new ArrayList();
        lista=detalleDao.mostrarDetalleFactura();
        DefaultTableModel modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("correlativo_detalle");
        modeloTabla.addColumn("producto_id");
        modeloTabla.addColumn("oferta_id");
        modeloTabla.addColumn("cantidad");
        modeloTabla.addColumn("precio");
        modeloTabla.addColumn("correlativo_factura");
        Object[] columna= new Object[6];
        for (DetalleFacturaModelo detalle:lista) {
            columna[0]=detalle.getCorrelativo_detalle();
            columna[1]=detalle.getProducto_id();
            columna[2]=detalle.getOferta_id();
            columna[3]=detalle.getCantidad();
            columna[4]=detalle.getPrecio();
            columna[5]=detalle.getCorrelativo_factura();
            modeloTabla.addRow(columna);
        }
        listadoDetalle.jTblListadoDetalleFactura.setModel(modeloTabla);
        eliminarDetalle.jTblListadoDetalleFactura.setModel(modeloTabla);
    }
    private void borrarControladores(){
        this.insertarDetalle.jTxtCorrelativoDetalle.setText("");
        this.insertarDetalle.jTxtProductoID.setText("");
        this.insertarDetalle.jTxtOfertaID.setText("");
        this.insertarDetalle.jTxtCantidad.setText("");
        this.insertarDetalle.jTxtPrecio.setText("");
        this.insertarDetalle.jTxtCorrelativoFactura.setText("");
        this.insertarDetalle.jTxtCorrelativoDetalle.requestFocus();
    }
    private void borrarControladores2(){
        this.modificarDetalle.jTxtProductoID.setText("");
        this.modificarDetalle.jTxtOfertaID.setText("");
        this.modificarDetalle.jTxtCantidad.setText("");
        this.modificarDetalle.jTxtPrecio.setText("");
        this.modificarDetalle.jTxtCorrelativoFactura.setText("");
        this.modificarDetalle.jTxtCorrelativoDetalle.setText("");
        this.modificarDetalle.jTxtCorrelativoDetalle.requestFocus();
    }
    
    private void borrarControladores3(){
        this.eliminarDetalle.jTxtCorrelativoDetalle.setText("");
        this.eliminarDetalle.jTxtCorrelativoDetalle.requestFocus();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.insertarDetalle.jBtnInsertarDetalleFactura){
            detalleModelo.setCorrelativo_detalle(this.insertarDetalle.jTxtCorrelativoDetalle.getText());
            detalleModelo.setProducto_id(this.insertarDetalle.jTxtProductoID.getText());
            detalleModelo.setOferta_id(this.insertarDetalle.jTxtOfertaID.getText());
            detalleModelo.setCantidad(Integer.parseInt(this.insertarDetalle.jTxtCantidad.getText()));
            detalleModelo.setPrecio(Double.parseDouble(this.insertarDetalle.jTxtPrecio.getText()));
            detalleModelo.setCorrelativo_factura(this.insertarDetalle.jTxtCorrelativoFactura.getText());
            mensaje=detalleDao.insertarDetalleFactura(detalleModelo);
            JOptionPane.showConfirmDialog(insertarDetalle, mensaje);
            borrarControladores();
        }
        if(e.getSource()==this.modificarDetalle.jBtModificarDetalleFactura){
            detalleModelo.setProducto_id(this.modificarDetalle.jTxtProductoID.getText());
            detalleModelo.setOferta_id(this.modificarDetalle.jTxtOfertaID.getText());
            detalleModelo.setCantidad(Integer.parseInt(this.insertarDetalle.jTxtCantidad.getText()));
            detalleModelo.setPrecio(Double.parseDouble(this.modificarDetalle.jTxtPrecio.getText()));
            detalleModelo.setCorrelativo_factura(this.modificarDetalle.jTxtCorrelativoFactura.getText());
            detalleModelo.setCorrelativo_detalle(this.modificarDetalle.jTxtCorrelativoDetalle.getText());
            mensaje=detalleDao.modificarDetalleFactura(detalleModelo);
            JOptionPane.showConfirmDialog(modificarDetalle, mensaje);
            borrarControladores2();
        }
        if(e.getSource()==this.eliminarDetalle.jBtnEliminarDetalleFactura){
            detalleModelo.setCorrelativo_detalle(this.eliminarDetalle.jTxtCorrelativoDetalle.getText());
            mensaje=detalleDao.eliminarDetalleFactura(detalleModelo);
            JOptionPane.showConfirmDialog(eliminarDetalle, mensaje);
            borrarControladores3();
        }
    }
    
}
