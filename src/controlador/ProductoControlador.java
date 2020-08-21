package controlador;
import dao.ProductoDao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.ProductosModelo;
import vista.JIntFrmInsertarProducto;
import vista.JIntFrmListadoProducto;
import vista.JIntFrmModificarProducto;
import vista.JIntlFrmEliminarProducto;
public class ProductoControlador implements ActionListener{
    JIntFrmInsertarProducto insertarProducto = new JIntFrmInsertarProducto();
    JIntFrmListadoProducto listadoProducto = new JIntFrmListadoProducto();
    JIntFrmModificarProducto modificarProducto = new JIntFrmModificarProducto();
    JIntlFrmEliminarProducto eliminarProducto = new JIntlFrmEliminarProducto();
    ProductoDao productoDao = new ProductoDao();
    ProductosModelo productosModelo = new ProductosModelo();
    String mensaje;

    public ProductoControlador(JIntlFrmEliminarProducto eliminarProducto) {
        this.eliminarProducto=eliminarProducto;
        this.eliminarProducto.jBtnEliminarProducto.addActionListener(this);
        cargarTabla();
    }

    public ProductoControlador(JIntFrmInsertarProducto insertarProducto) {
        this.insertarProducto=insertarProducto;
        this.insertarProducto.jBtnInsertarProducto.addActionListener(this);
    }

    public ProductoControlador(JIntFrmListadoProducto listadoProducto) {
        this.listadoProducto=listadoProducto;
        cargarTabla();
    }

    public ProductoControlador(JIntFrmModificarProducto modificarProducto) {
        this.modificarProducto=modificarProducto;
        this.modificarProducto.jBtnModificarProducto.addActionListener(this);
    }
    
    
    public void cargarTabla(){
        ArrayList<ProductosModelo> lista = new ArrayList();
        lista=productoDao.mostrarProducto();
        DefaultTableModel modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("producto_id");
        modeloTabla.addColumn("nombre");
        modeloTabla.addColumn("precio_venta");
        modeloTabla.addColumn("cantidad");
        modeloTabla.addColumn("tipo_producto_id");
        Object[] columna= new Object[5];
        for (ProductosModelo producto:lista) {
            columna[0]=producto.getProducto_id();
            columna[1]=producto.getNombre();
            columna[2]=producto.getPrecio_venta();
            columna[3]=producto.getCantidad();
            columna[4]=producto.getTipo_producto_id();
            modeloTabla.addRow(columna);
        }
        listadoProducto.jTblListadoProductos.setModel(modeloTabla);
        eliminarProducto.jTblListadoProductos.setModel(modeloTabla);
    }
    
    private void borrarControladores(){
        this.insertarProducto.jTxtCodigo.setText("");
        this.insertarProducto.jTxtNombre.setText("");
        this.insertarProducto.jTxtPrecioVenta.setText("");
        this.insertarProducto.jTxtCantidad.setText("");
        this.insertarProducto.jTxtTipoProductoID.setText("");
        this.insertarProducto.jTxtCodigo.requestFocus();
    }
    private void borrarControladores2(){
        this.modificarProducto.jTxtCodigo.setText("");
        this.modificarProducto.jTxtNombre.setText("");
        this.modificarProducto.jTxtPrecioVenta.setText("");
        this.modificarProducto.jTxtCantidad.setText("");
        this.modificarProducto.jTxtTipoProductoID.setText("");
        this.modificarProducto.jTxtCodigo.requestFocus();
    }
    
    private void borrarControladores3(){
        this.eliminarProducto.jTxtCodigo.setText("");
        this.eliminarProducto.jTxtCodigo.requestFocus();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.insertarProducto.jBtnInsertarProducto){
            productosModelo.setProducto_id(this.insertarProducto.jTxtCodigo.getText());
            productosModelo.setNombre(this.insertarProducto.jTxtNombre.getText());
            productosModelo.setPrecio_venta(Double.parseDouble(this.insertarProducto.jTxtPrecioVenta.getText()));
            productosModelo.setCantidad(Integer.parseInt(this.insertarProducto.jTxtCantidad.getText()));
            productosModelo.setTipo_producto_id(this.insertarProducto.jTxtTipoProductoID.getText());
            mensaje=productoDao.insertarProducto(productosModelo);
            JOptionPane.showConfirmDialog(insertarProducto, mensaje);
            borrarControladores();
        }
        if(e.getSource()==this.modificarProducto.jBtnModificarProducto){
            productosModelo.setNombre(this.modificarProducto.jTxtNombre.getText());
            productosModelo.setPrecio_venta(Double.parseDouble(this.modificarProducto.jTxtPrecioVenta.getText()));
            productosModelo.setCantidad(Integer.parseInt(this.modificarProducto.jTxtCantidad.getText()));
            productosModelo.setTipo_producto_id(this.modificarProducto.jTxtTipoProductoID.getText());
            productosModelo.setProducto_id(this.modificarProducto.jTxtCodigo.getText());
            mensaje=productoDao.modificarProducto(productosModelo);
            JOptionPane.showConfirmDialog(modificarProducto, mensaje);
            borrarControladores2();
        }
        if(e.getSource()==this.eliminarProducto.jBtnEliminarProducto){
            productosModelo.setProducto_id(this.eliminarProducto.jTxtCodigo.getText());
            mensaje=productoDao.eliminarProducto(productosModelo);
            JOptionPane.showConfirmDialog(eliminarProducto, mensaje);
            borrarControladores3();
        }
    }
    
}
