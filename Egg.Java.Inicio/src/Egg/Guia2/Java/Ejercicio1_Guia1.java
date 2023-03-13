package Egg.Guia2.Java;

import java.util.Scanner;

/**
 *
 * @author Temporal
 */
public class Ejercicio1_Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);

        int var1, var2, suma;

        System.out.println("Escriba dos números : ");
        var1 = lee.nextInt();
        var2 = lee.nextInt();
        suma = var1 + var2;
        System.out.println("La suma de los números es ->   " + (var1 + var2));

        System.out.println("Los núneros ingresados son " + (var1 + var2 + suma));
        
        float flotante;
        double doble;
        char uno = '\u0000';
        char dos  = 'a';
        flotante =  (float) (10.000/3.0000);
        doble  =   10.000/3.000;
        
        System.out.println("flotante " + flotante);
        System.out.println("Doble " + doble);
        System.out.println(uno);
        System.out.println(dos);

    }

}
