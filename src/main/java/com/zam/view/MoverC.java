/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.zam.view;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zam.bean.Archivo;
import com.zam.bean.Folder;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class MoverC extends javax.swing.JFrame {

    Folder folder;
    Archivo archivo;
    List<Archivo> lista;

    public MoverC(Folder folder, Archivo archivo) {
        this.folder = folder;
        this.archivo = archivo;
        this.lista = folder.getLista_Archivos();
        initComponents();
        cmbCarpetas.addItem("Archivos");
        cmbCarpetas.addItem("Musica");
        cmbCarpetas.addItem("Videos");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnMover = new javax.swing.JButton();
        cmbCarpetas = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMover.setText("Mover");
        btnMover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoverActionPerformed(evt);
            }
        });
        jPanel1.add(btnMover, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        cmbCarpetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCarpetasActionPerformed(evt);
            }
        });
        jPanel1.add(cmbCarpetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 200, -1));

        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        jLabel2.setText("Carpeta:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 20));

        txtFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/windows.png"))); // NOI18N
        jPanel1.add(txtFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 150));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCarpetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCarpetasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCarpetasActionPerformed

    private void btnMoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoverActionPerformed
        //Añadimos
        String carpeta = cmbCarpetas.getSelectedItem().toString();
        System.out.println(carpeta);
        Folder folder_nuevo = this.mover(carpeta);
        folder_nuevo.getLista_Archivos().add(this.archivo);
        this.actualizarJson(folder_nuevo);
        
        //Eliminamos
        this.lista.removeIf(p -> p.getNombre().equals(this.archivo.getNombre()));
        this.folder.setLista_Archivos(lista);
        this.actualizarJson(this.folder);
        this.dispose();
    }//GEN-LAST:event_btnMoverActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Carpeta carpeta = new Carpeta(this.folder);
        carpeta.setVisible(true);
        carpeta.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMover;
    private javax.swing.JComboBox<String> cmbCarpetas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtFondo;
    // End of variables declaration//GEN-END:variables

    public void actualizarJson(Folder folder) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            // Convertir el objeto Folder a JSON
            objectMapper.writeValue(new File("src/main/resources/" +folder.getNombre()+ ".json"), folder);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public Folder mover(String nombre) {
        ObjectMapper objectMapper = new ObjectMapper();
        Folder folder_prueba = null;
        try {
            // Leer el archivo JSON y convertirlo en una lista de objetos Folder
            folder_prueba = objectMapper.readValue(new File("src/main/resources/"+nombre+".json"), Folder.class);      
        } catch (IOException e) {
            e.printStackTrace();
        }
        return folder_prueba;
    }

}
