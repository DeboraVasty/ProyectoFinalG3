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
public class JIntFrmModificarPuesto extends javax.swing.JInternalFrame {

    /**
     * Creates new form JIntFrmModificarPuesto
     */
    public JIntFrmModificarPuesto() {
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
        jLblCodigo1 = new javax.swing.JLabel();
        jLblCodigo2 = new javax.swing.JLabel();
        jTxtPuestoID = new javax.swing.JTextField();
        jTxtNombre = new javax.swing.JTextField();
        jTxtDireccion = new javax.swing.JTextField();
        jBtnRegresar = new javax.swing.JButton();
        jBtnModificarPuesto = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setText("Modificar Puesto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLblCodigo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLblCodigo.setText("Puesto ID:");

        jLblCodigo1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLblCodigo1.setText("Nombre:");

        jLblCodigo2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLblCodigo2.setText("Direccion:");

        jTxtPuestoID.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jTxtNombre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jTxtDireccion.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jBtnRegresar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jBtnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_volver.jpg"))); // NOI18N
        jBtnRegresar.setText("Regresar");

        jBtnModificarPuesto.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jBtnModificarPuesto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar.jpg"))); // NOI18N
        jBtnModificarPuesto.setText("Modificar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnModificarPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnRegresar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblCodigo)
                            .addComponent(jLblCodigo1)
                            .addComponent(jLblCodigo2))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTxtPuestoID, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                            .addComponent(jTxtNombre)
                            .addComponent(jTxtDireccion))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblCodigo)
                    .addComponent(jTxtPuestoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblCodigo1)
                    .addComponent(jTxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblCodigo2)
                    .addComponent(jTxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnModificarPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnRegresar))
                .addGap(0, 38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jBtnModificarPuesto;
    public javax.swing.JButton jBtnRegresar;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLblCodigo;
    public javax.swing.JLabel jLblCodigo1;
    public javax.swing.JLabel jLblCodigo2;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField jTxtDireccion;
    public javax.swing.JTextField jTxtNombre;
    public javax.swing.JTextField jTxtPuestoID;
    // End of variables declaration//GEN-END:variables
}