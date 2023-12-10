/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zam.bean;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class Hilo implements Runnable {

    JProgressBar bar;
    JLabel jlabel1;
    JLabel jlabel2;
    String id;
    String imagen;
    int prioridad;
    String nombre;
    
    private static int order = 1;
    public boolean terminado = false;

    private static final Object object = new Object();

    public Hilo(JProgressBar bar, JLabel jlabel1, String id, String imagen, JLabel jlabel2, int prioridad, String nombre) {
        this.bar = bar;
        this.jlabel1 = jlabel1;
        this.jlabel2 = jlabel2;
        this.id = id;
        this.imagen = imagen;
        this.prioridad = prioridad;
        this.nombre = nombre;
    }

    @Override
    public void run() {
        synchronized (object) {
            while (prioridad != order) {
                try {
                    object.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            jlabel1.setText(id);
            ImageIcon picture = new ImageIcon(imagen);
            jlabel2.setIcon(picture);
            this.bar.setForeground(Color.GREEN);
            for (int i = 0; i < 101; i++) {
                bar.setValue(i);
                if (terminado) {
                    break;
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
            this.bar.setForeground(Color.RED);
            //JOptionPane.showMessageDialog(null, "El dispositivo: "+nombre+" fue atendido");
            order++;
            object.notifyAll();
        }
    }
}
