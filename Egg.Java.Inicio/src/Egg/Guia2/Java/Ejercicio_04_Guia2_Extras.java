package Egg.Guia2.Java;

import java.util.Scanner;

/**
 * Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
 * muestre su equivalente en romano.
 *
 * @author Temporal
 */
public class Ejercicio_04_Guia2_Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        String romano = "";
        int num;
        do {
            System.out.print("Ingrese un número entre 1 y 10 para convertirlo en romano: ");
            num = lee.nextInt();
        } while (num < 1 || num > 10);
        switch (num) {
            case 1:
                romano = "I";
                break;
            case 2:
                romano = "II";
                break;
            case 3:
                romano = "III";
                break;
            case 4:
                romano = "IV";
                break;
            case 5:
                romano = "V";
                break;
            case 6:
                romano = "VI";
                break;
            case 7:
                romano = "VII";
                break;
            case 8:
                romano = "VIII";
                break;
            case 9:
                romano = "IX";
                break;
            case 10:
                romano = "X";
                break;
        }
        System.out.println("\nEl equivalente en romano del número  " + num + " es -> "+ romano + "\n");
    }

}
