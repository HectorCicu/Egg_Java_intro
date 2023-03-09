package Prueba;

import java.util.Scanner;

/**
 * Escribir un programa que pida una frase y la muestre toda en mayúsculas y
 * después toda en minúsculas. Nota: investigar la función toUpperCase() y
 * toLowerCase() en Java.
 *
 * @author Temporal
 */
public class Ejercicio3_guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase;

        Scanner lee = new Scanner(System.in);

        System.out.println("Ingrese una frase: ");
        frase = lee.nextLine();

        System.out.println("Todo en mayúsculas -> " + frase.toUpperCase());
        System.out.println("Todo en minúsculas -> " + frase.toLowerCase());

    }

}
