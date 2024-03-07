/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;
import Logica_Negocio.Computador;
import Logica_Negocio.Persona;
import java.util.ArrayList;
/**
 *
 * @author ANDRES GARCES
 */
public class HelperRegistrarPersona {
    
        public static Persona RegistrarPersona(Persona objpersona, ArrayList<Computador>lsPC) {
         //Crear asociacion 
                    objpersona.setLsPC(lsPC);
                    return objpersona;
    }
}
