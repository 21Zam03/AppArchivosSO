/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.zam.view;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zam.bean.Archivo;
import com.zam.bean.Folder;
import com.zam.dao.FileDao;
import com.zam.dao.impl.FileDaoImpl;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Carpeta extends javax.swing.JFrame {

    Folder folder;
    List<Archivo> lista;
    FileDao fileDao = new FileDaoImpl();
    
    public Carpeta(Folder folder) {
        this.folder = folder;
        this.lista = folder.getLista_Archivos();
        initComponents();
        lblNombre.setText(folder.getNombre());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        lblNombre = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        btnAbrir = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 730, 360));
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 130, 30));

        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, -1, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, -1, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 140, -1));

        btnAbrir.setText("Abrir");
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });
        jPanel1.add(btnAbrir, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, -1, -1));

        jButton2.setText("Mover");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 450, -1, -1));

        jButton3.setText("Ver Detalles");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 450, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/escritorio.png"))); // NOI18N
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 780, 460));

        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 40, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        String nombre = txtNombre.getText();
        if (txtNombre.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "No ha escrito el nombre");
        } else {
            int num_max = this.folder.getLista_Archivos().size();
            Archivo archivo = new Archivo();
            archivo.setIdentificador(num_max + 1);
            archivo.setNombre(nombre);
            archivo.setTamaño(10);
            archivo.setTipo("txt");
            archivo.setUbicacion("/Archivos/" + archivo.getNombre()+".txt");
            archivo.setFecha(new Date());
            lista.add(archivo);
            fileDao.crearArchivo(nombre);
            this.folder.setLista_Archivos(lista);
            this.actualizarJson();
        }
        this.cargarTabla();
        txtNombre.setText("");
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (tabla1.getRowCount() > 0) {
            if (tabla1.getSelectedRow() != -1) {
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
                    String nombre = String.valueOf(tabla1.getValueAt(tabla1.getSelectedRow(), 0));
                    this.folder.getLista_Archivos().removeIf(fol -> fol.getNombre().equals(nombre));
                    fileDao.eliminarArchivo(nombre);
                    this.actualizarJson();
                    cargarTabla();
                }
            } else {
                JOptionPane.showMessageDialog(null, "No ha seleccionado una opcion");
            }
        } else {
            JOptionPane.showMessageDialog(null, "La tabla esta vacia!!");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        if (tabla1.getRowCount() > 0) {
            if (tabla1.getSelectedRow() != -1) {
                String nombre = String.valueOf(tabla1.getValueAt(tabla1.getSelectedRow(), 0));
                try {
                    // Especificar la ruta completa del archivo de texto
                    String filePath = "src/main/resources/" + nombre + ".txt";
                    // Crear un objeto File con la ruta del archivo
                    File file = new File(filePath);
                    Desktop.getDesktop().open(file);
//                    FileReader fileReader = new FileReader(file);
//                    // Crear un objeto BufferedReader para leer líneas de texto
//                    BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//                    String line;
//                    while ((line = bufferedReader.readLine()) != null) {
//                        // Procesar cada línea del archivo
//                        System.out.println(line);
//                    }
//                    bufferedReader.close();
//                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                JOptionPane.showMessageDialog(null, "No ha seleccionado una opcion");
            }
        } else {
            JOptionPane.showMessageDialog(null, "La tabla esta vacia!!");
        }
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        if (tabla1.getRowCount() > 0) {
            if (tabla1.getSelectedRow() != -1) {
                String nombre = String.valueOf(tabla1.getValueAt(tabla1.getSelectedRow(), 0));
                Optional<Archivo> archivo_filtrado = this.folder.getLista_Archivos().stream().filter(p -> p.getNombre().equals(nombre)).findFirst();
                Archivo archivo = null;
                if (archivo_filtrado.isPresent()) {
                    archivo = archivo_filtrado.get();
                }
                MoverC moverC = new MoverC(this.folder, archivo);
                moverC.setVisible(true);
                moverC.setLocationRelativeTo(null);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "No ha seleccionado una opcion");
            }
        } else {
            JOptionPane.showMessageDialog(null, "La tabla esta vacia!!");
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTable tabla1;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    public void cargarTabla() {
        //Definir modelo de la tabla
        DefaultTableModel tabla = new DefaultTableModel() {
            //Filas y columnas no seas editables
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        //Establecer los nombres de las columnas
        String titulos[] = {"Nombre", "Fecha de modificacion", "Tipo", "Tamaño"};
        tabla.setColumnIdentifiers(titulos);

        List<Archivo> lista = folder.getLista_Archivos();

        if (lista != null) {
            for (int i = 0; i < lista.size(); i++) {
                Object[] objeto = {lista.get(i).getNombre(), lista.get(i).getFecha(), lista.get(i).getTipo(),
                    lista.get(i).getTamaño()};
                //Añadimos el objeto a la una fila de la tabla
                tabla.addRow(objeto);
            }
            tabla1.setModel(tabla);
        }
    }

    public void actualizarJson() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            // Convertir el objeto Folder a JSON
            objectMapper.writeValue(new File("src/main/resources/" + this.folder.getNombre() + ".json"), folder);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
