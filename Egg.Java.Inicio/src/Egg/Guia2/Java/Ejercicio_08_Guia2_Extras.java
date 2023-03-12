package Egg.Guia2.Java;

import java.util.Scanner;

/**
 * Escriba un programa que lea números enteros. Si el número es múltiplo de
 * cinco debe detener la lectura y mostrar la cantidad de números leídos, la
 * cantidad de números pares y la cantidad de números impares. Al igual que en
 * el ejercicio anterior los números negativos no deben sumarse. Nota: recordar
 * el uso de la sentencia break.
 *
 * @author Temporal
 */
public class Ejercicio_08_Guia2_Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        int numeros = 0, pares = 0, impares = 0, num = 0;

        do {
            do {
                System.out.print("Ingrese un número (múltiplo de 5 = Sale) -> ");
                num = lee.nextInt();
            } while (num < 1);
            ++numeros;
            if (num % 2 == 0) {
                ++pares;
            } else {
                ++impares;
            }
        } while (num % 5 != 0);
        
        System.out.println("\nLa cantidad total de números ingresados es -> " + numeros);
        
        System.out.println("La cantidad total de números pares  es -> " + pares);
        
        System.out.println("La cantidad total de números impares es -> " + impares);
        
    }

}
