/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

import java.util.ArrayList;

/**
 *
 * @author ANDRES GARCES
 */
public class Persona {
    
    public String Nombre;
    public String Apellido;
    public String Cedula;
    public String Direccion;
    public ArrayList <Computador> lsPC;

    public Persona() {
    }

    public Persona(String Nombre, String Apellido, String Cedula, String Direccion) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Cedula = Cedula;
        this.Direccion = Direccion;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getCedula() {
        return Cedula;
    }

    public String getDireccion() {
        return Direccion;
    }
    
    public ArrayList <Computador> getLsPC() {
        return lsPC;
    }

    public void setLsPC(ArrayList <Computador> lsPC) {
        this.lsPC = lsPC;
    }
}
