/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistcjsmdjur;

import models.EncontrarEdades;

/**
 *
 * @author isi7
 */
public class SistCjsmDjur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EncontrarEdades op = new EncontrarEdades();
        int edades[] = {1, 2, 3};
        double resultado = op.encontrarPromedio(edades);
        System.out.println(resultado);
    }
    
}
