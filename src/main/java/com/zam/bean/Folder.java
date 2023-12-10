/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zam.bean;

import java.util.Date;
import java.util.List;
import lombok.Data;

@Data
public class Folder {
    
    Integer identificador;
    String nombre;
    String tipo;
    String ubicacion;
    Integer tamaño;
    Date fecha;
    List<Archivo> lista_Archivos;
}
