/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author isi7
 */
public class EncontrarEdades {    
    public int encontrarEdadMasAlta(int[] edades) {
        int resultado = edades[0];
        for(int i = 0; i < edades.length; i++) {
            if(edades[i] > resultado) {
                resultado = edades[i];
            }
        }
        return resultado;
    }
    
    
    public int encontrarEdadMasBaja(int[] edades) {
        int i = 0;
        int resultado = edades[i];
        while(i < edades.length) {
            if(edades[i] < resultado) {
                resultado = edades[i];
            }
            i++;
        }
        return resultado;
    }
    
    public double encontrarPromedio(int[] edades) {
        int i = 0;
        double prom = 0;
        int suma = 0;
        do{
            suma += edades[i];
            i++;
        } while(i < edades.length);
        prom = (double)suma/(double)edades.length;
        return prom;
    }
    
}
