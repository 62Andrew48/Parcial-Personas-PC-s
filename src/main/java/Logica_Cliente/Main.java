/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Helpers.HelperImpresion;
import Helpers.HelperRegistrarPersona;
import Helpers.HelperValidacion;
import Logica_Negocio.Computador;
import Logica_Negocio.Persona;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ANDRES GARCES
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int opc = 0, cantPC;
        String nombre, apellido, cedula, direccion, marca, serial, tamaño, color, CC_buscar;
        int retorno, caracter_e;
        boolean rta, rtm;

        Scanner scan = new Scanner(System.in);

        ArrayList<Computador> lsPCglobal = null;
        ArrayList<Persona> lspersonas = new ArrayList<>();

        do {
            System.out.println();
            System.out.println("MENÚ DE OPCIONES");
            System.out.println("1. Registrar Persona");
            System.out.println("2. Visualizar Persona");
            System.out.println("3. Consultar Persona");
            System.out.println("4. Salir");

            do {
                try {
                    System.out.print("Digite una opción válida: ");
                    opc = scan.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Error");
                }
                scan.nextLine();
            } while (opc <= 0);

            switch (opc) {
                case 1:

                    System.out.println();
                    //Nombre de la Persona
                    System.out.print("Digite el Nombre de la Persona: ");
                    nombre = scan.nextLine();
                    rta = HelperValidacion.ValidarVacio(nombre);

                    while (rta) {
                        System.out.print("Digite nuevamente, el Nombre de la Persona: ");
                        nombre = scan.nextLine();
                        rta = HelperValidacion.ValidarVacio(nombre);
                    }
                    rta = HelperValidacion.ValidarVacio(nombre);
                    retorno = HelperValidacion.RetornarValor(nombre);
                    caracter_e = HelperValidacion.RetornarCE(nombre);

                    while (retorno != 0 || rta == true || caracter_e != 0) {
                        System.out.print("Digite nuevamente, el Nombre de la Persona: ");
                        nombre = scan.nextLine();
                        rta = HelperValidacion.ValidarVacio(nombre);
                        retorno = HelperValidacion.RetornarValor(nombre);
                        caracter_e = HelperValidacion.RetornarCE(nombre);
                    }//Termina Nombre

                    //Apellido de la Persona
                    System.out.print("Digite el Apellido de la Persona: ");
                    apellido = scan.nextLine();
                    rta = HelperValidacion.ValidarVacio(apellido);

                    while (rta) {
                        System.out.print("Digite nuevamente, el Apellido de la Persona: ");
                        apellido = scan.nextLine();
                        rta = HelperValidacion.ValidarVacio(apellido);
                    }
                    rta = HelperValidacion.ValidarVacio(apellido);
                    retorno = HelperValidacion.RetornarValor(apellido);
                    caracter_e = HelperValidacion.RetornarCE(apellido);

                    while (retorno != 0 || rta == true || caracter_e != 0) {
                        System.out.print("Digite nuevamente, el Apellido de la Persona: ");
                        apellido = scan.nextLine();
                        rta = HelperValidacion.ValidarVacio(apellido);
                        retorno = HelperValidacion.RetornarValor(apellido);
                        caracter_e = HelperValidacion.RetornarCE(apellido);
                    }//Termina Apellido

                    //Cédula de la Persona
                    System.out.print("Digite la Cédula de la Persona: ");
                    cedula = scan.nextLine();
                    rta = HelperValidacion.ValidarVacio(cedula);

                    while (rta) {
                        System.out.print("Digite nuevamente, la Cédula de la Persona: ");
                        cedula = scan.nextLine();
                        rta = HelperValidacion.ValidarVacio(cedula);
                    }
                    rta = HelperValidacion.ValidarVacio(cedula);
                    retorno = HelperValidacion.RetornarLetra(cedula);
                    caracter_e = HelperValidacion.RetornarCE(cedula);

                    while (retorno != 0 || rta == true || caracter_e != 0) {
                        System.out.print("Digite nuevamente, la Cédula de la Persona: ");
                        cedula = scan.nextLine();
                        rta = HelperValidacion.ValidarVacio(cedula);
                        retorno = HelperValidacion.RetornarLetra(cedula);
                        caracter_e = HelperValidacion.RetornarCE(cedula);
                    }//Termina Cédula

                    //Dirección de la Persona
                    System.out.print("Digite la Dirección de la Persona: ");
                    direccion = scan.nextLine();
                    rta = HelperValidacion.ValidarVacio(direccion);

                    while (rta) {
                        System.out.print("Digite nuevamente, la Dirección de la Persona: ");
                        direccion = scan.nextLine();
                        rta = HelperValidacion.ValidarVacio(direccion);
                    }
                    rta = HelperValidacion.ValidarVacio(direccion);
                    caracter_e = HelperValidacion.RetornarCE_Address(direccion);

                    while (retorno != 0 || rta == true || caracter_e != 0) {
                        System.out.print("Digite nuevamente, la Dirección de la Persona: ");
                        direccion = scan.nextLine();
                        rta = HelperValidacion.ValidarVacio(direccion);
                        caracter_e = HelperValidacion.RetornarCE_Address(direccion);
                    }//Termina Dirección

                    ArrayList<Computador> lsPC = new ArrayList<>();

                    //Cantidad de Computadores
                    System.out.print("Digite la cantidad de Computadores de la Persona: ");
                    cantPC = scan.nextInt();

                    scan.nextLine();

                    int vc = HelperValidacion.ValidarCantidadRango(cantPC);

                    //Crear Lista de Computadores
                    if (vc == 1) {
                        for (int i = 0; i < cantPC; i++) {

                            System.out.println();

                            //Inicia Marca del Computador
                            System.out.println("Digite la Marca del Computador" + "\t" + (i + 1));
                            marca = scan.nextLine();
                            rta = HelperValidacion.ValidarVacio(marca);

                            while (rta) {
                                System.out.println("Digite nuevamente, la Marca del Computador" + "\t" + (i + 1));
                                marca = scan.nextLine();
                                rta = HelperValidacion.ValidarVacio(marca);
                            }
                            rta = HelperValidacion.ValidarVacio(marca);
                            retorno = HelperValidacion.RetornarValor(marca);
                            caracter_e = HelperValidacion.RetornarCE(marca);

                            while (retorno != 0 || rta == true || caracter_e != 0) {
                                System.out.println("Digite nuevamente, la Marca del Computador" + "\t" + (i + 1));
                                marca = scan.nextLine();
                                rta = HelperValidacion.ValidarVacio(marca);
                                retorno = HelperValidacion.RetornarValor(marca);
                                caracter_e = HelperValidacion.RetornarCE(marca);
                            }//Fin Marca del Computador

                            //Inicia Serial del Computador
                            System.out.println("Digite el Serial del Computador" + "\t" + (i + 1));
                            serial = scan.nextLine();

                            rta = HelperValidacion.ValidarVacio(serial);

                            while (rta) {
                                System.out.println("Digite nuevamente, el Serial del Computador" + "\t" + (i + 1));
                                serial = scan.nextLine();
                                rta = HelperValidacion.ValidarVacio(serial);
                            }
                            rta = HelperValidacion.ValidarVacio(serial);
                            caracter_e = HelperValidacion.RetornarCE(serial);

                            while (rta == true || caracter_e != 0) {
                                System.out.println("Digite nuevamente, el Serial del Computador" + "\t" + (i + 1));
                                serial = scan.nextLine();
                                rta = HelperValidacion.ValidarVacio(serial);
                                caracter_e = HelperValidacion.RetornarCE(serial);
                            }//Termina Serial del Computador

                            //Inicia Tamaño del Computador
                            System.out.println("El Tamaño del Computador lo digitará en: Grande, Mediano o Pequeño");
                            System.out.println("Digite el Tamaño del Computador" + "\t" + (i + 1));
                            tamaño = scan.nextLine();

                            rta = HelperValidacion.ValidarVacio(tamaño);

                            while (rta) {
                                System.out.println("Digite nuevamente, el Tamaño del Computador" + "\t" + (i + 1));
                                tamaño = scan.nextLine();
                                rta = HelperValidacion.ValidarVacio(tamaño);
                            }
                            rta = HelperValidacion.ValidarVacio(tamaño);
                            retorno = HelperValidacion.RetornarValor(tamaño);
                            caracter_e = HelperValidacion.RetornarCE(tamaño);
                            rtm = !HelperValidacion.ValidarTamaño(tamaño);

                            while (rta == true || retorno != 0 || caracter_e != 0 || rtm == true) {
                                System.out.println("Digite nuevamente, el Tamaño del Computador" + "\t" + (i + 1));
                                tamaño = scan.nextLine();
                                rta = HelperValidacion.ValidarVacio(tamaño);
                                retorno = HelperValidacion.RetornarValor(tamaño);
                                caracter_e = HelperValidacion.RetornarCE(tamaño);
                                rtm = !HelperValidacion.ValidarTamaño(tamaño);
                            }//Termina Tamaño del Computador

                            //Inicia Color del Computador
                            System.out.println("Digite el Color del Computador" + "\t" + (i + 1));
                            color = scan.nextLine();

                            rta = HelperValidacion.ValidarVacio(color);

                            while (rta) {
                                System.out.println("Digite nuevamente, el Color del Computador" + "\t" + (i + 1));
                                color = scan.nextLine();
                                rta = HelperValidacion.ValidarVacio(color);
                            }
                            rta = HelperValidacion.ValidarVacio(color);
                            retorno = HelperValidacion.RetornarValor(color);
                            caracter_e = HelperValidacion.RetornarCE(color);

                            while (retorno != 0 || rta == true || caracter_e != 0) {
                                System.out.println("Digite nuevamente, el Color del Computador" + "\t" + (i + 1));
                                color = scan.nextLine();
                                rta = HelperValidacion.ValidarVacio(color);
                                retorno = HelperValidacion.RetornarValor(color);
                                caracter_e = HelperValidacion.RetornarCE(color);
                            }//Termina Color del Computador

                            Computador objPC = new Computador(marca, serial, tamaño, color);
                            lsPC.add(objPC);
                        }

                        lsPCglobal = lsPC;
                        lsPC = null;

                    } else {
                        System.out.println("Cantidad Inválida");
                        break;
                    }//Fin Cantidad de Computadores

                    //Crear Persona
                    Persona objpersona = new Persona(nombre, apellido, cedula, direccion);

                    //Crear Asociación 
                    objpersona.setLsPC(lsPCglobal);
                    lspersonas.add(objpersona);
                    break;

                case 2:

                    System.out.println();
                    if (!lspersonas.isEmpty()) {
                        HelperImpresion.ImprimirPersona(lspersonas);
                    } else {
                        System.out.println("La Lista de Personas no está Llena");
                    }
                    break;

                case 3:

                    System.out.println();
                    System.out.print("Dígite la Cédula de la Persona a Buscar: ");
                    CC_buscar = scan.nextLine();
                    if (!lspersonas.isEmpty()) {
                        HelperImpresion.ImprimirPersonaBuscada(lspersonas, CC_buscar);
                    } else {
                        System.out.println("La Lista de Personas no está Llena");
                    }
                    break;
            }
        } while (opc != 4);

    }
}
