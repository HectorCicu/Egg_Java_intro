package Egg.Guia2.Java;

import java.util.Scanner;

/*/*
 * Escriba un programa en el cual se ingrese un valor límite positivo, y a
 * continuación solicite números al usuario hasta que la suma de los números
 * introducidos supere el límite inicial.
 *
 * @author Temporal
 **/
public class Ejercicio5_Guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner lee = new Scanner(System.in);
        int limite, suma, num;
        
        System.out.print("Ingrese el número límite:  ");
        limite = lee.nextInt();
        suma = 0;
        
        do {
            System.out.print("\nIngrese un número: ");
            num = lee.nextInt();
            suma +=  num;
            
        }while (suma <= limite);
        
        System.out.println("Superó el límite (" + limite + ") El total ingresado es: "+ suma);
           
        
        
    }

}
