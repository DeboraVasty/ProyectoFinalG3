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
public class JIntlFrmInsertarCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form JIntlFrmCliente
     */
    public JIntlFrmInsertarCliente() {
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
        jTxtCodigo = new javax.swing.JTextField();
        jLblCodigo = new javax.swing.JLabel();
        jLblCodigo1 = new javax.swing.JLabel();
        jTxtNombre = new javax.swing.JTextField();
        jLblCodigo2 = new javax.swing.JLabel();
        jTxtApelldio = new javax.swing.JTextField();
        jLblCodigo3 = new javax.swing.JLabel();
        jTxtTelefono = new javax.swing.JTextField();
        jLblCodigo4 = new javax.swing.JLabel();
        jTxtDireccion = new javax.swing.JTextField();
        jLblCodigo5 = new javax.swing.JLabel();
        jTxtCorreo = new javax.swing.JTextField();
        jBtnInsertarCliente = new javax.swing.JButton();
        jBtnRegresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setText("Insertar Cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(280, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, -1));

        jTxtCodigo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTxtCodigo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jTxtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 207, -1));

        jLblCodigo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLblCodigo.setForeground(new java.awt.Color(255, 255, 255));
        jLblCodigo.setText("Código:");
        getContentPane().add(jLblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLblCodigo1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLblCodigo1.setForeground(new java.awt.Color(255, 255, 255));
        jLblCodigo1.setText("Nombre:");
        getContentPane().add(jLblCodigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jTxtNombre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTxtNombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jTxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 477, -1));

        jLblCodigo2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLblCodigo2.setForeground(new java.awt.Color(255, 255, 255));
        jLblCodigo2.setText("Apellido:");
        getContentPane().add(jLblCodigo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jTxtApelldio.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTxtApelldio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jTxtApelldio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 477, -1));

        jLblCodigo3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLblCodigo3.setForeground(new java.awt.Color(255, 255, 255));
        jLblCodigo3.setText("Telefono:");
        getContentPane().add(jLblCodigo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jTxtTelefono.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTxtTelefono.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jTxtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 207, -1));

        jLblCodigo4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLblCodigo4.setForeground(new java.awt.Color(255, 255, 255));
        jLblCodigo4.setText("Dirección:");
        getContentPane().add(jLblCodigo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jTxtDireccion.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTxtDireccion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jTxtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 477, -1));

        jLblCodigo5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLblCodigo5.setForeground(new java.awt.Color(255, 255, 255));
        jLblCodigo5.setText("Correo:");
        getContentPane().add(jLblCodigo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        jTxtCorreo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTxtCorreo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jTxtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 477, -1));

        jBtnInsertarCliente.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jBtnInsertarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonAgregar.jpg"))); // NOI18N
        jBtnInsertarCliente.setText("Insertar");
        getContentPane().add(jBtnInsertarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, -1, 37));

        jBtnRegresar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jBtnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_volver.jpg"))); // NOI18N
        jBtnRegresar.setText("Regresar");
        getContentPane().add(jBtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 400, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cubo.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 665, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jBtnInsertarCliente;
    public javax.swing.JButton jBtnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLblCodigo;
    public javax.swing.JLabel jLblCodigo1;
    public javax.swing.JLabel jLblCodigo2;
    public javax.swing.JLabel jLblCodigo3;
    public javax.swing.JLabel jLblCodigo4;
    public javax.swing.JLabel jLblCodigo5;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField jTxtApelldio;
    public javax.swing.JTextField jTxtCodigo;
    public javax.swing.JTextField jTxtCorreo;
    public javax.swing.JTextField jTxtDireccion;
    public javax.swing.JTextField jTxtNombre;
    public javax.swing.JTextField jTxtTelefono;
    // End of variables declaration//GEN-END:variables
}
