package Egg.Guia2.Java;

import java.util.Scanner;

/**
 * Realice un programa para que el usuario adivine el resultado de una
 * multiplicación entre dos números generados aleatoriamente entre 0 y 10. El
 * programa debe indicar al usuario si su respuesta es o no correcta. En caso
 * que la respuesta sea incorrecta se debe permitir al usuario ingresar su
 * respuesta nuevamente. Para realizar este ejercicio investigue como utilizar
 * la función Math.random() de Java.
 *
 * @author Temporal
 */
public class Ejercicio_10_Guia2_Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        int adivino = 0;
        int num1 = (int) (10 * Math.random());
        int num2 = (int) (10 * Math.random());
        
        int multiplica = num1 * num2;
        
        do{
            
            System.out.print("Adivine el resultado de la multiplicación: ");
            adivino = lee.nextInt();
            
            if (adivino > multiplica) {
                System.out.println("\nEl número ingresado es mayor al total, reintente");
            }else if (adivino < multiplica){
                System.out.println("\nEl número ingresado es menor al total, reintente");
            }
            
        } while (adivino != multiplica);
        
        System.out.println("\n¡Felicitaciones!, ha adivinado la respuesta. Los números son " + num1 + " y " + num2 + "\n");
                
        
    }

}
