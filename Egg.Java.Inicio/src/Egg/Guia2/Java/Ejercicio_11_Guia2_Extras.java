package Egg.Guia2.Java;

import java.util.Scanner;

/**
 * Escribir un programa que lea un número entero y devuelva el número de dígitos
 * que componen ese número. Por ejemplo, si introducimos el número 12345, el
 * programa deberá devolver 5. Calcular la cantidad de dígitos matemáticamente
 * utilizando el operador de división. Nota: recordar que las variables de tipo
 * entero truncan los números o resultados.
 *
 * @author Temporal
 */
public class Ejercicio_11_Guia2_Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        double num = 0;
        int digitos = 0;
        do {
        System.out.print("Ingrese un número: ");
        num = lee.nextDouble();
        } while(num < 0);
        
        do{
            
            num =  num/10;
            ++digitos;
        }while(num >= 1);
        
        System.out.println("La cantidad de dígitos que tiene el número es " + digitos + "\n" );
    }

}
