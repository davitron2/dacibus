/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import javax.swing.JFrame;

/**
 *
 * @author JOCELYNE
 */
public class Usuarios extends javax.swing.JFrame {

    /**
     * Creates new form Usuarios
     */
    Menu men;
    public Usuarios() {
        initComponents();
        //this.setLocationRelativeTo(null); //centro de la pantalla
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblMinimizar = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();
        txtNombrePersonal = new javax.swing.JTextField();
        txtEdadPersonal = new javax.swing.JTextField();
        rbtnMasculino = new javax.swing.JRadioButton();
        rbtnFemenino = new javax.swing.JRadioButton();
        cmbTipoUsuario = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        lblDatosPersonales = new javax.swing.JLabel();
        lblDatosTipoUsuario = new javax.swing.JLabel();
        btnVerUsuarios = new javax.swing.JButton();
        btnRegistrarUsuario = new javax.swing.JButton();
        btnVolverMenu = new javax.swing.JButton();
        lblUsuarios = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMinimizar.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 36)); // NOI18N
        lblMinimizar.setForeground(new java.awt.Color(255, 255, 255));
        lblMinimizar.setText("-");
        lblMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseClicked(evt);
            }
        });
        jPanel1.add(lblMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 10, 20, 30));

        lblCerrar.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 36)); // NOI18N
        lblCerrar.setForeground(new java.awt.Color(255, 255, 255));
        lblCerrar.setText("X");
        lblCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
        });
        jPanel1.add(lblCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 10, 20, 30));

        txtNombrePersonal.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 24)); // NOI18N
        txtNombrePersonal.setBorder(null);
        jPanel1.add(txtNombrePersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 270, 320, 50));

        txtEdadPersonal.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 24)); // NOI18N
        txtEdadPersonal.setBorder(null);
        jPanel1.add(txtEdadPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 380, 90, 50));

        rbtnMasculino.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbtnMasculino);
        rbtnMasculino.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 24)); // NOI18N
        rbtnMasculino.setText("M");
        rbtnMasculino.setBorder(null);
        jPanel1.add(rbtnMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 500, -1, -1));

        rbtnFemenino.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbtnFemenino);
        rbtnFemenino.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 24)); // NOI18N
        rbtnFemenino.setText("F");
        rbtnFemenino.setBorder(null);
        jPanel1.add(rbtnFemenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 500, -1, -1));

        cmbTipoUsuario.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 24)); // NOI18N
        cmbTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione tipo de usuario", "Administrador", "Cajero" }));
        cmbTipoUsuario.setBorder(null);
        cmbTipoUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(cmbTipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(825, 270, 350, 50));

        jTextField1.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 24)); // NOI18N
        jTextField1.setBorder(null);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(839, 380, 330, 50));

        jPasswordField1.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 24)); // NOI18N
        jPasswordField1.setBorder(null);
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(891, 490, 270, 50));

        lblDatosPersonales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/datosUsuario.png"))); // NOI18N
        lblDatosPersonales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(lblDatosPersonales, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 480, 500));

        lblDatosTipoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/datosTipoUsuario.png"))); // NOI18N
        lblDatosTipoUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(lblDatosTipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 100, 480, -1));

        btnVerUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/btnVerUsuarios.png"))); // NOI18N
        btnVerUsuarios.setBorder(null);
        btnVerUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerUsuariosActionPerformed(evt);
            }
        });
        jPanel1.add(btnVerUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 675, 200, 50));

        btnRegistrarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/btnRegistrar.png"))); // NOI18N
        btnRegistrarUsuario.setBorder(null);
        btnRegistrarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 675, -1, -1));

        btnVolverMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/btnVolverMenu.png"))); // NOI18N
        btnVolverMenu.setBorder(null);
        btnVolverMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolverMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolverMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(845, 675, 200, 50));

        lblUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Usuarios.png"))); // NOI18N
        lblUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(lblUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 800));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1390, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked
        this.setState(JFrame.ICONIFIED); //minimizar la ventana
    }//GEN-LAST:event_lblMinimizarMouseClicked

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
          if (men==null) {
                        men = new Menu();
                        men.setVisible(true);
                        this.dispose();
                    }//cerrar la ventana
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void btnVolverMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverMenuActionPerformed
  if (men==null) {
                        men = new Menu();
                        men.setVisible(true);
                        this.dispose();
                    }
        
        
               // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverMenuActionPerformed

    private void btnVerUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerUsuariosActionPerformed

    private void btnRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarUsuario;
    private javax.swing.JButton btnVerUsuarios;
    private javax.swing.JButton btnVolverMenu;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbTipoUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblDatosPersonales;
    private javax.swing.JLabel lblDatosTipoUsuario;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblUsuarios;
    private javax.swing.JRadioButton rbtnFemenino;
    private javax.swing.JRadioButton rbtnMasculino;
    private javax.swing.JTextField txtEdadPersonal;
    private javax.swing.JTextField txtNombrePersonal;
    // End of variables declaration//GEN-END:variables
}
