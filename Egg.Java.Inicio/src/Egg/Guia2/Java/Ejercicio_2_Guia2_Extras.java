package Egg.Guia2.Java;

import java.util.Scanner;

/**
 * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
 * diferente a cada una. A continuación, realizar las instrucciones necesarias
 * para que: B tome el valor de C, C tome el valor de A, A tome el valor de D y
 * D tome el valor de B. Mostrar los valores iniciales y los valores finales de
 * cada variable. Utilizar sólo una variable auxiliar.
 *
 *
 * @author Temporal
 */
public class Ejercicio_2_Guia2_Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        int a,b,c,d, aux;

        System.out.print("Ingrese el valor para A: ");
        a = lee.nextInt();
        System.out.print("Ingrese el valor para B: ");
        b = lee.nextInt();
        System.out.print("Ingrese el valor para C: ");
        c = lee.nextInt();
        System.out.print("Ingrese el valor para D: ");
        d = lee.nextInt();

        System.out.println("\nEl valor original de A ->  " + a);
        
        System.out.println("El valor original de B ->  " + b);
        
        System.out.println("El valor original de C ->  " + c);
       
        System.out.println("El valor original de D ->  " + d);
        
        aux = b;
        b = c;
        c = a;
        a = d;
        d = aux;
        
        System.out.println("\nEl nuevo valor de A es -->> " + a);  
        System.out.println("El nuevo valor de B es -->> " + b);  
        System.out.println("El nuevo valor de C es -->> " + c);  
        System.out.println("El nuevo valor de D es -->> " + d + "\n");  
       
    }

}
