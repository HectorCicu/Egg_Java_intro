package Egg.Guia2.Java;

import java.util.Scanner;

/**
 * Simular la división usando solamente restas. Dados dos números enteros
 * mayores que uno, realizar un algoritmo que calcule el cociente y el residuo
 * usando sólo restas. Método: Restar el dividendo del divisor hasta obtener un
 * resultado menor que el divisor, este resultado es el residuo, y el número de
 * restas realizadas es el cociente. Por ejemplo: 50 / 13: 50 – 13 = 37 una
 * resta realizada 37 – 13 = 24 dos restas realizadas 24 – 13 = 11 tres restas
 * realizadas dado que 11 es menor que 13, entonces: el residuo es 11 y el
 * cociente es 3. ¿Aún no lo entendiste? Recomendamos googlear división con
 * restas sucesivas.
 *
 * @author Temporal
 */
public class Ejercicio_09_Guia2_Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        int cociente = 0, residuo = 0, dividendo, divisor;
        do {
            System.out.print("Ingrese el dividendo: ");
            dividendo = lee.nextInt();
        } while (dividendo <= 0);
        do {
            System.out.print("Ingrese el diivsor: ");
            divisor = lee.nextInt();
        } while (divisor <= 0);

        while (dividendo >= divisor) {
            ++cociente;
            dividendo -= divisor;

        }
        System.out.println("\nEl cociente de la división es: " + cociente);
        System.out.println("El resto de la división es : " + (dividendo));
    }

}
