/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

import java.util.ArrayList;

/**
 *
 * @author ANDRES GARCES
 */
public class HelperValidacion {

    public static int RetornarValor(String nombre) {
        int numero = 0;
        int letra = 0;

        for (int j = 0; j < nombre.length(); j++) {
            boolean flag = Character.isDigit(nombre.charAt(j));
            if (flag) {
                //System.out.println("'"+ nombre.charAt(j)+"' is a number");
                numero++;
            } else {
                //System.out.println("'"+ nombre.charAt(j)+"' is a letter");
                letra++;
            }

        }
        return numero;
    }

    public static int RetornarCE(String nombre) {
        int ce = 0;

        ArrayList<Character> lscaracteres = new ArrayList<>();

        lscaracteres.add('-');
        lscaracteres.add('.');
        lscaracteres.add('#');
        lscaracteres.add('~');
        lscaracteres.add('/');
        lscaracteres.add(';');
        lscaracteres.add(':');
        lscaracteres.add('"');
        lscaracteres.add('!');
        lscaracteres.add('º');
        lscaracteres.add('¬');
        lscaracteres.add('|');
        lscaracteres.add('?');
        lscaracteres.add('¿');
        lscaracteres.add('&');
        lscaracteres.add('%');
        lscaracteres.add('$');
        lscaracteres.add('_');
        lscaracteres.add('*');
        lscaracteres.add('<');
        lscaracteres.add('>');
        lscaracteres.add('€');
        lscaracteres.add('Ç');
        lscaracteres.add('+');
        lscaracteres.add('(');
        lscaracteres.add(')');
        lscaracteres.add('»');
        lscaracteres.add('¥');
        lscaracteres.add('«');
        lscaracteres.add('¶');
        lscaracteres.add('[');
        lscaracteres.add(']');
        lscaracteres.add('{');
        lscaracteres.add('}');
        lscaracteres.add('÷');
        lscaracteres.add('=');
        lscaracteres.add(',');
        lscaracteres.add('@');

        for (int j = 0; j < nombre.length(); j++) {
            boolean flag = Character.isLetter(nombre.charAt(j));
            if (!flag) {
                for (int i = 0; i < lscaracteres.size(); i++) {

                    if (lscaracteres.get(i).compareTo(nombre.charAt(j)) == 0) {
                        ce++;
                    }
                }
            }
        }
        return ce;
    }

    public static int RetornarCE_Address(String dirección) {
        int ce = 0;

        ArrayList<Character> lscaracteres = new ArrayList<>();

        lscaracteres.add('~');
        lscaracteres.add('/');
        lscaracteres.add(';');
        lscaracteres.add(':');
        lscaracteres.add('"');
        lscaracteres.add('!');
        lscaracteres.add('º');
        lscaracteres.add('¬');
        lscaracteres.add('|');
        lscaracteres.add('?');
        lscaracteres.add('¿');
        lscaracteres.add('&');
        lscaracteres.add('%');
        lscaracteres.add('$');
        lscaracteres.add('_');
        lscaracteres.add('*');
        lscaracteres.add('<');
        lscaracteres.add('>');
        lscaracteres.add('€');
        lscaracteres.add('Ç');
        lscaracteres.add('+');
        lscaracteres.add('(');
        lscaracteres.add(')');
        lscaracteres.add('»');
        lscaracteres.add('¥');
        lscaracteres.add('«');
        lscaracteres.add('¶');
        lscaracteres.add('[');
        lscaracteres.add(']');
        lscaracteres.add('{');
        lscaracteres.add('}');
        lscaracteres.add('÷');
        lscaracteres.add('=');
        lscaracteres.add(',');
        lscaracteres.add('@');

        for (int j = 0; j < dirección.length(); j++) {
            boolean flag = Character.isLetter(dirección.charAt(j));
            if (!flag) {
                for (int i = 0; i < lscaracteres.size(); i++) {

                    if (lscaracteres.get(i).compareTo(dirección.charAt(j)) == 0) {
                        ce++;
                    }
                }
            }
        }
        return ce;
    }

    public static boolean ValidarVacio(String cadena) {
        if (cadena.equals("")) {
            return true;
        } else {
            return false;
        }

    }

    public static int RetornarLetra(String nombre) {
        int numero = 0;
        int letra = 0;

        for (int j = 0; j < nombre.length(); j++) {
            boolean flag = Character.isDigit(nombre.charAt(j));
            if (flag) {
                //System.out.println("'"+ nombre.charAt(j)+"' is a number");
                numero++;
            } else {
                //System.out.println("'"+ nombre.charAt(j)+"' is a letter");
                letra++;
            }

        }
        return letra;
    }

    public static int ValidarCantidadRango(int cantidad) {
        if (cantidad > 0 && cantidad < 1000) {
            return 1;
        } else {
            return 0;
        }
    }

    public static boolean ValidarTamaño(String medida) {
        String primeraLetraMayus = medida.substring(0, 1).toUpperCase();
        String restoMinus = medida.substring(1).toLowerCase();

        String resultado = primeraLetraMayus + restoMinus;

        if (resultado.equals("Grande") || resultado.equals("Mediano")
                || resultado.equals("Pequeño")) {
            return true;
        } else {
            return false;
        }
    }
    
    public static String MayusYminus(String nombre) {
        String primeraLetraMayus = nombre.substring(0, 1).toUpperCase();
        String restoMinus = nombre.substring(1).toLowerCase();
        
        String resultado = primeraLetraMayus + restoMinus;
        return resultado;
    }
    
    public static String SerialMayus(String serial) {
        String resultado = serial.toUpperCase();
        
        return resultado;
    }
}
