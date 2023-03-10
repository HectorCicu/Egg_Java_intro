package Egg.Guia2.Java;

import java.util.Scanner;

/**
 * Escriba un programa que pida una frase o palabra y valide si la primera letra
 * de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
 * imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se
 * deberá imprimir “INCORRECTO”. Nota: investigar la función Substring y
 * equals() de Java.
 *
 * @author Temporal
 */
public class Ejercicio4_Guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);

        System.out.print("Ingrese una frase:   ");

        String frase = lee.nextLine();

        String primeraLetra = frase.substring(0, 1).toUpperCase();

        if (primeraLetra.equals("A")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }

    }

}
