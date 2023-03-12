package Egg.Guia2.Java;

import java.util.Scanner;

/**
 * Una obra social tiene tres clases de socios: Los socios tipo ‘A’ abonan una
 * cuota mayor, pero tienen un 50% de descuento en todos los tipos de
 * tratamientos. Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35%
 * de descuento para los mismos tratamientos que los socios del tipo A. Los
 * socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
 * tratamientos. Solicite una letra (carácter) que representa la clase de un
 * socio, y luego un valor real que represente el costo del tratamiento (previo
 * al descuento) y determine el importe en efectivo a pagar por dicho socio.
 *
 * @author Temporal
 */
public class Ejercicio_05_Guia2_Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        double costoTrat;
        String categ;
        
        do {
        System.out.print("Ingrese la categoría del socio > ");
    categ = lee.next();
        } while (!categ.toUpperCase().equals("A") && !categ.toUpperCase().equals("B")  && !categ.toUpperCase().equals("C") );
        
        do {
            System.out.print("\n Ingrese el costo del tratamiento: ");
            costoTrat = lee.nextDouble();
        }while (costoTrat < 1 );
        
        switch(categ.toUpperCase()){
            case "A":
                costoTrat =  costoTrat * 0.50;
                break;
            case "B":
                costoTrat = 0.65 * costoTrat;
                break;
        }
        System.out.println("\nEl costo de tratamiento, por ser socio categoría  " + categ.toUpperCase() + " es de $ " + costoTrat + "\n");
    }

}
