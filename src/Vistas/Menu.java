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
public class Menu extends javax.swing.JFrame {
Usuarios usu;
    /**
     * Creates new form Menu
     */
    public Menu() {
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
        btnProductos = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnAtender = new javax.swing.JButton();
        btnCubiertos = new javax.swing.JButton();
        btnMesas = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        lblMinimizar = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();
        lblMesas = new javax.swing.JLabel();
        lblUsuarios = new javax.swing.JLabel();
        lblAtender = new javax.swing.JLabel();
        lblProductos = new javax.swing.JLabel();
        lblCubiertos = new javax.swing.JLabel();
        lblVentas = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblInterfaz = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setExtendedState(6);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/btnProductos.png"))); // NOI18N
        jPanel1.add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 620, 200, 100));

        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/btnUsuarios.png"))); // NOI18N
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });
        jPanel1.add(btnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, 200, 100));

        btnAtender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/btnAtender.png"))); // NOI18N
        jPanel1.add(btnAtender, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 620, 200, 100));

        btnCubiertos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/btnCubiertos.png"))); // NOI18N
        jPanel1.add(btnCubiertos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1155, 620, 200, 100));

        btnMesas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/btnMesas.png"))); // NOI18N
        jPanel1.add(btnMesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 620, 200, 100));

        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/btnVentas.png"))); // NOI18N
        jPanel1.add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 620, 200, 100));

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

        lblMesas.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 36)); // NOI18N
        lblMesas.setForeground(new java.awt.Color(255, 255, 255));
        lblMesas.setText("Mesas");
        jPanel1.add(lblMesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 60, -1));

        lblUsuarios.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 36)); // NOI18N
        lblUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuarios.setText("Usuarios");
        jPanel1.add(lblUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 90, -1));

        lblAtender.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 36)); // NOI18N
        lblAtender.setForeground(new java.awt.Color(255, 255, 255));
        lblAtender.setText("Atender");
        jPanel1.add(lblAtender, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 80, -1));

        lblProductos.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 36)); // NOI18N
        lblProductos.setForeground(new java.awt.Color(255, 255, 255));
        lblProductos.setText("Productos");
        jPanel1.add(lblProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 110, -1));

        lblCubiertos.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 36)); // NOI18N
        lblCubiertos.setForeground(new java.awt.Color(255, 255, 255));
        lblCubiertos.setText("Cubiertos");
        jPanel1.add(lblCubiertos, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 100, -1));

        lblVentas.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 36)); // NOI18N
        lblVentas.setForeground(new java.awt.Color(255, 255, 255));
        lblVentas.setText("Ventas");
        jPanel1.add(lblVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 70, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Baja.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 710, 1390, 100));

        lblInterfaz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Menuchido.png"))); // NOI18N
        jPanel1.add(lblInterfaz, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 710));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1390, 810);

        setLocation(new java.awt.Point(0, 0));
    }// </editor-fold>//GEN-END:initComponents

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked
        this.setState(JFrame.ICONIFIED); //minimizar la ventana
    }//GEN-LAST:event_lblMinimizarMouseClicked

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        System.exit(0); //cerrar la ventana
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
 if (usu==null) {
                        usu = new Usuarios();
                        usu.setVisible(true);
                        this.dispose();
                    }        // TODO add your handling code here:
    }//GEN-LAST:event_btnUsuariosActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtender;
    private javax.swing.JButton btnCubiertos;
    private javax.swing.JButton btnMesas;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btnVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAtender;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblCubiertos;
    private javax.swing.JLabel lblInterfaz;
    private javax.swing.JLabel lblMesas;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblProductos;
    private javax.swing.JLabel lblUsuarios;
    private javax.swing.JLabel lblVentas;
    // End of variables declaration//GEN-END:variables
}
