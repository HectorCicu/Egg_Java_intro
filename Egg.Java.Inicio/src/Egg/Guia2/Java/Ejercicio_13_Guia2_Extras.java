package Egg.Guia2.Java;

import java.util.Scanner;

/**
 * Crear un programa que dibuje una escalera de números, donde cada línea de
 * números comience en uno y termine en el número de la línea. Solicitar la
 * altura de la escalera al usuario al comenzar. Ejemplo: si se ingresa el
 * número 3: 1 12 123
 *
 * @author Temporal
 */
public class Ejercicio_13_Guia2_Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);

        System.out.print("Ingrese cantidad de líneas de la escaleras ->  ");
        int escalera = lee.nextInt();

        String acumula = "";
        for (int i = 1; i <= escalera; ++i) {

            acumula += Integer.toString(i) + " ";

            System.out.println(acumula);
        }

    }

}
