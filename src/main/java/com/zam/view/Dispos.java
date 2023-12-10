/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.zam.view;

import com.zam.bean.Dispositivo;
import com.zam.bean.Hilo;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class Dispos extends javax.swing.JFrame {

    List<Dispositivo> lista;
    List<Dispositivo> dispositivos = new ArrayList<>();

    public Dispos(List<Dispositivo> lista) {
        this.lista = lista;
        initComponents();
        this.txtPrio1.setEditable(false);
        this.txtPrio2.setEditable(false);
        this.txtPrio3.setEditable(false);
        this.txtPrio4.setEditable(false);
        this.txtPrio5.setEditable(false);
        lblDis1.setVisible(false);
        lblDis2.setVisible(false);
        lblDis3.setVisible(false);
        lblDis4.setVisible(false);
        lblDis5.setVisible(false);
        lblCod1.setVisible(false);
        lblCod2.setVisible(false);
        lblCod3.setVisible(false);
        lblCod4.setVisible(false);
        lblCod5.setVisible(false);
        cmbDispositivo.addItem("");
        for (int i = 0; i < lista.size(); i++) {
            cmbDispositivo.addItem(lista.get(i).getNombre());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbDispositivo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnConectar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblDis1 = new javax.swing.JLabel();
        lblDis2 = new javax.swing.JLabel();
        lblDis3 = new javax.swing.JLabel();
        lblDis4 = new javax.swing.JLabel();
        lblDis5 = new javax.swing.JLabel();
        txtPrio1 = new javax.swing.JTextField();
        txtPrio2 = new javax.swing.JTextField();
        txtPrio3 = new javax.swing.JTextField();
        txtPrio4 = new javax.swing.JTextField();
        txtPrio5 = new javax.swing.JTextField();
        lblCod1 = new javax.swing.JLabel();
        lblCod2 = new javax.swing.JLabel();
        lblCod3 = new javax.swing.JLabel();
        lblCod4 = new javax.swing.JLabel();
        lblCod5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblpic1 = new javax.swing.JLabel();
        lblpic2 = new javax.swing.JLabel();
        lblpic3 = new javax.swing.JLabel();
        lblpic4 = new javax.swing.JLabel();
        lblpic5 = new javax.swing.JLabel();
        bar2 = new javax.swing.JProgressBar();
        bar3 = new javax.swing.JProgressBar();
        bar5 = new javax.swing.JProgressBar();
        bar4 = new javax.swing.JProgressBar();
        lblDis_1 = new javax.swing.JLabel();
        lblDis_2 = new javax.swing.JLabel();
        lblDis_3 = new javax.swing.JLabel();
        lblDis_5 = new javax.swing.JLabel();
        lblDis_4 = new javax.swing.JLabel();
        bar1 = new javax.swing.JProgressBar();
        txtPrioridad = new javax.swing.JTextField();
        btnEjecutar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.add(cmbDispositivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 170, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("SELECCIONAR DISPOSITIVO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        btnConectar.setText("Conectar");
        btnConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConectar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, -1));

        jButton2.setText("X");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Dispositivos conectados en cola:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 190, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDis1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(lblDis1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 70, 40));

        lblDis2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(lblDis2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 70, 40));

        lblDis3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(lblDis3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 70, 40));

        lblDis4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(lblDis4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 70, 40));

        lblDis5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblDis5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(lblDis5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 70, 40));

        txtPrio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrio1ActionPerformed(evt);
            }
        });
        jPanel2.add(txtPrio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 40, -1));
        jPanel2.add(txtPrio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 40, -1));

        txtPrio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrio3ActionPerformed(evt);
            }
        });
        jPanel2.add(txtPrio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 40, -1));
        jPanel2.add(txtPrio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 40, -1));
        jPanel2.add(txtPrio5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 40, -1));

        lblCod1.setText("001");
        jPanel2.add(lblCod1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 30, 20));

        lblCod2.setText("002");
        jPanel2.add(lblCod2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 30, 20));

        lblCod3.setText("003");
        jPanel2.add(lblCod3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 30, 20));

        lblCod4.setText("004");
        jPanel2.add(lblCod4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 30, 20));

        lblCod5.setText("005");
        jPanel2.add(lblCod5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 30, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 240, 350));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        lblpic1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblpic2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblpic3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblpic4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblpic5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        bar2.setStringPainted(true);

        bar3.setStringPainted(true);

        bar5.setStringPainted(true);

        bar4.setStringPainted(true);

        bar1.setStringPainted(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblDis_2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDis_3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDis_5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDis_4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblDis_1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblpic5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblpic4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblpic3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblpic2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblpic1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bar5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblpic1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(lblDis_1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bar1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblDis_2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(lblDis_3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(lblDis_4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addComponent(lblDis_5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblpic2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(bar2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(bar3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblpic3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblpic4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(bar4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblpic5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(bar5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)))))
                .addGap(36, 36, 36))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 340, 350));
        jPanel1.add(txtPrioridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 80, -1));

        btnEjecutar.setText("Ejecutar");
        btnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEjecutar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Orden de atención");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, -1, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/windows.png"))); // NOI18N
        jPanel1.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarActionPerformed
        if (txtPrioridad.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "No digitado la prioridad");
        } else {
            Dispositivo dispositivo = new Dispositivo();
            int numero = cmbDispositivo.getSelectedIndex();
            ImageIcon imagen = new ImageIcon(lista.get(numero - 1).getImagen());
            String num = txtPrioridad.getText();
            String nombre = cmbDispositivo.getSelectedItem().toString();
            String rutaImagen = lista.get(numero - 1).getImagen();
            if (lblDis1.isVisible()) {
                if (lblDis2.isVisible()) {
                    if (lblDis3.isVisible()) {
                        if (lblDis4.isVisible()) {
                            if (lblDis5.isVisible()) {
                                btnConectar.setEnabled(false);
                            } else {
                                txtPrio5.setText(String.valueOf(num));
                                lblDis5.setVisible(true);
                                lblDis5.setIcon(imagen);
                                lblCod5.setVisible(true);
                                dispositivo.setId("005");
                                dispositivo.setNombre(nombre);
                                dispositivo.setImagen(rutaImagen);
                                dispositivo.setPrioridad(Integer.parseInt(num));
                                this.dispositivos.add(dispositivo);
                            }
                        } else {
                            txtPrio4.setText(String.valueOf(num));
                            lblDis4.setVisible(true);
                            lblDis4.setIcon(imagen);
                            lblCod4.setVisible(true);
                            dispositivo.setId("004");
                            dispositivo.setNombre(nombre);
                            dispositivo.setImagen(rutaImagen);
                            dispositivo.setPrioridad(Integer.parseInt(num));
                            this.dispositivos.add(dispositivo);
                        }
                    } else {
                        txtPrio3.setText(String.valueOf(num));
                        lblDis3.setVisible(true);
                        lblDis3.setIcon(imagen);
                        lblCod3.setVisible(true);
                        dispositivo.setId("003");
                        dispositivo.setNombre(nombre);
                        dispositivo.setImagen(rutaImagen);
                        dispositivo.setPrioridad(Integer.parseInt(num));
                        this.dispositivos.add(dispositivo);
                    }
                } else {
                    txtPrio2.setText(String.valueOf(num));
                    lblDis2.setVisible(true);
                    lblDis2.setIcon(imagen);
                    lblCod2.setVisible(true);
                    dispositivo.setId("002");
                    dispositivo.setNombre(nombre);
                    dispositivo.setImagen(rutaImagen);
                    dispositivo.setPrioridad(Integer.parseInt(num));
                    this.dispositivos.add(dispositivo);
                }
            } else {
                txtPrio1.setText(String.valueOf(num));
                lblDis1.setVisible(true);
                lblDis1.setIcon(imagen);
                lblCod1.setVisible(true);
                dispositivo.setId("001");
                dispositivo.setNombre(nombre);
                dispositivo.setImagen(rutaImagen);
                dispositivo.setPrioridad(Integer.parseInt(num));
                this.dispositivos.add(dispositivo);
            }
            txtPrioridad.setText("");
        }
    }//GEN-LAST:event_btnConectarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtPrio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrio3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrio3ActionPerformed

    private void txtPrio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrio1ActionPerformed

    private void btnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarActionPerformed
        if (!lblDis1.isVisible()) {
            JOptionPane.showMessageDialog(null, "No ha seleccionado un dispositivo");
        } else {
            Collections.sort(this.dispositivos, Comparator.comparingInt(Dispositivo::getPrioridad));
            List<JLabel> listaLabels2 = new ArrayList<>();
            listaLabels2.add(this.lblDis_1);
            listaLabels2.add(this.lblDis_2);
            listaLabels2.add(this.lblDis_3);
            listaLabels2.add(this.lblDis_4);
            listaLabels2.add(this.lblDis_5);

            List<JLabel> listaPictures = new ArrayList<>();
            listaPictures.add(this.lblpic1);
            listaPictures.add(this.lblpic2);
            listaPictures.add(this.lblpic3);
            listaPictures.add(this.lblpic4);
            listaPictures.add(this.lblpic5);

            List<JProgressBar> listaBares = new ArrayList<>();
            listaBares.add(this.bar1);
            listaBares.add(this.bar2);
            listaBares.add(this.bar3);
            listaBares.add(this.bar4);
            listaBares.add(this.bar5);
//            for (int i = 0; i < this.dispositivos.size(); i++) {
//                listaLabels2.get(i).setText(this.dispositivos.get(i).getId());
//                ImageIcon imagen = new ImageIcon(this.dispositivos.get(i).getImagen());
//                listaPictures.get(i).setIcon(imagen);
//            }
            for (int i = 0; i < this.dispositivos.size(); i++) {
                Hilo hilo1 = new Hilo(listaBares.get(i), listaLabels2.get(i), this.dispositivos.get(i).getId(), this.dispositivos.get(i).getImagen(), listaPictures.get(i), this.dispositivos.get(i).getPrioridad(), this.dispositivos.get(i).getId());
                Thread h1 = new Thread(hilo1, "Hilo1");
                h1.start();
            }   
        }
    }//GEN-LAST:event_btnEjecutarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar bar1;
    private javax.swing.JProgressBar bar2;
    private javax.swing.JProgressBar bar3;
    private javax.swing.JProgressBar bar4;
    private javax.swing.JProgressBar bar5;
    private javax.swing.JButton btnConectar;
    private javax.swing.JButton btnEjecutar;
    private javax.swing.JComboBox<String> cmbDispositivo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblCod1;
    private javax.swing.JLabel lblCod2;
    private javax.swing.JLabel lblCod3;
    private javax.swing.JLabel lblCod4;
    private javax.swing.JLabel lblCod5;
    private javax.swing.JLabel lblDis1;
    private javax.swing.JLabel lblDis2;
    private javax.swing.JLabel lblDis3;
    private javax.swing.JLabel lblDis4;
    private javax.swing.JLabel lblDis5;
    private javax.swing.JLabel lblDis_1;
    private javax.swing.JLabel lblDis_2;
    private javax.swing.JLabel lblDis_3;
    private javax.swing.JLabel lblDis_4;
    private javax.swing.JLabel lblDis_5;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblpic1;
    private javax.swing.JLabel lblpic2;
    private javax.swing.JLabel lblpic3;
    private javax.swing.JLabel lblpic4;
    private javax.swing.JLabel lblpic5;
    private javax.swing.JTextField txtPrio1;
    private javax.swing.JTextField txtPrio2;
    private javax.swing.JTextField txtPrio3;
    private javax.swing.JTextField txtPrio4;
    private javax.swing.JTextField txtPrio5;
    private javax.swing.JTextField txtPrioridad;
    // End of variables declaration//GEN-END:variables
}
