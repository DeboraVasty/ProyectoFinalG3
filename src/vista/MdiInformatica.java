package vista;
import controlador.EmpleadoControlador;
import controlador.PuestosControlador;
public class MdiInformatica extends javax.swing.JFrame {

    /**
     * Creates new form MdiInformatica
     */
    public MdiInformatica() {
        initComponents(); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDeskPInformatica = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuInsertarEmpleado = new javax.swing.JMenuItem();
        jMenuModificarEmpleado = new javax.swing.JMenuItem();
        jMenuEliminarEmpleado = new javax.swing.JMenuItem();
        jMenuListadoEmpleado = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuInsertarPuesto = new javax.swing.JMenuItem();
        jMenuModificarPuesto = new javax.swing.JMenuItem();
        jMenuEliminarPuesto = new javax.swing.JMenuItem();
        jMenuListadoPuesto = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cubo.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        jDeskPInformatica.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDeskPInformaticaLayout = new javax.swing.GroupLayout(jDeskPInformatica);
        jDeskPInformatica.setLayout(jDeskPInformaticaLayout);
        jDeskPInformaticaLayout.setHorizontalGroup(
            jDeskPInformaticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDeskPInformaticaLayout.setVerticalGroup(
            jDeskPInformaticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenu1.setText("Empleados");

        jMenuInsertarEmpleado.setText("Insertar Empleado");
        jMenuInsertarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuInsertarEmpleadoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuInsertarEmpleado);

        jMenuModificarEmpleado.setText("Modificar Empleado");
        jMenuModificarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuModificarEmpleadoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuModificarEmpleado);

        jMenuEliminarEmpleado.setText("Eliminar Empleado");
        jMenuEliminarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEliminarEmpleadoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuEliminarEmpleado);

        jMenuListadoEmpleado.setText("Listado Empleado");
        jMenuListadoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuListadoEmpleadoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuListadoEmpleado);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Puestos");

        jMenuInsertarPuesto.setText("Insertar Puesto");
        jMenuInsertarPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuInsertarPuestoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuInsertarPuesto);

        jMenuModificarPuesto.setText("Modificar Puesto");
        jMenuModificarPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuModificarPuestoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuModificarPuesto);

        jMenuEliminarPuesto.setText("Eliminar Puesto");
        jMenuEliminarPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEliminarPuestoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuEliminarPuesto);

        jMenuListadoPuesto.setText("Listado Puesto");
        jMenuListadoPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuListadoPuestoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuListadoPuesto);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDeskPInformatica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDeskPInformatica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuInsertarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuInsertarEmpleadoActionPerformed
        // TODO add your handling code here:
        JIntlFrmInsertarEmpleado insertarEmpleado = new JIntlFrmInsertarEmpleado();
        EmpleadoControlador empleadoControlador = new EmpleadoControlador(insertarEmpleado);
        jDeskPInformatica.add(insertarEmpleado);
        insertarEmpleado.setVisible(true);
    }//GEN-LAST:event_jMenuInsertarEmpleadoActionPerformed

    private void jMenuModificarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuModificarEmpleadoActionPerformed
        // TODO add your handling code here:
        JIntFrmModificarEmpleado modificarEmpleado = new JIntFrmModificarEmpleado();
        EmpleadoControlador empleadoControlador = new EmpleadoControlador(modificarEmpleado);
        jDeskPInformatica.add(modificarEmpleado);
        modificarEmpleado.setVisible(true);
    }//GEN-LAST:event_jMenuModificarEmpleadoActionPerformed

    private void jMenuEliminarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEliminarEmpleadoActionPerformed
        // TODO add your handling code here:
        JIntFrmEliminarEmpleado eliminarEmpleado = new JIntFrmEliminarEmpleado();
        EmpleadoControlador empleadoControlador = new EmpleadoControlador(eliminarEmpleado);
        jDeskPInformatica.add(eliminarEmpleado);
        eliminarEmpleado.setVisible(true);
    }//GEN-LAST:event_jMenuEliminarEmpleadoActionPerformed

    private void jMenuListadoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuListadoEmpleadoActionPerformed
        // TODO add your handling code here:
        JIntFrmListadoEmpleado listadoEmpleado = new JIntFrmListadoEmpleado();
        EmpleadoControlador empleadoControlador = new EmpleadoControlador(listadoEmpleado);
        jDeskPInformatica.add(listadoEmpleado);
        listadoEmpleado.setVisible(true);
    }//GEN-LAST:event_jMenuListadoEmpleadoActionPerformed

    private void jMenuInsertarPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuInsertarPuestoActionPerformed
        // TODO add your handling code here:
        JIntFrmInsertarPuesto insertarPuesto = new JIntFrmInsertarPuesto();
        PuestosControlador puestoControlador = new PuestosControlador(insertarPuesto);
        jDeskPInformatica.add(insertarPuesto);
        insertarPuesto.setVisible(true);
    }//GEN-LAST:event_jMenuInsertarPuestoActionPerformed

    private void jMenuModificarPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuModificarPuestoActionPerformed
        // TODO add your handling code here:
        JIntFrmModificarPuesto modificarPuesto = new JIntFrmModificarPuesto();
        PuestosControlador puestoControlador = new PuestosControlador(modificarPuesto);
        jDeskPInformatica.add(modificarPuesto);
        modificarPuesto.setVisible(true);
    }//GEN-LAST:event_jMenuModificarPuestoActionPerformed

    private void jMenuEliminarPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEliminarPuestoActionPerformed
        // TODO add your handling code here:
        JIntFrmInsertarPuesto eliminarPuesto = new JIntFrmInsertarPuesto();
        PuestosControlador puestoControlador = new PuestosControlador(eliminarPuesto);
        jDeskPInformatica.add(eliminarPuesto);
        eliminarPuesto.setVisible(true);
    }//GEN-LAST:event_jMenuEliminarPuestoActionPerformed

    private void jMenuListadoPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuListadoPuestoActionPerformed
        // TODO add your handling code here:
        JIntFrmListadoPuestos listadoPuestos = new JIntFrmListadoPuestos();
        PuestosControlador puestoControlador = new PuestosControlador(listadoPuestos);
        jDeskPInformatica.add(listadoPuestos);
        listadoPuestos.setVisible(true);
    }//GEN-LAST:event_jMenuListadoPuestoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MdiInformatica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MdiInformatica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MdiInformatica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MdiInformatica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MdiInformatica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDeskPInformatica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuEliminarEmpleado;
    private javax.swing.JMenuItem jMenuEliminarPuesto;
    private javax.swing.JMenuItem jMenuInsertarEmpleado;
    private javax.swing.JMenuItem jMenuInsertarPuesto;
    private javax.swing.JMenuItem jMenuListadoEmpleado;
    private javax.swing.JMenuItem jMenuListadoPuesto;
    private javax.swing.JMenuItem jMenuModificarEmpleado;
    private javax.swing.JMenuItem jMenuModificarPuesto;
    // End of variables declaration//GEN-END:variables
}
