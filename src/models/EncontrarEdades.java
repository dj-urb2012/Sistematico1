/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author isi7
 */
public class EncontrarEdades {
    private int arrayEdades[] = new int[15];
    
    public int encontrarEdadAlta(int edades[]) {
        arrayEdades = edades.clone();
        int resultado = arrayEdades[0];
        for(int i = 0; i < arrayEdades.length; i++) {
            if(arrayEdades[i] < resultado) {
                resultado = arrayEdades[i];
            }
        }
        return resultado;
    }
    
    
}
