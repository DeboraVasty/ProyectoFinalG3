/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author Marvin Joel
 */
public class JIntFrmEliminarDetalleFactura extends javax.swing.JInternalFrame {

    /**
     * Creates new form JIntFrmEliminarDetalleFactura
     */
    public JIntFrmEliminarDetalleFactura() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLblCodigo1 = new javax.swing.JLabel();
        jTxtCorrelativoDetalle = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblListadoDetalleFactura = new javax.swing.JTable();
        jBtnEliminarDetalleFactura = new javax.swing.JButton();
        jBtnRegresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Eliminar Detalle Factura");

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setText("Eliminar Detalle Factura");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(254, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(232, 232, 232))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 739, -1));

        jLblCodigo1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLblCodigo1.setText("Correlativo Detalle:");
        getContentPane().add(jLblCodigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 71, -1, -1));

        jTxtCorrelativoDetalle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(jTxtCorrelativoDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 68, 207, -1));

        jTblListadoDetalleFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "correlativo_detalle", "producto_id", "oferta_id", "cantidad", "precio", "correlativo_factura"
            }
        ));
        jScrollPane1.setViewportView(jTblListadoDetalleFactura);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 114, 719, 298));

        jBtnEliminarDetalleFactura.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jBtnEliminarDetalleFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/elimBoton.jpg"))); // NOI18N
        jBtnEliminarDetalleFactura.setText("Eliminar");
        getContentPane().add(jBtnEliminarDetalleFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 430, 167, 42));

        jBtnRegresar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jBtnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_volver.jpg"))); // NOI18N
        jBtnRegresar.setText("Regresar");
        getContentPane().add(jBtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 430, -1, 40));
        jBtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRegresarActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cubo.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRegresarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jBtnRegresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jBtnEliminarDetalleFactura;
    public javax.swing.JButton jBtnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLblCodigo1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTblListadoDetalleFactura;
    public javax.swing.JTextField jTxtCorrelativoDetalle;
    // End of variables declaration//GEN-END:variables
}
