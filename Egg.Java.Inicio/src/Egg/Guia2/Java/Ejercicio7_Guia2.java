package Egg.Guia2.Java;

import java.util.Scanner;

/**
 * Realizar un programa que simule el funcionamiento de un dispositivo RS232,
 * este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas
 * deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres
 * de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
 * Las secuencias leídas que respeten el formato se consideran correctas, la
 * secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y
 * toda secuencia distinta de FDE, que no respete el formato se considera
 * incorrecta. Al finalizar el proceso, se imprime un informe indicando la
 * cantidad de lecturas correctas e incorrectas recibidas. Para resolver el
 * ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java
 * Substring(), Length(), equals().
 *
 * @author Temporal
 */
public class Ejercicio7_Guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        int correctas = 0, incorrectas = 0;
        String rs232;

        do {
            System.out.print("\nIngrese un comando RS232: ");
            rs232 = lee.next();

            if (rs232.equals("&&&&&")) {
                break;

            } else if (rs232.length() != 5 || !rs232.substring(0, 1).equals("X") || !rs232.substring(4, 5).equals("O")) {
                ++incorrectas;
            } else {
                ++correctas;
            }

        } while (!rs232.equals("&&&&&"));

        System.out.println("\nLa cantidad de comandos correctos fueron > " + correctas);
        System.out.println("\nLa cantidad de comandos incorrectos fueron > " + incorrectas  + "\n");

    }
}
