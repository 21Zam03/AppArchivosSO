/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.zam.view;

import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zam.bean.Dispositivo;
import com.zam.bean.Folder;
import com.zam.dao.DispositivoDao;
import com.zam.dao.impl.DispositivoDaoImpl;
import java.io.IOException;
import java.util.List;
import javax.swing.JOptionPane;

public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        btnCarpeta_5.setVisible(false);
        btnCarpeta_1.setVisible(false);
        btnCarpeta_2.setVisible(false);
        btnCarpeta_3.setVisible(false);
        btn_Carpeta_4.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnCarpeta_5 = new javax.swing.JButton();
        lblNombre_1 = new javax.swing.JLabel();
        btnCarpeta_1 = new javax.swing.JButton();
        btnCarpeta_2 = new javax.swing.JButton();
        btnCarpeta_3 = new javax.swing.JButton();
        btn_Carpeta_4 = new javax.swing.JButton();
        lblNombre_2 = new javax.swing.JLabel();
        lblNombre_3 = new javax.swing.JLabel();
        lblNombre_4 = new javax.swing.JLabel();
        lblNombre_5 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        cmbCrear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carpeta.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 30, 30));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carpeta.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 30, 30));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carpeta.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 30, 30));

        jLabel1.setText("Archivos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel2.setText("Musica");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel3.setText("Videos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        jLabel5.setText("Papelera");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 30, 30));
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 30, 30));

        jLabel6.setText("Ex. archivos");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 70, -1));

        btnCarpeta_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carpeta.png"))); // NOI18N
        jPanel1.add(btnCarpeta_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 30, 30));
        jPanel1.add(lblNombre_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 50, 20));

        btnCarpeta_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carpeta.png"))); // NOI18N
        btnCarpeta_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarpeta_1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnCarpeta_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 30, 30));

        btnCarpeta_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carpeta.png"))); // NOI18N
        btnCarpeta_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarpeta_2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnCarpeta_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 30, 30));

        btnCarpeta_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carpeta.png"))); // NOI18N
        jPanel1.add(btnCarpeta_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 30, 30));

        btn_Carpeta_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carpeta.png"))); // NOI18N
        jPanel1.add(btn_Carpeta_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 30, 30));
        jPanel1.add(lblNombre_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 60, 20));
        jPanel1.add(lblNombre_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 60, 20));
        jPanel1.add(lblNombre_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 60, 20));
        jPanel1.add(lblNombre_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 60, 20));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/windows.png"))); // NOI18N
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 410));

        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, -1, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, -1, -1));

        jButton3.setText("CMD");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, -1, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 150, -1));

        cmbCrear.setText("Conectar Dispositivo");
        cmbCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCrearActionPerformed(evt);
            }
        });
        jPanel1.add(cmbCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ObjectMapper objectMapper = new ObjectMapper();
        Folder folder = null;
        try {
            // Leer el archivo JSON y convertirlo en una lista de objetos Folder
            folder = objectMapper.readValue(new File("src/main/resources/archivos.json"), Folder.class);      
        } catch (IOException e) {
            e.printStackTrace();
        }
        Carpeta carpeta = new Carpeta(folder);
        carpeta.setVisible(true);
        carpeta.setLocationRelativeTo(null);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        if (txtNombre.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "No ha escrito el nombre");
        } else {
            String nombre = txtNombre.getText();
            if (btnCarpeta_1.isVisible()) {
                if (btnCarpeta_2.isVisible()) {
                    if (btnCarpeta_3.isVisible()) {
                        if (btn_Carpeta_4.isVisible()) {
                            if (btnCarpeta_5.isVisible()) {
                                JOptionPane.showMessageDialog(null, "No hay espacio");
                            } else {
                                btnCarpeta_5.setVisible(true);
                                lblNombre_5.setText(nombre);
                                txtNombre.setText("");
                            }
                        } else {
                            btn_Carpeta_4.setVisible(true);
                            lblNombre_4.setText(nombre);
                            txtNombre.setText("");
                        }
                    } else {
                        btnCarpeta_3.setVisible(true);
                        lblNombre_3.setText(nombre);
                        txtNombre.setText("");
                    }
                } else {
                    btnCarpeta_2.setVisible(true);
                    lblNombre_2.setText(nombre);
                    txtNombre.setText("");
                }
            } else {
                btnCarpeta_1.setVisible(true);
                lblNombre_1.setText(nombre);
                txtNombre.setText("");
            }
        }
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnCarpeta_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarpeta_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCarpeta_1ActionPerformed

    private void btnCarpeta_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarpeta_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCarpeta_2ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (txtNombre.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "No ha escrito el nombre");
        } else {
            String nombre = txtNombre.getText();
            int seleccion = JOptionPane.showOptionDialog(
                    null, //Componenete
                    "Esta seguro que desea eliminar?", //Mensaje
                    "Intento de eliminacion", //Titulo
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null, //Icono... al poner null el icono sera por defecto
                    new Object[]{"Si", "No"},
                    "Si");
            if (seleccion == 0) {
                if (nombre.equals(lblNombre_1.getText())) {
                    btnCarpeta_1.setVisible(false);
                    lblNombre_1.setText("");
                } else if (nombre.equals(lblNombre_2.getText())) {
                    btnCarpeta_2.setVisible(false);
                    lblNombre_2.setText("");
                } else if (nombre.equals(lblNombre_3.getText())) {
                    btnCarpeta_3.setVisible(false);
                    lblNombre_3.setText("");
                } else if (nombre.equals(lblNombre_4.getText())) {
                    btn_Carpeta_4.setVisible(false);
                    lblNombre_4.setText("");
                } else if (nombre.equals(lblNombre_5.getText())) {
                    btnCarpeta_5.setVisible(false);
                    lblNombre_5.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "No existe la carpeta");
                }
            }
            txtNombre.setText("");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ObjectMapper objectMapper = new ObjectMapper();
        Folder folder = null;
        try {
            // Leer el archivo JSON y convertirlo en una lista de objetos Folder
            folder = objectMapper.readValue(new File("src/main/resources/musica.json"), Folder.class);      
        } catch (IOException e) {
            e.printStackTrace();
        }
        Carpeta carpeta = new Carpeta(folder);
        carpeta.setVisible(true);
        carpeta.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        ObjectMapper objectMapper = new ObjectMapper();
        Folder folder = null;
        try {
            // Leer el archivo JSON y convertirlo en una lista de objetos Folder
            folder = objectMapper.readValue(new File("src/main/resources/videos.json"), Folder.class);      
        } catch (IOException e) {
            e.printStackTrace();
        }
        Carpeta carpeta = new Carpeta(folder);
        carpeta.setVisible(true);
        carpeta.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void cmbCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCrearActionPerformed
        DispositivoDao dispositivoDao = new DispositivoDaoImpl();
        List<Dispositivo> lista = dispositivoDao.obtenerDispositivos();
        Dispos dispos = new Dispos(lista);
        dispos.setVisible(true);
        dispos.setLocationRelativeTo(null);
    }//GEN-LAST:event_cmbCrearActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCarpeta_1;
    private javax.swing.JButton btnCarpeta_2;
    private javax.swing.JButton btnCarpeta_3;
    private javax.swing.JButton btnCarpeta_5;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btn_Carpeta_4;
    private javax.swing.JButton cmbCrear;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNombre_1;
    private javax.swing.JLabel lblNombre_2;
    private javax.swing.JLabel lblNombre_3;
    private javax.swing.JLabel lblNombre_4;
    private javax.swing.JLabel lblNombre_5;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
