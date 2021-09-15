/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author User
 */
public class Empleado {
    
    private String apellido;
    private String nombre;
    private double jornal;
    private int dias;
    
    public Empleado(){
        
    }

    public Empleado(String apellido, String Nombre, double jornal, int dias) {
        this.apellido = apellido;
        this.nombre = Nombre;
        this.jornal = jornal;
        this.dias = dias;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getJornal() {
        return jornal;
    }

    public void setJornal(double jornal) {
        this.jornal = jornal;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
    
    public double sueldo(){
        double sueldoEmpleado = jornal*dias;
        return sueldoEmpleado;
    }
    
}
