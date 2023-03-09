package cursojavaegg;

import java.util.Scanner;

/**
 * Escribir un programa que pida dos números enteros por teclado y calcule la
 * suma de los dos. El programa deberá después mostrar el resultado de la suma
 *
 * @author Temporal
 */
public class CursoJavaEgg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int num1, num2, suma;

        Scanner lee = new Scanner(System.in);

        System.out.println("Ingrese el prmer número para sumar: ");
        num1 = lee.nextInt();

        System.out.print("Ingrese el segundo número para sumar: ");
        num2 = lee.nextInt();

        suma = num1 + num2;

        System.out.println("El total de la operación es -->  " + suma);

        System.out.println("El total de la operacion 2 es -> " + (num1 + num2));

        System.out.println("los valores juntos son  " + num1 + num2);
    }

}
