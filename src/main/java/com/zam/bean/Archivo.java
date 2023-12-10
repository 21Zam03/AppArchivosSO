/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zam.bean;

import java.util.Date;
import lombok.Data;

@Data
public class Archivo {
    
    Integer identificador;
    String nombre;
    String tipo;
    String ubicacion;
    Integer tamaño;
    Date fecha;
    
}
