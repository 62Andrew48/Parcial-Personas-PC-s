/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Helpers.HelperImpresion;
import Helpers.HelperRegistrarPersona;
import Helpers.HelperValidacion;
import Helpers.HelperValidacionOpcion;
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

        int opc = 0, cantPC = 0;
        String nombre, apellido, cedula, direccion, marca, serial, tamaño, color;
        String CC_buscar;
        int retorno, caracter_e;
        boolean rta, rtm;
        int rtas, conteo;

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
                    System.out.println("Error al digitar una de las Opciones");
                }
                scan.nextLine();
            } while (opc <= 0);

            switch (opc) {
                case 1:

                    System.out.println();
                    //Nombre de la Persona
                    System.out.print("Digite el Nombre de la Persona: ");
                    nombre = scan.nextLine();
                    rtas = HelperValidacionOpcion.ValidarVacio(nombre);

                    while (rtas > 0) {
                        System.out.print("Digite nuevamente, el Nombre de la Persona: ");
                        nombre = scan.nextLine();
                        rtas = HelperValidacionOpcion.ValidarVacio(nombre);
                    }
                    conteo = HelperValidacionOpcion.ValidarTodoLetra(nombre);

                    while (conteo != 0) {
                        System.out.print("Digite nuevamente, el Nombre de la Persona: ");
                        nombre = scan.nextLine();
                        conteo = HelperValidacionOpcion.ValidarTodoLetra(nombre);
                    }//Termina Nombre

                    //Apellido de la Persona
                    System.out.print("Digite el Apellido de la Persona: ");
                    apellido = scan.nextLine();
                    rtas = HelperValidacionOpcion.ValidarVacio(apellido);

                    while (rtas > 0) {
                        System.out.print("Digite nuevamente, el Apellido de la Persona: ");
                        apellido = scan.nextLine();
                        rtas = HelperValidacionOpcion.ValidarVacio(apellido);
                    }
                    conteo = HelperValidacionOpcion.ValidarTodoLetra(apellido);

                    while (conteo != 0) {
                        System.out.print("Digite nuevamente, el Apellido de la Persona: ");
                        apellido = scan.nextLine();
                        conteo = HelperValidacionOpcion.ValidarTodoLetra(apellido);
                    }//Termina Apellido

                    //Cédula de la Persona
                    System.out.print("Digite la Cédula de la Persona: ");
                    cedula = scan.nextLine();
                    rtas = HelperValidacionOpcion.ValidarVacio(cedula);

                    while (rtas < 0) {
                        System.out.print("Digite nuevamente, la Cédula de la Persona: ");
                        cedula = scan.nextLine();
                        rtas = HelperValidacionOpcion.ValidarVacio(cedula);
                    }
                    conteo = HelperValidacionOpcion.ValidarTodoNum(cedula);

                    while (conteo != 0) {
                        System.out.print("Digite nuevamente, la Cédula de la Persona: ");
                        cedula = scan.nextLine();
                        conteo = HelperValidacionOpcion.ValidarTodoNum(cedula);
                    }//Termina Cédula

                    //Dirección de la Persona
                    System.out.print("Digite la Dirección de la Persona: ");
                    direccion = scan.nextLine();
                    rtas = HelperValidacionOpcion.ValidarVacio(direccion);

                    while (rtas < 0) {
                        System.out.print("Digite nuevamente, la Dirección de la Persona: ");
                        direccion = scan.nextLine();
                        rtas = HelperValidacionOpcion.ValidarVacio(direccion);
                    }
                    conteo = HelperValidacion.ValidarTodoAddress(direccion);

                    while (conteo != 0) {
                        System.out.print("Digite nuevamente, la Dirección de la Persona: ");
                        conteo = HelperValidacion.ValidarTodoAddress(direccion);
                    }//Termina Dirección

                    ArrayList<Computador> lsPC = new ArrayList<>();

                    //Cantidad de Computadores
                    do {
                        try {
                            System.out.println("Digite la Cantidad de Computadores de la Persona");
                            cantPC = scan.nextInt();

                        } catch (InputMismatchException e) {
                            System.out.println("Error al digitar la Cantidad de Computadores");
                        }
                        scan.nextLine();
                    } while (cantPC <= 0);

                    int vc = HelperValidacion.ValidarCantidadRango(cantPC);

                    //Crear Lista de Computadores
                    if (vc == 1) {
                        for (int i = 0; i < cantPC; i++) {

                            System.out.println();

                            //Inicia Marca del Computador
                            System.out.println("Digite la Marca del Computador" + "\t" + (i + 1));
                            marca = scan.nextLine();
                            rtas = HelperValidacionOpcion.ValidarVacio(marca);

                            while (rtas < 0) {
                                System.out.println("Digite nuevamente, la Marca del Computador" + "\t" + (i + 1));
                                marca = scan.nextLine();
                                rtas = HelperValidacionOpcion.ValidarVacio(marca);
                            }
                            conteo = HelperValidacionOpcion.ValidarTodoLetra(marca);

                            while (conteo != 0) {
                                System.out.println("Digite nuevamente, la Marca del Computador" + "\t" + (i + 1));
                                marca = scan.nextLine();
                                conteo = HelperValidacionOpcion.ValidarTodoLetra(marca);
                            }//Fin Marca del Computador

                            //Inicia Serial del Computador
                            System.out.println("Digite el Serial del Computador" + "\t" + (i + 1));
                            serial = scan.nextLine();
                            rtas = HelperValidacionOpcion.ValidarVacio(serial);

                            while (rtas < 0) {
                                System.out.println("Digite nuevamente, el Serial del Computador" + "\t" + (i + 1));
                                serial = scan.nextLine();
                                rtas = HelperValidacionOpcion.ValidarVacio(serial);
                            }
                            conteo = HelperValidacionOpcion.ValidarTodoSerial(serial);

                            while (conteo != 0) {
                                System.out.println("Digite nuevamente, el Serial del Computador" + "\t" + (i + 1));
                                serial = scan.nextLine();
                                conteo = HelperValidacionOpcion.ValidarTodoSerial(serial);
                            }//Termina Serial del Computador

                            //Inicia Tamaño del Computador
                            System.out.println("El Tamaño del Computador lo digitará en: Grande, Mediano o Pequeño");
                            System.out.println("Digite el Tamaño del Computador" + "\t" + (i + 1));
                            tamaño = scan.nextLine();
                            rtas = HelperValidacionOpcion.ValidarVacio(tamaño);

                            while (rtas < 0) {
                                System.out.println("Digite nuevamente, el Tamaño del Computador" + "\t" + (i + 1));
                                tamaño = scan.nextLine();
                                rtas = HelperValidacionOpcion.ValidarVacio(tamaño);
                            }
                            conteo = HelperValidacion.ValidarTodoTamaño(tamaño);
                            rtm = !HelperValidacion.ValidarTamaño(tamaño);

                            while (conteo != 0 || rtm == true) {
                                System.out.println("Digite nuevamente, el Tamaño del Computador" + "\t" + (i + 1));
                                tamaño = scan.nextLine();
                                conteo = HelperValidacion.ValidarTodoTamaño(tamaño);
                                rtm = !HelperValidacion.ValidarTamaño(tamaño);
                            }//Termina Tamaño del Computador

                            //Inicia Color del Computador
                            System.out.println("Digite el Color del Computador" + "\t" + (i + 1));
                            color = scan.nextLine();

                            rtas = HelperValidacionOpcion.ValidarVacio(color);

                            while (rtas < 0) {
                                System.out.println("Digite nuevamente, el Color del Computador" + "\t" + (i + 1));
                                color = scan.nextLine();
                                rtas = HelperValidacionOpcion.ValidarVacio(color);
                            }
                            conteo = HelperValidacionOpcion.ValidarTodoLetra(color);

                            while (conteo != 0) {
                                System.out.println("Digite nuevamente, el Color del Computador" + "\t" + (i + 1));
                                color = scan.nextLine();
                                conteo = HelperValidacionOpcion.ValidarTodoLetra(color);
                            }//Termina Color del Computador

                            Computador objPC = new Computador(marca, serial, tamaño, color);
                            lsPC.add(objPC);
                        }

                        lsPCglobal = lsPC;
                        lsPC = null;

                    } else {
                        System.out.println("Cantidad Inválida de Computadores");
                        break;
                    }//Fin Cantidad de Computadores

                    //Crear Persona
                    Persona objpersona = new Persona(nombre, apellido, cedula, direccion);

                    //Crear Asociación 
                    objpersona.setLsPC(lsPCglobal);
                    Persona objenviado = HelperRegistrarPersona.RegistrarPersona(objpersona, lsPCglobal);
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
