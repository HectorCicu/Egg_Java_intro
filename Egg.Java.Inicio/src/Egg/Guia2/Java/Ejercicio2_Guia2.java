package Egg.Guia2.Java;

import java.util.Scanner;

/**
 * Crear un programa que pida una frase y si esa frase es igual a “eureka” el
 * programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
 * Incorrecto. Nota: investigar la función equals() en Java.
 *
 * @author Temporal
 */
public class Ejercicio2_Guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner lee = new Scanner(System.in);
        
        
        System.out.println("Ingrese una palabra:");
        
        String palabra = lee.next();
        
        if (palabra.equals("eureka")) {
            System.out.println("La palabra eureka es correcta ");
        } else {
            System.out.println("La palabra ingresada no es correcta ");
    }
        
        
        
        

    }

}
