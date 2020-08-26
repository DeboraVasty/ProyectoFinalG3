package controlador;
import dao.TipoProductoDao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.TiposProductosModelo;
import vista.JIntFrmEliminarTipoProducto;
import vista.JIntFrmInsertarTipoProducto;
import vista.JIntFrmListadoTipoProducto;
import vista.JIntFrmModificarTipoProducto;
public class TipoProductoControlador implements ActionListener{
    JIntFrmInsertarTipoProducto insertarTipo = new JIntFrmInsertarTipoProducto();
    JIntFrmListadoTipoProducto listadoTipo = new JIntFrmListadoTipoProducto();
    JIntFrmEliminarTipoProducto eliminarTipo = new JIntFrmEliminarTipoProducto();
    JIntFrmModificarTipoProducto modificarTipo = new JIntFrmModificarTipoProducto();
    TipoProductoDao tipoDao = new TipoProductoDao();
    TiposProductosModelo tipoModelo = new TiposProductosModelo();
    String mensaje;

    public TipoProductoControlador(JIntFrmInsertarTipoProducto insertarTipo) {
        this.insertarTipo=insertarTipo;
        this.insertarTipo.jBtnInsertarTipoProducto.addActionListener(this);
    }

    public TipoProductoControlador(JIntFrmListadoTipoProducto listadoTipo) {
        this.listadoTipo=listadoTipo;
        cargarTabla();
    }

    public TipoProductoControlador(JIntFrmEliminarTipoProducto eliminarTipo) {
        this.eliminarTipo=eliminarTipo;
        this.eliminarTipo.jBtnEliminarTipoProducto.addActionListener(this);
        cargarTabla();
    }

    public TipoProductoControlador(JIntFrmModificarTipoProducto modificarTipo) {
        this.modificarTipo=modificarTipo;
        this.modificarTipo.jBtnModificarTipoProducto.addActionListener(this);
    }
    public void cargarTabla(){
        ArrayList<TiposProductosModelo> lista = new ArrayList();
        lista=tipoDao.mostrarTipoProducto();
        DefaultTableModel modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("puesto_id");
        modeloTabla.addColumn("nombre");
        modeloTabla.addColumn("direccion");
        Object[] columna= new Object[3];
        for (TiposProductosModelo tipo:lista) {
            columna[0]=tipo.getTipo_producto_id();
            columna[1]=tipo.getNombre();
            columna[2]=tipo.getDescripcion();
            modeloTabla.addRow(columna);
        }
        listadoTipo.jTblListadoTiposProductos.setModel(modeloTabla);
        eliminarTipo.jTblListadoTiposProductos.setModel(modeloTabla);
    }
    private void borrarControladores(){
        this.insertarTipo.jTxtTipoProductoID.setText("");
        this.insertarTipo.jTxtNombre.setText("");
        this.insertarTipo.jTxtDescripcion.setText("");
        this.insertarTipo.jTxtTipoProductoID.requestFocus();
    }
    private void borrarControladores2(){
        this.modificarTipo.jTxtNombre.setText("");
        this.modificarTipo.jTxtDescripcion.setText("");
        this.modificarTipo.jTxtTipoProductoID.setText("");
        this.modificarTipo.jTxtTipoProductoID.requestFocus();
    }
    
    private void borrarControladores3(){
        this.eliminarTipo.jTxtTipoProductoID.setText("");
        this.eliminarTipo.jTxtTipoProductoID.requestFocus();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.insertarTipo.jBtnInsertarTipoProducto){
            tipoModelo.setTipo_producto_id(this.insertarTipo.jTxtTipoProductoID.getText());
            tipoModelo.setNombre(this.insertarTipo.jTxtNombre.getText());
            tipoModelo.setDescripcion(this.insertarTipo.jTxtDescripcion.getText());
            mensaje=tipoDao.insertarTipoProducto(tipoModelo);
            JOptionPane.showConfirmDialog(insertarTipo, mensaje);
            borrarControladores();
        }
        if(e.getSource()==this.modificarTipo.jBtnModificarTipoProducto){
            tipoModelo.setNombre(this.modificarTipo.jTxtNombre.getText());
            tipoModelo.setDescripcion(this.modificarTipo.jTxtDescripcion.getText());
            tipoModelo.setTipo_producto_id(this.modificarTipo.jTxtTipoProductoID.getText());
            mensaje=tipoDao.modificarTipoProducto(tipoModelo);
            JOptionPane.showConfirmDialog(modificarTipo, mensaje);
            borrarControladores2();
        }
        if(e.getSource()==this.eliminarTipo.jBtnEliminarTipoProducto){
            tipoModelo.setTipo_producto_id(this.eliminarTipo.jTxtTipoProductoID.getText());
            mensaje=tipoDao.eliminarTipoProducto(tipoModelo);
            JOptionPane.showConfirmDialog(eliminarTipo, mensaje);
            borrarControladores3();
        }
      }
    
}
