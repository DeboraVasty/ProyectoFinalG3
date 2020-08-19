package contolador;
import dao.ClienteDao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
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

    public ClienteControlador(JIntlFrmInsertarCliente insertarCliente, JIntlFrmListadoClientes listadoCliente, JIntlFrmEliminarCliente eliminarCliente,JIntlFrmModificarCliente modificarCliente) {
        this.insertarCliente=insertarCliente;
        this.listadoCliente=listadoCliente;
        this.eliminarCliente=eliminarCliente;
        this.modificarCliente=modificarCliente;
        this.insertarCliente.jBtnInsertarCliente.addActionListener(this);
        this.insertarCliente.jBtnRegresar.addActionListener(this);
        this.modificarCliente.jBtnModificarCliente.addActionListener(this);
        this.modificarCliente.jBtnRegresar.addActionListener(this);
        this.eliminarCliente.jBtnEliminarCliente.addActionListener(this);
        this.eliminarCliente.jBtnRegresar.addActionListener(this);
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
        listadoCliente.jTblListadoClientes.setModel(modeloTabla);
        eliminarCliente.jTblListadoClientes.setModel(modeloTabla);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
