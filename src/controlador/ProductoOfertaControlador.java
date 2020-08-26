package controlador;
import dao.ProductoOfertaDao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.ProductoOfertaModelo;
import vista.JIntFrmListadoProductoOferta;
import vista.JIntFrmEliminarProductoOferta;
import vista.JIntFrmInsertarProductoOferta;
import vista.JIntFrmModificarProductoOferta;
public class ProductoOfertaControlador implements ActionListener{
    JIntFrmInsertarProductoOferta insertarProductoOferta = new JIntFrmInsertarProductoOferta();
    JIntFrmListadoProductoOferta listadoProductoOferta = new JIntFrmListadoProductoOferta();
    JIntFrmEliminarProductoOferta eliminarProductoOferta = new JIntFrmEliminarProductoOferta();
    JIntFrmModificarProductoOferta modificarProductoOferta = new JIntFrmModificarProductoOferta();
    ProductoOfertaDao productoOfertaDao = new ProductoOfertaDao();
    ProductoOfertaModelo productoOfertaModelo = new ProductoOfertaModelo();
    String mensaje;

    public ProductoOfertaControlador(JIntFrmInsertarProductoOferta insertarProductoOferta) {
        this.insertarProductoOferta=insertarProductoOferta;
        this.insertarProductoOferta.jBtnInsertarProductoOferta.addActionListener(this);
    }

    public ProductoOfertaControlador(JIntFrmListadoProductoOferta listadoProductoOferta) {
        this.listadoProductoOferta=listadoProductoOferta;
        cargarTabla();
    }

    public ProductoOfertaControlador(JIntFrmEliminarProductoOferta eliminarProductoOferta) {
        this.eliminarProductoOferta=eliminarProductoOferta;
        this.eliminarProductoOferta.jBtnEliminarProductoOferta.addActionListener(this);
        cargarTabla();
    }

    public ProductoOfertaControlador(JIntFrmModificarProductoOferta modificarProductoOferta) {
        this.modificarProductoOferta=modificarProductoOferta;
        this.modificarProductoOferta.jBtModificarProductoOferta.addActionListener(this);
    }
    public void cargarTabla(){
        ArrayList<ProductoOfertaModelo> lista = new ArrayList();
        lista=productoOfertaDao.mostrarProductoOferta();
        DefaultTableModel modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("correlativo");
        modeloTabla.addColumn("producto_id");
        modeloTabla.addColumn("oferta_id");
        modeloTabla.addColumn("descuento");
        modeloTabla.addColumn("empleado_id");
        modeloTabla.addColumn("fecha_ingreso");
        Object[] columna= new Object[6];
        for (ProductoOfertaModelo productoOferta:lista) {
            columna[0]=productoOferta.getCorrelativo();
            columna[1]=productoOferta.getProducto_id();
            columna[2]=productoOferta.getOferta_id();
            columna[3]=productoOferta.getDescuento();
            columna[4]=productoOferta.getEmpleado_id();
            columna[5]=productoOferta.getFecha_ingreso();
            modeloTabla.addRow(columna);
        }
        listadoProductoOferta.jTblListadoProductoOferta.setModel(modeloTabla);
        eliminarProductoOferta.jTblListadoProductoOferta.setModel(modeloTabla);
    }
    private void borrarControladores(){
        this.insertarProductoOferta.jTxtCorrelativo.setText("");
        this.insertarProductoOferta.jTxtProductoID.setText("");
        this.insertarProductoOferta.jTxtOfertaID.setText("");
        this.insertarProductoOferta.jTxtDescuento.setText("");
        this.insertarProductoOferta.jTxtEmpleadoID.setText("");
        this.insertarProductoOferta.jTxtFechaIngreso.setText("");
        this.insertarProductoOferta.jTxtCorrelativo.requestFocus();
    }
    private void borrarControladores2(){
        this.modificarProductoOferta.jTxtProductoID.setText("");
        this.modificarProductoOferta.jTxtOfertaID.setText("");
        this.modificarProductoOferta.jTxtDescuento.setText("");
        this.modificarProductoOferta.jTxtEmpleadoID.setText("");
        this.modificarProductoOferta.jTxtFechaIngreso.setText("");
        this.modificarProductoOferta.jTxtCorrelativo.setText("");
        this.modificarProductoOferta.jTxtCorrelativo.requestFocus();
    }
    
    private void borrarControladores3(){
        this.eliminarProductoOferta.jTxtCorrelativo.setText("");
        this.eliminarProductoOferta.jTxtCorrelativo.requestFocus();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.insertarProductoOferta.jBtnInsertarProductoOferta){
            productoOfertaModelo.setCorrelativo(this.insertarProductoOferta.jTxtCorrelativo.getText());
            productoOfertaModelo.setProducto_id(this.insertarProductoOferta.jTxtProductoID.getText());
            productoOfertaModelo.setOferta_id(this.insertarProductoOferta.jTxtOfertaID.getText());
            productoOfertaModelo.setDescuento(Double.parseDouble(this.insertarProductoOferta.jTxtDescuento.getText()));
            productoOfertaModelo.setEmpleado_id(this.insertarProductoOferta.jTxtEmpleadoID.getText());
            productoOfertaModelo.setFecha_ingreso(this.insertarProductoOferta.jTxtFechaIngreso.getText());
            mensaje=productoOfertaDao.insertarProdutoOferta(productoOfertaModelo);
            JOptionPane.showConfirmDialog(insertarProductoOferta, mensaje);
            borrarControladores();
        }
        if(e.getSource()==this.modificarProductoOferta.jBtModificarProductoOferta){
            productoOfertaModelo.setProducto_id(this.modificarProductoOferta.jTxtProductoID.getText());
            productoOfertaModelo.setOferta_id(this.modificarProductoOferta.jTxtOfertaID.getText());
            productoOfertaModelo.setDescuento(Double.parseDouble(this.modificarProductoOferta.jTxtDescuento.getText()));
            productoOfertaModelo.setEmpleado_id(this.modificarProductoOferta.jTxtEmpleadoID.getText());
            productoOfertaModelo.setFecha_ingreso(this.modificarProductoOferta.jTxtFechaIngreso.getText());
            productoOfertaModelo.setCorrelativo(this.modificarProductoOferta.jTxtCorrelativo.getText());
            mensaje=productoOfertaDao.modificarProductoOferta(productoOfertaModelo);
            JOptionPane.showConfirmDialog(modificarProductoOferta, mensaje);
            borrarControladores2();
        }
        if(e.getSource()==this.eliminarProductoOferta.jBtnEliminarProductoOferta){
            productoOfertaModelo.setCorrelativo(this.eliminarProductoOferta.jTxtCorrelativo.getText());
            mensaje=productoOfertaDao.eliminarProductoOferta(productoOfertaModelo);
            JOptionPane.showConfirmDialog(eliminarProductoOferta, mensaje);
            borrarControladores3();
        }
    }
    
}
