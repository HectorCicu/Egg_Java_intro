package Egg.Guia2.Java;

import java.util.Scanner;

/**
 * Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
 * ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
 * equivalente: 1 día, 2 horas.
 *
 * @author Temporal
 */
public class Ejercicio_01_Guia2_Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
double  minutos, dias, horas;

        System.out.print("Ingrese los minutos a convertir: ");
    minutos = lee.nextDouble();
    
            dias = (int) (minutos / 1440);
            horas = (int) ((minutos   - (dias * 1440))/60);
            int  minutosRestantes = (int) (minutos - (dias * 1440 + horas * 60));

        System.out.println("\nEl resultado de convertir es: " + dias + " días, " + horas + " horas, " + minutosRestantes + " minutos \n") ;            
              
                    
    
    }

}
