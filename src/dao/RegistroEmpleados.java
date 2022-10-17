/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import models.Empleado;

/**
 *
 * @author isi7
 */
public class RegistroEmpleados {
    private ArrayList<Empleado> empleadosReg = new ArrayList<>();

    
    public void aumentarSalario(String tipoCargo) {
        
        Empleado empleado = new Empleado();
        double porcentajeAumento = 0;
        for(int i = 0; i < empleadosReg.size(); i++) {
            empleado = empleadosReg.get(i);
            if(empleado.getCargo().equals(tipoCargo)) {
                switch(empleado.getCargo()) {
                case "Gerente": 
                    porcentajeAumento = (float) 0.5;
                    double salarioFinal = empleado.getSalario() + (empleado.getSalario() * porcentajeAumento);
                    empleado.setSalario(salarioFinal);
                    empleadosReg.remove(i);
                    empleadosReg.add(empleado);
                    break;
                case "Asistente":
                    porcentajeAumento = (float) 0.1;
                    break;
                case "Secretario":
                    porcentajeAumento = (float) 0.15;
                    break;
                }
            }     
        }
    }
}
