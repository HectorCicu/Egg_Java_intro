package Egg.Guia2.Java;

import java.util.Scanner;

/**
 * Se dispone de un conjunto de N familias, cada una de las cuales tiene una M
 * cantidad de hijos. Escriba un programa que pida la cantidad de familias y
 * para cada familia la cantidad de hijos para averiguar la media de edad de los
 * hijos de todas las familias.
 *
 * @author Temporal
 */
public class Ejercicio_14_Guia2_Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        int a, m = 0, edad, edadAcumula = 0, cantHijos = 0;
        
        
        System.out.print("Ingrese cantidad de familias para evaluar: ");
        a = lee.nextInt();
        
        for (int i = 1 ; i <= a ; ++i){
            System.out.print("\nIngrese la cantidad de hijos de la familia " + i + ": ");
            m = lee.nextInt();
            
            for (int j = 1 ; j <= m;++j) {
                System.out.print("Ingrese la edad del hijo " + j +  " de la familia " + i + ": ");
                edad = lee.nextInt();
                edadAcumula += edad;
                ++cantHijos; 
                
                
            }
        }
        
        System.out.println("\nLa edad promedio de todos los hijos de las familias es: " + (edadAcumula / cantHijos ) + " años.");
    }

}
