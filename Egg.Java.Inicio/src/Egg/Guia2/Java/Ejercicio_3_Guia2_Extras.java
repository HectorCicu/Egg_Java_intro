package Egg.Guia2.Java;

import java.util.Scanner;

/**
 * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
 * trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar la
 * función equals() de la clase String.
 *
 * @author Temporal
 */
public class Ejercicio_3_Guia2_Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);

        String letra;
        letra = "";

        do {
            System.out.print("Ingrese una letra para determinar si es vocal o consonante: ");
            letra = lee.next();
        } while (letra.length() != 1);

        if (letra.toUpperCase()
                .equals("A") || letra.toUpperCase().equals("E") || letra.toUpperCase().equals("I") || letra.toUpperCase().equals("O") || letra.toUpperCase().equals("U")) {
            System.out.println("\nLa letra ingresada es una vocal \n");
        } else {
            System.out.println("\nLa letra ingresada es una Consonante \n");
        }

    }

}
