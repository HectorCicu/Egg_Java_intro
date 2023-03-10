package Egg.Guia2.Java;

import java.util.Scanner;

/**
 * Realizar un programa que pida dos números enteros positivos por teclado y
 * muestre por pantalla el siguiente menú: El usuario deberá elegir una opción y
 * el programa deberá mostrar el resultado por pantalla y luego volver al menú.
 * El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta
 * que, si el usuario selecciona la opción 5, en vez de salir del programa
 * directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
 * seguro que desea salir del programa (S/N)? Si el usuario selecciona el
 * carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el
 * menú.
 *
 * @author Temporal
 */
public class Ejercicio6_Guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        int  opcion;
        double num1, num2, resultado;

        System.out.print("Ingrese el primer número a operar: ");
        num1 = lee.nextDouble();

        System.out.print("Ingrese el segundo número a operar: ");
        num2 = lee.nextDouble();

        do {

            System.out.println("\nMENU DE OPCIONES");
            System.out.println("-----------------------");
            System.out.println("1 - Sumar");
            System.out.println("2 - Restar");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Salir");
            System.out.print("\nElija la Opción: ");
            opcion = lee.nextInt();

            switch (opcion) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("El resultado de la suma es " + resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("El resultado de la resta es " + resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("El resultado de la multiplicación es " + resultado);
                    break;
                case 4:
                    resultado =  (num1 / num2);
                    System.out.println("El resultado de la división es " + resultado);
                    break;
                case 5:

                    System.out.print("está seguro que quiere salir? (S/N) --> ");
                    String salir = lee.next();
                    if (salir.toUpperCase().equals("S")) {
                        opcion = 5;
                    } else {
                       opcion = 0;
                       
                    }
            }

        } while (opcion != 5);

    }

}
