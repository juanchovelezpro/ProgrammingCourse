package retos;

import java.util.Scanner;

/**
 * Hacer un programa que convierta una cantidad de minutos a horas. Si el numero de horas no es exacto entonces se muestran las horas y luego el numero de minutos que restan.
 * <p>
 * Ejemplo:
 * <p>
 * Entrada -> 125
 * Salida -> 2 horas y 5 minutos
 */
public class MinutesToHours {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese una cantidad de minutos");

        int inMinutes = scan.nextInt();
        int hours = inMinutes/60;
        int min = inMinutes%60;

        // Con operador ternario --> condition ? true : false
        String message = inMinutes%60 == 0 ? hours + "h" : hours + "h y " + min + "min";

        System.out.println(message);

    }

}
