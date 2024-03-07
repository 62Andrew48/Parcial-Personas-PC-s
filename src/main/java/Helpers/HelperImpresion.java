/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

import Logica_Negocio.Persona;
import java.util.ArrayList;

/**
 *
 * @author ANDRES GARCES
 */
public class HelperImpresion {

    public static void ImprimirPersona(ArrayList<Persona> lspersonas) {
        for (int i = 0; i < lspersonas.size(); i++) {

            System.out.println("El Nombre de la Persona es:" + "\t" + lspersonas.get(i).getNombre());
            System.out.println("El Apellido de la Persona es:" + "\t" + lspersonas.get(i).getApellido());
            System.out.println("La Cédula de la Persona es: " + "\t" + lspersonas.get(i).getCedula());
            System.out.println("La Dirección de la Persona es: " + "\t" + lspersonas.get(i).getDireccion());
            System.out.println("\n");
            

            for (int j = 0; j < lspersonas.get(i).getLsPC().size(); j++) {
                System.out.println("Computador" + "\t" + (j + 1) + "\n");
                System.out.println("La Marca del Computador es:" + "\t" + lspersonas.get(i).getLsPC().get(j).getMarca());
                System.out.println("El Serial del Computador es: " + "\t" + lspersonas.get(i).getLsPC().get(j).getSerial());
                System.out.println("El Tamaño del Computador es: " + "\t" + lspersonas.get(i).getLsPC().get(j).getTamaño());
                System.out.println("El Color del Computador es: " + "\t" + lspersonas.get(i).getLsPC().get(j).getColor());
                System.out.println("\n");
            }
        }
    }

    public static void ImprimirPersonaBuscada(ArrayList<Persona> lspersonas, String CC_buscar) {
        int bandera = 0;
        for (int i = 0; i < lspersonas.size(); i++) {

            if (CC_buscar.equals(lspersonas.get(i).getCedula())) {
                bandera = 1;
                System.out.println("El Nombre de la Persona es:" + "\t" + lspersonas.get(i).getNombre());
                System.out.println("El Apellido de la Persona es:" + "\t" + lspersonas.get(i).getApellido());
                System.out.println("La Cédula de la Persona es: " + "\t" + lspersonas.get(i).getCedula());
                System.out.println("La Dirección de la Persona es: " + "\t" + lspersonas.get(i).getDireccion());
                System.out.println("\n");

                for (int j = 0; j < lspersonas.get(i).getLsPC().size(); j++) {
                    System.out.println("Computador" + "\t" + (j + 1) + "\n");
                    System.out.println("La Marca del Computador es:" + "\t" + lspersonas.get(i).getLsPC().get(j).getMarca());
                    System.out.println("El Serial del Computador es: " + "\t" + lspersonas.get(i).getLsPC().get(j).getSerial());
                    System.out.println("El Tamaño del Computador es: " + "\t" + lspersonas.get(i).getLsPC().get(j).getTamaño());
                    System.out.println("El Color del Computador es: " + "\t" + lspersonas.get(i).getLsPC().get(j).getColor());
                    System.out.println("\n");
                }
            }
        }
        if (bandera == 0) {
            System.out.println("La Cédula no existe");
        }

    }
}
