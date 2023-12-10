/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.zam.main;

import com.zam.bean.Archivo;
import com.zam.view.Inicio;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Archivo> lista = new ArrayList<>();
////        File file1 = new File();
////        File file2 = new File();
////        File file3 = new File();
////        File file4 = new File();
////        File file5 = new File();
////        
////        file1.setNombre("Papelera");
////        file1.setTipo("ppl");
////        file2.setNombre("Ex. Archivos");
////        file2.setTipo("Carpeta de archivos");
////        file3.setNombre("Archivos");
////        file3.setTipo("Carpeta de archivos");
////        file4.setNombre("Musica");
////        file4.setTipo("Carpeta de archivos");
////        file5.setNombre("Videos");
////        file5.setTipo("Carpeta de archivos");
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        inicio.setLocationRelativeTo(null);     
    }
}
