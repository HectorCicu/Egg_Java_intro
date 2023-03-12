package Egg.Guia2.Java;

import java.util.Scanner;

/**
 * Leer la altura de N personas y determinar el promedio de estaturas que se
 * encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
 *
 * @author Temporal
 */
public class Ejercicio_06_Guia2_Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner lee = new Scanner(System.in);
        int personas, bajo160 = 0;
        double estatura, alturaGral= 0, alturaBajo = 0;

        System.out.print("Igrese la cantidad de personas a medir: ");

        personas = lee.nextInt();

        for (int i = 1; i <= personas; ++i) {
            System.out.print("\nAltura de la persona " + i + " --> ");
            estatura = lee.nextDouble();
            if (estatura < 1.60) {
                alturaBajo += estatura;
                ++bajo160;

            }
alturaGral += estatura;

        }
        System.out.println("\nEl promedio general de estatura es : " + (alturaGral / personas));
        System.out.println("El promedio de estatura de personas menores a 1,60m es: " + (alturaBajo / bajo160));
        System.out.println("La cantidad de personas de estatura menor a 1,60m es: " + bajo160);
    }
}


