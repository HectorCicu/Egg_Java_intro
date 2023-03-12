package Egg.Guia2.Java;

import java.util.Scanner;

/**
 * Realice un programa que calcule y visualice el valor máximo, el valor mínimo
 * y el promedio de n números (n>0). El valor de n se solicitará al principio
 * del programa y los números serán introducidos por el usuario. Realice dos
 * versiones del programa, una usando el bucle “while” y otra con el bucle “do -
 * while”.
 *
 * @author Temporal
 */
public class Ejercicio_07_Guia2_Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner lee = new Scanner(System.in);
        int totalNum;
        double num, totales = 0, maximo = 0, minimo = 0;
        

        System.out.print("Ingrese cantidad de números a promediar: ");
        totalNum = lee.nextInt();

        for (int i = 1; i <= totalNum; ++i) {
            do {
                System.out.print("Ingrese el valor ( " + i + " de " + totalNum + ")  -> ");
                num = lee.nextDouble();
            } while (num <= 0);
            if (i == 1) {
                maximo = num;
                minimo = num;
            }
            totales += num;
            if (maximo < num) {
                maximo = num;
            }
            if (minimo > num) {
                minimo = num;
            }
        }

        System.out.println("\nEl valor máximo ingresado es -> " + maximo);
        System.out.println("El valor mínimo ingresado es -> " + minimo);
        System.out.println("El promedio de los números ingresados es -> " + (totales / totalNum));
    }

}
