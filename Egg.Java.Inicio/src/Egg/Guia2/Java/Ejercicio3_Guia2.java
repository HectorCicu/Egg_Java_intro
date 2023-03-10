package Egg.Guia2.Java;

import java.util.Scanner;

/**
 * Realizar un programa que solo permita introducir solo frases o palabras de 8
 * de largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá
 * de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario,
 * se deberá imprimir “INCORRECTO”. Nota: investigar la función Lenght() en
 * Java.
 *
 * @author Temporal
 */
public class Ejercicio3_Guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner lee = new Scanner(System.in);
        
        System.out.println("Ingrese una frase o una palabra ");
                
       String frase = lee.nextLine();
       
       if (frase.length() == 8)
            System.out.println("CORRECTO");
       else
            System.out.println("INCORRECTO");
        
        
    }

}
