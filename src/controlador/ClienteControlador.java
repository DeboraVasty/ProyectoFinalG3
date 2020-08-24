package controlador;
import dao.ClienteDao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.ClientesModelo;
import vista.JIntlFrmInsertarCliente;
import vista.JIntlFrmListadoClientes;
import vista.JIntlFrmModificarCliente;
import vista.JIntlFrmEliminarCliente;
public class ClienteControlador implements ActionListener{
    JIntlFrmInsertarCliente insertarCliente = new JIntlFrmInsertarCliente();
    JIntlFrmListadoClientes listadoCliente = new JIntlFrmListadoClientes();
    JIntlFrmEliminarCliente eliminarCliente = new JIntlFrmEliminarCliente();
    JIntlFrmModificarCliente modificarCliente = new JIntlFrmModificarCliente();
    ClienteDao clienteDao = new ClienteDao();
    ClientesModelo clienteModelo = new ClientesModelo();
    String mensaje;

    public ClienteControlador(JIntlFrmInsertarCliente insertarCliente) {
        this.insertarCliente=insertarCliente;
        this.insertarCliente.jBtnInsertarCliente.addActionListener(this);
    }

    public ClienteControlador(JIntlFrmListadoClientes listadoCliente) {
        this.listadoCliente=listadoCliente;
        cargarTabla1();
    }

    public ClienteControlador(JIntlFrmEliminarCliente eliminarCliente) {
        this.eliminarCliente=eliminarCliente;
        this.eliminarCliente.jBtnEliminarCliente.addActionListener(this);
        cargarTabla1();
    }

    public ClienteControlador(JIntlFrmModificarCliente modificarCliente) {
        this.modificarCliente=modificarCliente;
        this.modificarCliente.jBtnModificarCliente.addActionListener(this);
    }
    
    
    public void cargarTabla1(){
        ArrayList<ClientesModelo> lista = new ArrayList();
        lista=clienteDao.mostrarCliente();
        DefaultTableModel modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("cliente_id");
        modeloTabla.addColumn("nombre");
        modeloTabla.addColumn("apellido");
        modeloTabla.addColumn("telefono");
        modeloTabla.addColumn("direccion");
        modeloTabla.addColumn("correo_electronico");
        Object[] columna= new Object[6];
        for (ClientesModelo cliente:lista) {
            columna[0]=cliente.getCliente_id();
            columna[1]=cliente.getNombre();
            columna[2]=cliente.getApellido();
            columna[3]=cliente.getTelefono();
            columna[4]=cliente.getDireccion();
            columna[5]=cliente.getCorreo_electronico();
            modeloTabla.addRow(columna);
        }
        //listadoCliente.jTblListadoClientes.setModel(modeloTabla);
        eliminarCliente.jTblListadoClientes.setModel(modeloTabla);
    }
    
    private void borrarControladores(){
        this.insertarCliente.jTxtCodigo.setText("");
        this.insertarCliente.jTxtNombre.setText("");
        this.insertarCliente.jTxtApelldio.setText("");
        this.insertarCliente.jTxtTelefono.setText("");
        this.insertarCliente.jTxtDireccion.setText("");
        this.insertarCliente.jTxtCorreo.setText("");
        this.insertarCliente.jTxtCodigo.requestFocus();
    }
    private void borrarControladores2(){
        this.modificarCliente.jTxtCodigo.setText("");
        this.modificarCliente.jTxtNombre.setText("");
        this.modificarCliente.jTxtApelldio.setText("");
        this.modificarCliente.jTxtTelefono.setText("");
        this.modificarCliente.jTxtDireccion.setText("");
        this.modificarCliente.jTxtCorreo.setText("");
        this.modificarCliente.jTxtCodigo.requestFocus();
    }
    
    private void borrarControladores3(){
        this.eliminarCliente.jTxtCodigo.setText("");
        this.eliminarCliente.jTxtCodigo.requestFocus();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.insertarCliente.jBtnInsertarCliente){
            clienteModelo.setCliente_id(this.insertarCliente.jTxtCodigo.getText());
            clienteModelo.setNombre(this.insertarCliente.jTxtNombre.getText());
            clienteModelo.setApellido(this.insertarCliente.jTxtApelldio.getText());
            clienteModelo.setTelefono(Integer.parseInt(this.insertarCliente.jTxtTelefono.getText()));
            clienteModelo.setDireccion(this.insertarCliente.jTxtDireccion.getText());
            clienteModelo.setCorreo_electronico(this.insertarCliente.jTxtCorreo.getText());
            mensaje=clienteDao.insertarCliente(clienteModelo);
            JOptionPane.showConfirmDialog(insertarCliente, mensaje);
            borrarControladores();
        }
        if(e.getSource()==this.modificarCliente.jBtnModificarCliente){
            clienteModelo.setNombre(this.modificarCliente.jTxtNombre.getText());
            clienteModelo.setApellido(this.modificarCliente.jTxtApelldio.getText());
            clienteModelo.setTelefono(Integer.parseInt(this.modificarCliente.jTxtTelefono.getText()));
            clienteModelo.setDireccion(this.modificarCliente.jTxtDireccion.getText());
            clienteModelo.setCorreo_electronico(this.modificarCliente.jTxtCorreo.getText());
            clienteModelo.setCliente_id(this.modificarCliente.jTxtCodigo.getText());
            mensaje=clienteDao.modificarCliente(clienteModelo);
            JOptionPane.showConfirmDialog(modificarCliente, mensaje);
            borrarControladores2();
        }
        if(e.getSource()==this.eliminarCliente.jBtnEliminarCliente){
            clienteModelo.setCliente_id(this.eliminarCliente.jTxtCodigo.getText());
            mensaje=clienteDao.eliminarCliente(clienteModelo);
            JOptionPane.showConfirmDialog(eliminarCliente, mensaje);
            borrarControladores3();
        }
    }
    
}
