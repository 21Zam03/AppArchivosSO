/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zam.dao.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zam.bean.Dispositivo;
import com.zam.dao.DispositivoDao;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DispositivoDaoImpl implements DispositivoDao {

    @Override
    public List<Dispositivo> obtenerDispositivos() {
        ObjectMapper objectMapper = new ObjectMapper();
        File archivoJson = new File("src/main/resources/dispositivos/dispositivos.json");
        List<Dispositivo> listaDispositivos = null;
        try {
            listaDispositivos = objectMapper.readValue(archivoJson, new TypeReference<List<Dispositivo>>() {});
        } catch (IOException ex) {
            Logger.getLogger(DispositivoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaDispositivos;
    }
    
    
    
}
