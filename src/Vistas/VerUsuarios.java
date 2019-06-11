/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.Usuario;
import modelo.UsuarioSQL;
import modelo.hash;

/**
 *
 * @author HP
 */
public class VerUsuarios extends javax.swing.JFrame {

    Usuarios us;
    modelo.UsuarioSQL obj = new UsuarioSQL();
    modelo.Usuario user = new Usuario();
Usuario user2;
    /**
     * Creates new form VerUsuarios
     */
public VerUsuarios(Usuario us2) {
        initComponents();
        this.setLocationRelativeTo(null);
        user2=us2;
        ActualizarTabla();
    }
    public VerUsuarios() {
        initComponents();
        this.setLocationRelativeTo(null);
        ActualizarTabla();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tblUsuario = new javax.swing.JTable();
        lblMinimizar = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtNombrePersonal = new javax.swing.JTextField();
        txtEdadPersonal = new javax.swing.JTextField();
        rbtnFemenino = new javax.swing.JRadioButton();
        rbtnMasculino = new javax.swing.JRadioButton();
        pswPass = new javax.swing.JPasswordField();
        btnVolverMenu = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        cmbTipoUsuario = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1390, 800));
        setMinimumSize(new java.awt.Dimension(1390, 800));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1390, 800));
        setResizable(false);
        setSize(new java.awt.Dimension(1390, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(1390, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jScrollPane2MousePressed(evt);
            }
        });

        tblUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "IdUsuario", "Usuario", "Pass", "Nombre", "Edad", "Genero", "TipoUsuario"
            }
        ));
        tblUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsuarioMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblUsuario);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 850, 250));

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

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/btnModificar.png"))); // NOI18N
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 670, 200, 50));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/btnBuscar.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 670, 200, 50));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/btnEliminar.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 670, 200, 50));

        txtNombrePersonal.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 17)); // NOI18N
        txtNombrePersonal.setBorder(null);
        txtNombrePersonal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombrePersonalKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombrePersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 169, 205, 25));

        txtEdadPersonal.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 17)); // NOI18N
        txtEdadPersonal.setBorder(null);
        txtEdadPersonal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadPersonalKeyTyped(evt);
            }
        });
        jPanel1.add(txtEdadPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 238, 65, 25));

        rbtnFemenino.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbtnFemenino);
        rbtnFemenino.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 24)); // NOI18N
        rbtnFemenino.setText("F");
        rbtnFemenino.setBorder(null);
        jPanel1.add(rbtnFemenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 310, 30, 20));

        rbtnMasculino.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbtnMasculino);
        rbtnMasculino.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 24)); // NOI18N
        rbtnMasculino.setText("M");
        rbtnMasculino.setBorder(null);
        jPanel1.add(rbtnMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 310, 40, 20));

        pswPass.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 17)); // NOI18N
        pswPass.setBorder(null);
        jPanel1.add(pswPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(808, 307, 177, 25));

        btnVolverMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/btnVolverRegistro.png"))); // NOI18N
        btnVolverMenu.setBorder(null);
        btnVolverMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolverMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 670, -1, -1));

        txtUsuario.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 17)); // NOI18N
        txtUsuario.setBorder(null);
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 239, 205, 23));

        cmbTipoUsuario.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 24)); // NOI18N
        cmbTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione tipo de usuario", "Administrador", "Cajero" }));
        cmbTipoUsuario.setBorder(null);
        cmbTipoUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(cmbTipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 164, 220, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/datosUsuario2.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 300, 313));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/datosTipoUsuario2.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 60, 300, 313));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Usuarios2.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 13900, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public final void ActualizarTabla() {
        try {
            obj.SoloTabla(tblUsuario);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VerUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(VerUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(VerUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(VerUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int fila = tblUsuario.getSelectedRow();
        int id = Integer.parseInt(tblUsuario.getValueAt(fila, 0).toString());
        if (fila != -1) {
            try {
                user.setIdUsuario(id);
                user.setUsuario(txtUsuario.getText());

                String npass = hash.sha1(pswPass.getText());
                user.setPass(npass);
                user.setNombre(txtNombrePersonal.getText());
                user.setEdad(Integer.parseInt(txtEdadPersonal.getText()));
                //JOptionPane.showMessageDialog(this, ""+user.getEdad());
                if (rbtnMasculino.isSelected()) {
                    user.setGenero("M");
                }
                if (rbtnFemenino.isSelected()) {
                    user.setGenero("F");
                }
                user.setTipoUsuario(cmbTipoUsuario.getSelectedItem().toString());

                obj.ActualizarProducto(user, id);
            } catch (Exception e) {

            }
        } else {
            JOptionPane.showMessageDialog(this, "Por Favor seleccione un usuario de la tabla");
        }
        ActualizarTabla();

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila = tblUsuario.getSelectedRow();

        if (fila != -1) {
            int borra = JOptionPane.showConfirmDialog(this, "Seguro que desea eliminar el usuario");
            if (borra == 0) {
                user.setUsuario((txtUsuario.getText()));
                user.setIdUsuario((int) tblUsuario.getValueAt(fila, 0));
                user.setNombre(txtNombrePersonal.getText());
                obj.Eliminar(user);
            }
            if (borra == 1) {
                JOptionPane.showMessageDialog(this, "El Usuario no fue eliminado");
            }
            ActualizarTabla();

        } else {
            JOptionPane.showMessageDialog(this, "Por Favor seleccione un registro de la tabla");
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            String nom = JOptionPane.showInputDialog(this, "Ingresa el nombre del usuario a buscar");
            obj.BuscarTabla(tblUsuario, nom);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VerUsuarios.class.getName()).log(Level.SEVERE, null, "El usuario no existe");
        } catch (InstantiationException ex) {
            Logger.getLogger(VerUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(VerUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(VerUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblMinimizarMouseClicked

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        if (us == null) {
            us = new Usuarios(user2);
            us.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void btnVolverMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverMenuActionPerformed
        if (us == null) {
            us = new Usuarios(user2);
            us.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnVolverMenuActionPerformed

    private void jScrollPane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane2MouseClicked
           //
    }//GEN-LAST:event_jScrollPane2MouseClicked

    private void jScrollPane2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane2MousePressed
            //
    }//GEN-LAST:event_jScrollPane2MousePressed

    private void tblUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuarioMouseClicked
        String genero, tipo;
        int fila = tblUsuario.getSelectedRow();
        if (fila != -1) {
            txtNombrePersonal.setText((tblUsuario.getValueAt(fila, 3).toString()));
            txtEdadPersonal.setText((tblUsuario.getValueAt(fila, 4).toString()));
            txtUsuario.setText((tblUsuario.getValueAt(fila, 1).toString()));
            pswPass.setText((tblUsuario.getValueAt(fila, 2).toString()));

            tipo = (tblUsuario.getValueAt(fila, 6).toString());

            if (tipo.equals("Administrador")) {
                cmbTipoUsuario.setSelectedIndex(1);
            }
            if (tipo.equals("Cajero")) {
                cmbTipoUsuario.setSelectedIndex(2);
            }

            genero = (tblUsuario.getValueAt(fila, 5).toString());

            if (genero.equals("M")) {
                rbtnMasculino.setSelected(true);
                rbtnFemenino.setSelected(false);
            }
            if (genero.equals("F")) {
                rbtnFemenino.setSelected(true);
                rbtnMasculino.setSelected(false);
            }
        }
    }//GEN-LAST:event_tblUsuarioMouseClicked

    private void txtEdadPersonalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadPersonalKeyTyped
        int max=2;
        if(txtEdadPersonal.getText().length()>=max) evt.consume();
        
        char c=evt.getKeyChar();
        if (c<'0' ||c >'9') evt.consume();
        
    }//GEN-LAST:event_txtEdadPersonalKeyTyped

    private void txtNombrePersonalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombrePersonalKeyTyped
        char c=evt.getKeyChar();
        if ((c<'a'||c>'z')&&(c<'A'||c>'Z')) evt.consume();
    }//GEN-LAST:event_txtNombrePersonalKeyTyped

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
            java.util.logging.Logger.getLogger(VerUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVolverMenu;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbTipoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JPasswordField pswPass;
    private javax.swing.JRadioButton rbtnFemenino;
    private javax.swing.JRadioButton rbtnMasculino;
    private javax.swing.JTable tblUsuario;
    private javax.swing.JTextField txtEdadPersonal;
    private javax.swing.JTextField txtNombrePersonal;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
