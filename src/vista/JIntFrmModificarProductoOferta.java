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
public class JIntFrmModificarProductoOferta extends javax.swing.JInternalFrame {

    /**
     * Creates new form JIntFrmModificarProductoOferta
     */
    public JIntFrmModificarProductoOferta() {
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
        jLblCodigo = new javax.swing.JLabel();
        jTxtCorrelativo = new javax.swing.JTextField();
        jLblCodigo1 = new javax.swing.JLabel();
        jTxtProductoID = new javax.swing.JTextField();
        jLblCodigo2 = new javax.swing.JLabel();
        jTxtOfertaID = new javax.swing.JTextField();
        jLblCodigo3 = new javax.swing.JLabel();
        jTxtDescuento = new javax.swing.JTextField();
        jLblCodigo7 = new javax.swing.JLabel();
        jTxtEmpleadoID = new javax.swing.JTextField();
        jLblCodigo6 = new javax.swing.JLabel();
        jTxtFechaIngreso = new javax.swing.JTextField();
        jBtModificarProductoOferta = new javax.swing.JButton();
        jBtnRegresar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Modificar Producto Oferta");

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setText("Modificar Producto Oferta");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jLabel1)
                .addContainerGap(210, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jLblCodigo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLblCodigo.setText("Correlativo:");

        jTxtCorrelativo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLblCodigo1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLblCodigo1.setText("Producto ID:");

        jTxtProductoID.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLblCodigo2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLblCodigo2.setText("Oferta ID:");

        jTxtOfertaID.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLblCodigo3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLblCodigo3.setText("Descuento:");

        jTxtDescuento.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLblCodigo7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLblCodigo7.setText("Empleado ID:");

        jTxtEmpleadoID.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLblCodigo6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLblCodigo6.setText("Fecha Ingreso:");

        jTxtFechaIngreso.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jBtModificarProductoOferta.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jBtModificarProductoOferta.setText("Modificar");

        jBtnRegresar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jBtnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_volver.jpg"))); // NOI18N
        jBtnRegresar.setText("Regresar");
        jBtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblCodigo)
                    .addComponent(jLblCodigo1)
                    .addComponent(jLblCodigo2)
                    .addComponent(jLblCodigo3)
                    .addComponent(jLblCodigo7)
                    .addComponent(jLblCodigo6))
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTxtCorrelativo)
                            .addComponent(jTxtProductoID, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtOfertaID)
                            .addComponent(jTxtDescuento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtModificarProductoOferta)
                            .addComponent(jBtnRegresar)))
                    .addComponent(jTxtFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtEmpleadoID, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtCorrelativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtProductoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblCodigo1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtOfertaID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblCodigo2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblCodigo3))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBtModificarProductoOferta)
                        .addGap(40, 40, 40)
                        .addComponent(jBtnRegresar)
                        .addGap(5, 5, 5)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtEmpleadoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblCodigo7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblCodigo6))
                .addGap(0, 18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRegresarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jBtnRegresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jBtModificarProductoOferta;
    public javax.swing.JButton jBtnRegresar;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLblCodigo;
    public javax.swing.JLabel jLblCodigo1;
    public javax.swing.JLabel jLblCodigo2;
    public javax.swing.JLabel jLblCodigo3;
    public javax.swing.JLabel jLblCodigo6;
    public javax.swing.JLabel jLblCodigo7;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField jTxtCorrelativo;
    public javax.swing.JTextField jTxtDescuento;
    public javax.swing.JTextField jTxtEmpleadoID;
    public javax.swing.JTextField jTxtFechaIngreso;
    public javax.swing.JTextField jTxtOfertaID;
    public javax.swing.JTextField jTxtProductoID;
    // End of variables declaration//GEN-END:variables
}
