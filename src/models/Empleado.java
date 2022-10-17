/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author isi7
 */
public class Empleado {
    private String nombres;
    private String cargo;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombres, String cargo, double salario) {
        this.nombres = nombres;
        this.cargo = cargo;
        this.salario = salario;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("nombres=").append(nombres);
        sb.append(", cargo=").append(cargo);
        sb.append(", salario=").append(salario);
        sb.append('}');
        return sb.toString();
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
}
