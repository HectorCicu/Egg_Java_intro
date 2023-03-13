package Egg.Guia2.Java;

/**
 * Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los
 * números del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca
 * un 3 lo sustituya por una E. Ejemplo: 0-0-0 0-0-1 0-0-2 0-0-E 0-0-4 0-1-2
 * 0-1-E Nota: investigar función equals() y como convertir números a String.
 *
 * @author Temporal
 */
public class Ejercicio_12_Guia2_Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        for (int i = 0; i <= 9; ++i) {
            for (int j = 0; j <= 9; ++j) {
                for (int k = 0; k <= 9; ++k) {

                    System.out.println(Integer.toString(i).replace("3", "E") + " " + Integer.toString(j).replace("3", "E") + " " + Integer.toString(k).replace("3", "E"));
                }
            }

        }
    }

}
