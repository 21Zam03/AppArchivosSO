/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zam.dao.impl;

import com.zam.dao.FileDao;
import java.io.File;
import javax.swing.JOptionPane;

public class FileDaoImpl implements FileDao {

    @Override
    public void crearArchivo(String nombre) {
        try {
            // Especificar la ruta completa del archivo de texto a borrar
            String filePath = "src/main/resources/"+nombre+".txt";

            // Crear un objeto File con la ruta del archivo
            File file = new File(filePath);
            
            // Verificar si el archivo existe
            if (file.exists()) {
                JOptionPane.showMessageDialog(null, "El archivo ya existe");
            } else {
                file.createNewFile();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void escribir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminarArchivo(String nombre) {
        try {
            // Especificar la ruta completa del archivo de texto a borrar
            String filePath = "src/main/resources/"+nombre+".txt";

            // Crear un objeto File con la ruta del archivo
            File file = new File(filePath);

            // Verificar si el archivo existe
            if (file.exists()) {
                // Borrar el archivo
                if (file.delete()) {
                    System.out.println("El archivo de texto ha sido borrado exitosamente.");
                } else {
                    System.out.println("No se pudo borrar el archivo de texto.");
                }
            } else {
                System.out.println("El archivo de texto no existe en: " + filePath);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }   
}
