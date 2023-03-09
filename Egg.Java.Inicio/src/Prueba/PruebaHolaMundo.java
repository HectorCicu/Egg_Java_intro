
package Prueba;

import java.util.Scanner;

/**
 *
 * @author Temporal
 */
public class PruebaHolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nombre;
        int  edad;
        
        
        Scanner lee = new Scanner(System.in);
        
        System.out.println("Escriba su nombre:   ");
        
        nombre = lee.next();
        
        System.out.println("Ingrese su edad:");
        edad = lee.nextInt();
        
        
        
        System.out.println("Hola Mundo, soy " + nombre + " y tengo " + edad + " años.  Buenas tardes");
        
       
    }

}
