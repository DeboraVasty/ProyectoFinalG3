package controlador;
import dao.EmpleadoDao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.EmpleadosModelo;
import vista.JIntFrmListadoEmpleado;
import vista.JIntFrmEliminarEmpleado;
import vista.JIntlFrmInsertarEmpleado;
import vista.JIntFrmModificarEmpleado;
public class EmpleadoControlador implements ActionListener{
    JIntlFrmInsertarEmpleado insertarEmpleado = new JIntlFrmInsertarEmpleado();
    JIntFrmListadoEmpleado listadoEmpleado = new JIntFrmListadoEmpleado();
    JIntFrmEliminarEmpleado eliminarEmpleado = new JIntFrmEliminarEmpleado();
    JIntFrmModificarEmpleado modificarEmpleado = new JIntFrmModificarEmpleado();
    EmpleadoDao empleadoDao = new EmpleadoDao();
    EmpleadosModelo empleadoModelo = new EmpleadosModelo();
    String mensaje;

    public EmpleadoControlador(JIntlFrmInsertarEmpleado insertarEmpleado) {
        this.insertarEmpleado=insertarEmpleado;
        this.insertarEmpleado.jBtnInsertarEmpleado.addActionListener(this);
    }

    public EmpleadoControlador(JIntFrmListadoEmpleado listadoEmpleado) {
        this.listadoEmpleado=listadoEmpleado;
        cargarTabla();
    }

    public EmpleadoControlador(JIntFrmEliminarEmpleado eliminarEmpleado) {
        this.eliminarEmpleado=eliminarEmpleado;
        this.eliminarEmpleado.jBtnEliminarEmpleado.addActionListener(this);
        cargarTabla();
    }

    public EmpleadoControlador(JIntFrmModificarEmpleado modificarEmpleado) {
        this.modificarEmpleado=modificarEmpleado;
        this.modificarEmpleado.jBtModificarEmpleado.addActionListener(this);
    }
    
    public void cargarTabla(){
        ArrayList<EmpleadosModelo> lista = new ArrayList();
        lista=empleadoDao.mostrarEmpleado();
        DefaultTableModel modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("empleado_id");
        modeloTabla.addColumn("nombre");
        modeloTabla.addColumn("apellido");
        modeloTabla.addColumn("telefono");
        modeloTabla.addColumn("direccion");
        modeloTabla.addColumn("correo");
        modeloTabla.addColumn("puesto_id");
        modeloTabla.addColumn("contrasenia");
        Object[] columna= new Object[8];
        for (EmpleadosModelo empleado:lista) {
            columna[0]=empleado.getEmpleado_id();
            columna[1]=empleado.getNombre();
            columna[2]=empleado.getApellido();
            columna[3]=empleado.getTelefono();
            columna[4]=empleado.getDireccion();
            columna[5]=empleado.getCorreo();
            columna[6]=empleado.getPuesto_id();
            columna[7]=empleado.getContrasenia();
            modeloTabla.addRow(columna);
        }
        listadoEmpleado.jTblListadoEmpleado.setModel(modeloTabla);
        eliminarEmpleado.jTblListadoEmpleado.setModel(modeloTabla);
    }
    private void borrarControladores(){
        this.insertarEmpleado.jTxtEmpleadoID.setText("");
        this.insertarEmpleado.jTxtNombre.setText("");
        this.insertarEmpleado.jTxtApellido.setText("");
        this.insertarEmpleado.jTxtTelefono.setText("");
        this.insertarEmpleado.jTxtDireccion.setText("");
        this.insertarEmpleado.jTxtCorreo.setText("");
        this.insertarEmpleado.jTxtPuestoID.setText("");
        this.insertarEmpleado.jTxtContrasenia.setText("");
        this.insertarEmpleado.jTxtEmpleadoID.requestFocus();
    }
    private void borrarControladores2(){
        this.modificarEmpleado.jTxtNombre.setText("");
        this.modificarEmpleado.jTxtApellido.setText("");
        this.modificarEmpleado.jTxtTelefono.setText("");
        this.modificarEmpleado.jTxtDireccion.setText("");
        this.modificarEmpleado.jTxtCorreo.setText("");
        this.modificarEmpleado.jTxtPuestoID.setText("");
        this.modificarEmpleado.jTxtContrasenia.setText("");
        this.modificarEmpleado.jTxtEmpleadoID.setText("");
        this.modificarEmpleado.jTxtEmpleadoID.requestFocus();
    }
    
    private void borrarControladores3(){
        this.eliminarEmpleado.jTxtEmpleadoID.setText("");
        this.eliminarEmpleado.jTxtEmpleadoID.requestFocus();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.insertarEmpleado.jBtnInsertarEmpleado){
            empleadoModelo.setEmpleado_id(this.insertarEmpleado.jTxtEmpleadoID.getText());
            empleadoModelo.setNombre(this.insertarEmpleado.jTxtNombre.getText());
            empleadoModelo.setApellido(this.insertarEmpleado.jTxtApellido.getText());
            empleadoModelo.setTelefono(Integer.parseInt(this.insertarEmpleado.jTxtTelefono.getText()));
            empleadoModelo.setDireccion(this.insertarEmpleado.jTxtDireccion.getText());
            empleadoModelo.setCorreo(this.insertarEmpleado.jTxtCorreo.getText());
            empleadoModelo.setPuesto_id(this.insertarEmpleado.jTxtPuestoID.getText());
            empleadoModelo.setContrasenia(this.insertarEmpleado.jTxtContrasenia.getText());
            mensaje=empleadoDao.insertarEmpleado(empleadoModelo);
            JOptionPane.showConfirmDialog(insertarEmpleado, mensaje);
            borrarControladores();
        }
        if(e.getSource()==this.modificarEmpleado.jBtModificarEmpleado){
            empleadoModelo.setNombre(this.modificarEmpleado.jTxtNombre.getText());
            empleadoModelo.setApellido(this.modificarEmpleado.jTxtApellido.getText());
            empleadoModelo.setTelefono(Integer.parseInt(this.modificarEmpleado.jTxtTelefono.getText()));
            empleadoModelo.setDireccion(this.modificarEmpleado.jTxtDireccion.getText());
            empleadoModelo.setCorreo(this.modificarEmpleado.jTxtCorreo.getText());
            empleadoModelo.setPuesto_id(this.modificarEmpleado.jTxtPuestoID.getText());
            empleadoModelo.setContrasenia(this.modificarEmpleado.jTxtContrasenia.getText());
            empleadoModelo.setEmpleado_id(this.modificarEmpleado.jTxtEmpleadoID.getText());
            mensaje=empleadoDao.modificarEmpleado(empleadoModelo);
            JOptionPane.showConfirmDialog(modificarEmpleado, mensaje);
            borrarControladores2();
        }
        if(e.getSource()==this.eliminarEmpleado.jBtnEliminarEmpleado){
            empleadoModelo.setEmpleado_id(this.eliminarEmpleado.jTxtEmpleadoID.getText());
            mensaje=empleadoDao.eliminarEmpleado(empleadoModelo);
            JOptionPane.showConfirmDialog(eliminarEmpleado, mensaje);
            borrarControladores3();
        }
       }
    }
